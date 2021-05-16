package my_task_article.dao;

import java.util.ArrayList;
import java.util.List;

import my_task_article.dto.Article;

public class ArticleDao {
	public List<Article> articles;

	public ArticleDao() {
		articles = new ArrayList<>();
	}
}
