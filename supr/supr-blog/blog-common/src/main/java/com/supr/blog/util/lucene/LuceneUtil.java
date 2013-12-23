package com.supr.blog.util.lucene;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

public class LuceneUtil {
	
	public static Directory directory;
	
	public static Analyzer analyzer;
	
	static{
		try {
			// 索引库
			directory = FSDirectory.open(new File("./indexDir"));
			// 分词器
			analyzer = new StandardAnalyzer(Version.LUCENE_46);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
