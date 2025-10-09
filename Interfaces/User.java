package Interfaces;

public class User implements Auth {
	private int id;
	private String email;
	private String password;
	private boolean isLoggedIn;
	
	public User(int id, String email, String password) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.isLoggedIn = false;
	}
	
	@Override
	public void login(String email, String password) {
		if (this.email.equals(email) && this.password.equals(password)) {
			isLoggedIn = true;
			System.out.println("You login in system: " + this.email);
		} else {
			System.out.println("Incorrect entry data");
		}
	}
	
	@Override
	public void logout() {
		isLoggedIn = false;
		System.out.println("You logout the system: " + this.email);
	}
	
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
}
