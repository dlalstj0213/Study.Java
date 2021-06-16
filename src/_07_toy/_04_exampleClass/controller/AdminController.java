package _07_toy._04_exampleClass.controller;

import _07_toy._04_exampleClass.repository.DB;
import _07_toy._04_exampleClass.service.AdminService;
import _07_toy._04_exampleClass.view.ViewPages;

public class AdminController {
	private DB db;
	private ViewPages front;
	private AdminService adminService;
	
	public AdminController(DB database) {
		db = database;
		front = new ViewPages(db);
		adminService = new AdminService(db);
	}
	
	public void showAdminPage() {
		front.viewAdminPage();
	}
	
	public void authCheck(int inputPassword) {
		if(adminService.checkAdminPw(inputPassword)) {
			front.viewCoffeesAndStocksAndTotal();
		}else {
			front.viewWrongInput("패스워드가 틀렸습니다.");
		}
	}
}
