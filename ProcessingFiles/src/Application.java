import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		for(int i=0; i<=3; i++) {
//		
//		System.out.println("Enter some Text: ");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);

		File file = new File("myfileChanged.txt");
		Scanner input;
		try {
			input = new Scanner(file);

			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
//			e.printStackTrace();
		}
		
		
		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(12));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
