// Given a number N, find all prime numbers upto N ( N included ).

// Example:

// if N = 7,

// all primes till 7 = {2, 3, 5, 7}

// Make sure the returned array is sorted.

public class Solution {
	public ArrayList<Integer> sieve(int a) {
	    ArrayList<Integer> ans = new ArrayList();
	    int[] arr = new int[a + 1];
	    for(int i = 0; i <= a; i++){
	        arr[i] = 1;
	    }
	    arr[0] = 0;
	    arr[1] = 0;
	    for(int i = 2; i <= Math.sqrt(a); i++){
            int j = 2;
            while(j*i <= a){
                arr[j*i] = 0;
                j++;
            }
	    }
	    for(int i = 2; i <= a; i++){
	        if(arr[i] == 1){
	            ans.add(i);
	        }
	    }
	    return ans;
	}
}
