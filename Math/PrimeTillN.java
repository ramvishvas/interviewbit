/*
* Finding Prime numbers - Sieve of Eratosthenes
* Ramvishvas
* 09/10/17
*/
import java.util.Scanner;
class PrimeTillN {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Decimal No. : ");
		int n = in.nextInt();
		int[] a = new int[n+1];
		for (int i=0;i<= n ;i++ ) {
			a[i] = 1;
		}

		if (n > 2) {
			int j = 2;
			while (j*2 <= n) {
				a[j*2] = 0;
				j++;
			}
		}
		for (int i = 3; i <= (int)Math.sqrt(n); i += 2 ) {
			int j = 2;
			while (j*i <= n) {
				a[j*i] = 0;
				j++;
			}
		}
		System.out.print("Prime till "+n+" Is: ");
		for (int i=2;i<= n ;i++ ) {
			if (a[i] == 1) {
				System.out.print(i + " ");	
			}
		}
		System.out.println();
	}
}
