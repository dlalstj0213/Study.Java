package _05_ExMVC.server;

import _05_ExMVC.client.Login;

public class Utils {
	public static Model loginToModel(Login login) {
		LoginModel converted = new LoginModel();
		converted.id = login.typedUsername;
		converted.pw = login.typedPassword;
		return converted;
	}
}
