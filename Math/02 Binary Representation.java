
// Given a number N >= 0, find its representation in binary.

// Example:

// if N = 6,

// binary form = 110


public class Solution {
	public String findDigitsInBinary(int a) {
	    String str = Integer.toString(a%2);
	    a = a/2;
	    while(a > 0){
	        str = Integer.toString(a%2) + str;
	        a /= 2;
	    }
	    return str;
	}
}
