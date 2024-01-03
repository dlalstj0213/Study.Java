package _03_classPractice.controller;

import _03_classPractice.service.MainService;
import _03_classPractice.view.ViewPages;
import _03_classPractice.repository.Repository;

public class MainController {
	private Repository db;
	private ViewPages front;
	private MainService mainService;

	public MainController(Repository database) {
		db = database;
		front = new ViewPages(db);
		mainService = new MainService(db);
	}

	public void showMainPage() {
		front.viewMain();
	}

	public void showErrorPage() {
		front.viewWrongInput(null);
	}

	public void confirmTerminate() {
		front.viewAskTerminate();
	}

	public int processTerminate(int check) {
		String response = mainService.terminate(check);
		if(response.equals("종료")) {
			front.viewWhenTerminate();
			return 0;
		}else if(response.equals("취소")) {
			return 1;
		}else {
			front.viewWrongInput(response);
			return -1;
		}
	}
}
