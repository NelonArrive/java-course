import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		String separator = File.separator;
		String path =
			separator + "C:" + separator + "Users" + separator + "nelon" + separator +
				"Documents" + separator + "test.txt";
		
		File file = new File(path);
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] words = line.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		// while(scanner.hasNextLine()) {
		// 	System.out.println(scanner.nextLine());
		// }
		
		scanner.close();
	}
}