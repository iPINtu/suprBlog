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
 * 索引类 - 索引文件锁问题
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class indexLock {
	
	@Test
	public void indexLock() throws Exception{
			IndexWriterConfig config1 = new IndexWriterConfig(Version.LUCENE_46, LuceneUtil.analyzer);
			IndexWriterConfig config2 = new IndexWriterConfig(Version.LUCENE_46, LuceneUtil.analyzer);
			
			IndexWriter writer1= new IndexWriter(LuceneUtil.directory,config1);
//			writer1.close();
			IndexWriter writer2= new IndexWriter(LuceneUtil.directory,config2);
//			writer2.close();
	}
	
}
