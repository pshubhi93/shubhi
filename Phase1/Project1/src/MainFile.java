import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		System.out.println(new WelcomeScreen("Assignment1.com",
				"Shubhi Pathak",
				"SimpliLearn"));
		Scanner sc = new Scanner(System.in);
		Menu menu = new MainMenu(sc);
				
		menu.run();
		sc.close();
	}

}
