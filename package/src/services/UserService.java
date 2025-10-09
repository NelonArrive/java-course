package services;

import models.User;

public class UserService {
	public void greetUser() {
		User user = new User("Иван");
		user.sayHello();
	}
}
