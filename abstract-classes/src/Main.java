public class Main {
	public static void main(String[] args) {
		User admin = new Admin("Алексей");
		User client = new Client("Мария");
		
		admin.login(); // Алексей вошёл в систему ✅
		admin.accessDashboard(); // Алексей открыл админ-панель ⚙️
		
		client.login(); // Мария вошёл в систему ✅
		client.accessDashboard(); // Мария открыл клиентский кабинет 💼
	}
}


abstract class User {
	String name;
	
  // Constructor
	User(String name) {
		this.name = name;
	}
	
	abstract void accessDashboard(); // каждый тип пользователя реализует по-своему
	
	void login() {
		System.out.println(name + " вошёл в систему ✅");
	}
}

class Admin extends User {
	Admin(String name) {
		super(name);
	}
	
	@Override
	void accessDashboard() {
		System.out.println(name + " открыл админ-панель ⚙️");
	}
}

class Client extends User {
	Client(String name) {
		super(name);
	}
	
	@Override
	void accessDashboard() {
		System.out.println(name + " открыл клиентский кабинет 💼");
	}
}

