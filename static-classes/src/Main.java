public class Main {
	public static void main(String[] args) {
		UserStatic.getUserCount();
	}
}

class UserStatic {
	private static int userCount = 0;
	
	public UserStatic() {
		userCount++;
	}
	
	public static int getUserCount() {
		return userCount;
	}
}