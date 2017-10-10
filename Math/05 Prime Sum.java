
// Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

// NOTE A solution will always exist. read Goldbach’s conjecture

// Example:


// Input : 4
// Output: 2 + 2 = 4

// If there are more than one solutions possible, return the lexicographically smaller solution.

// If [a, b] is one solution with a <= b,
// and [c,d] is another solution with c <= d, then

// [a, b] < [c, d] 

// If a < c OR a==c AND b < d. 


public class Solution {
    public ArrayList<Integer> primesum(int a) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = a;
        int[] arr = new int[n+1];
        
		for (int i=0;i<= n ;i++ ) {
			arr[i] = 1;
		}

		if (n > 2) {
			int j = 2;
			while (j*2 <= n) {
				arr[j*2] = 0;
				j++;
			}
		}
		
		for (int i = 3; i <= (int)Math.sqrt(n); i += 2 ) {
			int j = 2;
			while (j*i <= n) {
				arr[j*i] = 0;
				j++;
			}
		}
		
		for (int i=2; i<= n/2 ; i++ ) {
			if(arr[i] == 1 && arr[n-i] == 1){
			    ans.add(i);
			    ans.add(n-i);
			    return ans;
			}
		}
		return ans;
    }
}
