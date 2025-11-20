import java.util.ArrayList;

public class ArrayListLearn {
	public static void main(String[] args) {
		ArrayList<String> users = new ArrayList<>();
		
		users.add("Tom");       // [Tom]
		users.add("Bob");       // [Tom, Bob]
		users.add("Alice");     // [Tom, Bob, Alice]
		
		System.out.println(users.get(1)); // Bob
		
		users.remove(1); // удаляем Bob → [Tom, Alice]
		
		System.out.println(users); // [Bob, Alice]
	}
}
// ArrayList — это динамический массив.
// Представь обычный массив, который умеет сам расширяться.

// 📌 Когда использовать ArrayList?
// когда много читаешь по индексу: list.get(100)
// когда мало вставляешь/удаляешь внутри списка