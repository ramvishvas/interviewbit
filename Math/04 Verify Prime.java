// Given a number N, verify if N is prime or not.

// Return 1 if N is prime, else return 0.

// Example :

// Input : 7
// Output : True


public class Solution {
	public int isPrime(int a) {
	    if(a == 1){
	       return 0;
	    }
	    else if(a == 2 || a == 3){
	       return 1;
	    }
	    else if(a % 2 == 0){
	       return 0;
	    }
	    for(int i = 3; i <= Math.sqrt(a); i += 2){
	        if(a % i == 0){
	            return 0;
	        }
	    }
	    return 1;
	}
}
