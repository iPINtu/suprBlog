package com.supr.blog.util.lucene;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.TopDocs;
import org.junit.Test;

/**
 * 索引类 - 查询索引文件
 * ============================================================================
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.suprblog.com
 * ----------------------------------------------------------------------------
 * ============================================================================
 */
public class searchIndex {
	
	@Test
	public void searchIndex() throws Exception{
		
		IndexSearcher search = new IndexSearcher(DirectoryReader.open(LuceneUtil.directory));
		// 查询条件
		Query query = new TermQuery(new Term("name", "admin"));
		// 查找匹配的前十条记录
		TopDocs topDocs = search.search(query, 10);
		ScoreDoc[] scoreDocs = topDocs.scoreDocs;
		for(ScoreDoc scoreDoc:scoreDocs){
			int docId = scoreDoc.doc;
			Document document  = search.doc(docId);
			
			User user = new User();
			user.setId(Long.parseLong(document.get("id")));
			user.setName(document.get("name"));
			user.setAge(Integer.parseInt(document.get("age")));
			
			System.out.println(user.toString());
		}
	}
	
}
