import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Animal> listOfAnimal = new ArrayList<>();
		listOfAnimal.add(new Animal(1));
		listOfAnimal.add(new Animal(2));
		
		printAnimal(listOfAnimal);
	}
	
	private static void printAnimal(List<Animal> list){
		for (Animal animal : list) {
			System.out.println(animal);
		}
	}
}