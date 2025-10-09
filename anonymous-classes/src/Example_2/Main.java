package Example_2;

class User {
	void printRole() {
		System.out.println("Обычный пользователь");
	}
}

public class Main {
	public static void main(String[] args) {
		User admin = new User() {
			@Override
			void printRole() {
				System.out.println("Администратор");
			}
		};
		
		admin.printRole(); // Вывод: Администратор
	}
}
