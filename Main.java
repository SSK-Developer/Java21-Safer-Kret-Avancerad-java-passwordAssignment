import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean b;
		int num = 0;

		do {
			System.out.print("Ange l�sen: ");
			String inputValue = sc.nextLine();

			if (inputValue.equals("safer")) {
				b = true;
				break;
			} else {
				num++;
				System.out.println("f�rs�k nr: " + num);
				b = false;
			}
		} while (num != 3);

		
		if (b) {
			System.out.println("r�tt l�senord");
		} else
			System.out.println("fel l�senord");
	}

}
