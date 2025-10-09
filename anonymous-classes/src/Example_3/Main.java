package Example_3;

abstract class Animal {
	abstract void sound();
}

public class Main {
	public static void main(String[] args) {
		Animal cat = new Animal() {
			private String name = "Мурзик";
			
			@Override
			void sound() {
				System.out.println(name + " говорит: Мяу!");
			}
		};
		
		cat.sound(); // Мурзик говорит: Мяу!
	}
}

