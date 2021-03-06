import java.util.ArrayList;
import java.util.Scanner;

public class GreeterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//collecting data for greeting
		System.out.println("Choose a greeting:");
		String greeting = input.nextLine();
		
		//collecting data for name
		System.out.println("Enter your name?");
		String name = input.nextLine();
		
		//superclass test
		Greeter greet1 = new Greeter(greeting);
		System.out.println(greet1.greet(name));
		
		//simon test
		SimonGreeter greet2 = new SimonGreeter(greeting);
		System.out.println(greet2.greet(name));
		
		//loud test
		LoudGreeter greet3 = new LoudGreeter(greeting);
		System.out.println("How much volume to add? (0 to 10):");
		int volume = input.nextInt();
		
		for (int i = 0; i < volume; i++) {
			greet3.addVolume();
		}
		
		System.out.println(greet3.greet(name));
		
		//html test
		HtmlGreeter greet4 = new HtmlGreeter(greeting);
		System.out.println(greet4.greet(name));

		//extended challenge 1
		System.out.println("What HTML tag would you like to use?");
		String tagName = input.next();
		
		HtmlGreeter greet5 = new HtmlGreeter(greeting, tagName);
		System.out.println(greet5.greet(name));
		
		System.out.printf("%n%n%n");
		//extended challenge 2
		
		ArrayList<Greeter> greeterList = new ArrayList<>();
		
		greeterList.add(new Greeter("Hi"));
		greeterList.add(new SimonGreeter("Hey"));
		greeterList.add(new LoudGreeter("Hello"));
		greeterList.add(new HtmlGreeter("Hiya", "h5"));
		
		for (Greeter greeter : greeterList) {
			System.out.println(greeter.greet("sir"));
		}
	}

}
