import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean b;
		int num = 0;

		do {
			System.out.print("Ange lösen: ");
			String inputValue = sc.nextLine();

			if (inputValue.equals("safer")) {
				b = true;
				break;
			} else {
				num++;
				System.out.println("försök nr: " + num);
				b = false;
			}
		} while (num != 3);

		
		if (b) {
			System.out.println("rätt lösenord");
		} else
			System.out.println("fel lösenord");
	}

}
