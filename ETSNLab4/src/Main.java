
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
	
		
	if(args[0].equals("search") && args.length == 3) {
		
		try {
		File text = new File(args[1]);
		Scanner scan = new Scanner(text);
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			if (line.contains(args[2])) {
				System.out.println(line);
			}
		}
		
		scan.close();
		} catch (FileNotFoundException e) {
			System.out.print("Could not read file: " + args[0] );
		}
				
	} else {
		System.out.print("Incorrect arguments: " + args[0] + " " + args[1] + " " + args[2]);
	}
	

	}

}
