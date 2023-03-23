import java.util.Scanner;

public class MediaNotasWithFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		double media = 0;

		System.out.print("Informe a quantidade de notas: ");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			double nota = sc.nextDouble();
			media = media + nota;
		}
		media = media / n;
		System.out.println("\nMedia: " + media);

		sc.close();
	}
}
