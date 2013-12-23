package com.supr.blog.util.lucene;

import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.util.Version;
import org.junit.Test;

/**
 * 索引类 - 删除索引文件
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class deleteIndex {
	
	@Test
	public void deleteIndex() throws Exception{
		
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_46, LuceneUtil.analyzer);
		IndexWriter writer = new IndexWriter(LuceneUtil.directory,config);
		
		writer.deleteDocuments(new Term("name", "admin"));
		writer.close();
	}
	
	@Test
	public void deleteAllIndex() throws Exception{
		
		IndexWriterConfig config = new IndexWriterConfig(Version.LUCENE_46, LuceneUtil.analyzer);
		IndexWriter writer = new IndexWriter(LuceneUtil.directory,config);
		
		writer.deleteAll();
		writer.close();
	}
	
}
