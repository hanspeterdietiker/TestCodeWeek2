import java.util.Scanner;

public class NumbersFriend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		int number1, number2;
		
		do {

			System.out.print("Informe um numero maior que zero: ");
			x = sc.nextInt();

		} while (x <= 0);

		do {

			System.out.print("Informe outro numero maior que zero: ");
			y = sc.nextInt();

		} while (y <= 0);

		number1 = 0;
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				number1 = number1 + i;
			}
		}

		number2 = 0;
		for (int i = 1; i < y; i++) {
			if (y % i == 0) {
				number2 = number2 + i;
			}
		}

		if (number1 == y && number2 == x) {
			System.out.println("Sao amigos.");
		} else {
			System.out.println("Nao sao amigos.");
		}
		sc.close();
	}

}
