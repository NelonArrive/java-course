interface Greeting {
	void sayHello();
}

public class Main {
	public static void main(String[] args) {
		// создаём анонимный класс, реализующий интерфейс Greeting
		Greeting greeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Привет из анонимного класса!");
			}
		};
		
		greeting.sayHello(); // Вывод: Привет из анонимного класса!
	}
}
