public class Main {
	public static void main(String[] args) {
		// Полиморфизм:
		Animal animal1 = new Dog(); // объект Dog в виде Animal
		Animal animal2 = new Cat(); // объект Cat в виде Animal
		
		animal1.isEating();
		animal2.isEating();
	}
}
