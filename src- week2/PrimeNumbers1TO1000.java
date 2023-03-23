
public class PrimeNumbers1TO1000 {
	public static void main(String[] args) {

		int div;

		for (int i = 1; i <= 1000; i++) {
				div = 0;

			for (int n = 1; n <= i; n++) {
				if (i % n == 0) {
					div++;
				}
			}
			if (div == 2) {
				System.out.println(i);
			}
		}
	}
}
