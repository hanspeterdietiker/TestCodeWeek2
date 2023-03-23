import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		
		//NUMERO PRIMO DIVISIVEL POR 1 E POR ELE MESMO!
		//NUMERO DE DIVISORES É 2.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe um numero: ");
		int nPrime = sc.nextInt();
		
		int div = 0;

		for (int i = 1; i <= nPrime; i++) {
			if (nPrime % i == 0) {
				div++;
			}
		}

		if (div == 2) {
			System.out.println("O numero e primo.");
		} else {
			System.out.println("O numero nao e primo.");
		}
			sc.close();
	}
}
