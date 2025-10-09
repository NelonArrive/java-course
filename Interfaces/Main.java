package Interfaces;

public class Main {
	public static void main(String[] args) throws Exception {
		User user = new User(1, "nelon.arrive@gmail.com", "123456");
		
		user.login("nelon.arrive@gmail.com", "123456");
		user.logout();
	}
}
