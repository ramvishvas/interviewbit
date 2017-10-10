/*
* Convert a number from decimal to binary.
* Ramvishvas
* 09/10/17
*/
import java.util.Scanner;
class DecimalToBinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		System.out.print("Enter Decimal No. : ");
		int n = in.nextInt();
		s = Integer.toString(n%2);
		n /= 2;
		while (n > 0) {
			s = Integer.toString(n%2) + s;
			n /= 2;
		}
		System.out.print(s);
	}
}
