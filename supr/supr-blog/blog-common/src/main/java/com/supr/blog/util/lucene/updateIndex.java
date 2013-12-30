package com.supr.blog.util.lucene;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.IntField;
import org.apache.lucene.document.LongField;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.util.Version;
import org.junit.Test;

/**
 * 索引类 -更新索引文件
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class updateIndex {
	
	@Test
	public void updateIndex() throws Exception{
		
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_46, LuceneUtil.analyzer);
		IndexWriter writer = new IndexWriter(LuceneUtil.directory,config);
		
		Document doc = new Document();
		doc.add(new LongField("id", 213, Store.YES));
		doc.add(new TextField("name", "root", Store.YES));
		doc.add(new IntField("age", 22, Store.YES));
		writer.updateDocument(new Term("name","admin"), doc);
		writer.close();
	}
	
}
