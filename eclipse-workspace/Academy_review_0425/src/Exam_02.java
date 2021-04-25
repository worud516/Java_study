
// 배열의 장점 : 관련되어 있는 데이터를 묶을 수 있다.
// 배열의 단전 : 한계가 있다. -> arraylist로 해결가능.


import java.util.ArrayList;
import java.util.List;

class Exam_02 {
	public static void main(String[] args) {
		// exam1();
		// exam2();
		// exam3();
		exam4();
	}

	static void exam4() {
		System.out.println("== 예제 4 ==");
		List<Article> articles = new ArrayList<>();
		articles.add(new Article()); // 0
		articles.add(new Article()); // 1
		articles.add(new Article()); // 2
		articles.add(new Article()); // 3
		articles.add(new Article()); // 4

		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			System.out.println(article.id);
		}
	}

	static void exam3() {
		System.out.println("== 예제 3 ==");
		ArrayList<Article> articles = new ArrayList<Article>();
		articles.add(new Article()); // 0
		articles.add(new Article()); // 1
		articles.add(new Article()); // 2
		articles.add(new Article()); // 3
		articles.add(new Article()); // 4

		for (int i = 0; i < articles.size(); i++) {
			Article article = articles.get(i);
			System.out.println(article.id);
		}
	}

	static void exam2() {
		System.out.println("== 예제 2 ==");
		ArrayList articles = new ArrayList();
		articles.add(new Article()); // 0
		articles.add(new Article()); // 1
		articles.add(new Article()); // 2
		articles.add(new Article()); // 3
		articles.add(new Article()); // 4

		for (int i = 0; i < articles.size(); i++) {
			Article article = (Article) articles.get(i);
			System.out.println(article.id);
		}
	}

	static void exam1() {
		System.out.println("== 예제 1 ==");
		int articlesSize = 0;
		Article[] articles = new Article[1000];
		articles[0] = new Article();
		articlesSize++;
		articles[1] = new Article();
		articlesSize++;
		articles[2] = new Article();
		articlesSize++;
		articles[3] = new Article();
		articlesSize++;
		articles[4] = new Article(); // 5

		for (int i = 0; i < articlesSize; i++) {
			System.out.println(articles[i].id);
		}
	}

}

class Article {
	static int lastId; // 0
	int id;
	String regDate;
	static {
		lastId = 0;
	}

	Article() {
		this(lastId + 1, "2020-12-12 12:12:12");
		lastId++;
	}

	Article(int id, String regDate) {
		this.id = id;
		this.regDate = regDate;
	}
}