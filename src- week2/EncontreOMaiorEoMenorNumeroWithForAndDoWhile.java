import java.util.Scanner;

public class EncontreOMaiorEoMenorNumeroWithForAndDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1, nS, totalNumbers, yeah;

		// Exercicio que informa o primeiro numero para ver se é maior ou menor que os
		// numeros da segunda lista somados.

		do {
			int n = 0;
			
			
			do {
				System.out.print("Informe a quantidade de numeros a serem lidos : \n(No maximo 10) : ");
				totalNumbers = sc.nextInt();

			} while (totalNumbers >= 11);

			System.out.print("Informe o PRIMEIRO numero : ");
			n1 = sc.nextInt();

			for (int i = 1; i < totalNumbers; i++) {
				System.out.print("Informe o numero " + (i + 1) + ": ");
				nS = sc.nextInt();
				n = n + nS;

			}

			if (n1 > n) {
				System.out.print("O primeiro numero " + (n1) + " e maior que o segundo numero " + (n));
			} else {
				System.out.print("O segundo numero " + (n) + " e maior que o primeiro numero " + (n1));
			}

			System.out.println("\nGostaria de repetir o processo? \n(1)Sim \n(2)Nao ");
			yeah = sc.nextInt();

		} while (yeah == 1);
		sc.close();
	}
}