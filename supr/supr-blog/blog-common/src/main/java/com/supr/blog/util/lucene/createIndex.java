package com.supr.blog.util.lucene;

import java.io.IOException;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.IntField;
import org.apache.lucene.document.LongField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.util.Version;
import org.junit.Test;

/**
 * 索引类 - 生成索引文件
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class createIndex {
	
	@Test
	public void buildIndex() throws Exception{
		User user = new User((long) 1d, "admin", 20);
		IndexWriter writer = null;
		
		try {
			IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_46, LuceneUtil.analyzer);
			writer = new IndexWriter(LuceneUtil.directory,config);
			
			// 优化索引文件 
			writer.forceMerge(1);
			
			Document document = new Document();
			document.add(new LongField("id",user.getId(),Store.YES));
			document.add(new TextField("name",user.getName(),Store.YES));
			document.add(new IntField("age",user.getAge(),Store.YES));
			
			// 加入索引库
			writer.addDocument(document);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(null != writer){
				writer.close();
			}
		}
	}
	
}
