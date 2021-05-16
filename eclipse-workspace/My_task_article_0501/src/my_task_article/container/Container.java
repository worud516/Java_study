package my_task_article.container;

import my_task_article.dao.ArticleDao;
import my_task_article.dao.MemberDao;

public class Container {
	public static ArticleDao articleDao;
	public static MemberDao memberDao;

	static {
		articleDao = new ArticleDao();
		memberDao = new MemberDao();
	}
}
