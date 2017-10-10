/*
* Finding Prime numbers - Sieve of Eratosthenes
* Ramvishvas
* 09/10/17
*/
import java.util.Scanner;
class AllFactorOfN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Decimal No. : ");
		int n = in.nextInt();
		int[] a = new int[n+1];
		for (int i=0;i<= n ;i++ ) {
			a[i] = 0;
		}
		for (int i = 1; i <= (int)Math.sqrt(n); i++ ) {
			if (n % i == 0) {
				a[i] = 1;
				a[n/i] = 1;
			}
		}
		System.out.print("All Factor of "+n+" Is: ");
		for (int i=1;i<= n ;i++ ) {
			if (a[i] == 1) {
				System.out.print(i + " ");	
			}
		}
		System.out.println();
	}
}
