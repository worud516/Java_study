package my_task_article;


import java.util.Scanner;

import my_task_article.Controller.ArticleController;
import my_task_article.Controller.Controller;
import my_task_article.Controller.MemberController;

public class App {

	public void start() {
		System.out.println("==프로그램 시작==");

		Scanner sc = new Scanner(System.in);

		MemberController memberController = new MemberController(sc);
		ArticleController articleController = new ArticleController(sc);

		articleController.makeTestData();

		while (true) {
			System.out.printf("명령어 ) ");
			String command = sc.nextLine().trim();

			if (command.length() == 0) {
				System.out.println("명령어를 입력해 주세요.");
				continue;
			}
			if (command.equals("system exit")) {
				break;
			}
			String[] commandBits = command.split(" ");

			if (commandBits.length == 1) {
				System.out.println("존재하지 않는 명령어입니다.");
				continue;
			}

			String controllerName = commandBits[0];
			String actionMethodName = commandBits[1];

			Controller controller = null;

			if (controllerName.equals("article")) {
				controller = articleController;

			} else if (controllerName.equals("member")) {
				controller = memberController;
			}

			else {
				System.out.printf("존재하지 않는 명령어 입니다.\n");
			}
			controller.doAction(command, actionMethodName);

		}

		sc.close();

		System.out.println("==프로그램 끝==");

	}

}