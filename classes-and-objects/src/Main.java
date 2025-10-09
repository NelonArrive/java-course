public class Main {
	public static void main(String[] args) {
		Person person = new Person();
	}
}

class Person {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String userName) {
		name = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int userAge) {
		age = userAge;
	}
	
	void speak(String text) {
		System.out.println(text);
	}
}