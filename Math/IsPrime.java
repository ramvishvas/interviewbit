/*
* Verify a Prime number - Trial division method
* Ramvishvas
* 09/10/17
*/
import java.util.Scanner;
class IsPrime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Decimal No. : ");
		int n = in.nextInt();

		if ((n == 1) || (n % 2 == 0 && n != 2)) {
			System.out.println("Not Prime");
			System.exit(0);
		}
		int flag = 1;
		for (int i = 3; i <= Math.sqrt(n); i += 2 ) {
			if (n % i == 0) {
				System.out.println("Not Prime");
				System.exit(0);
			}
		}
		System.out.print("Prime");
	}
}
