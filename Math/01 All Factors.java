// Given a number N, find all factors of N.

// Example:

// N = 6 
// factors = {1, 2, 3, 6}
// Make sure the returned array is sorted.


public class Solution {
	public ArrayList<Integer> allFactors(int a) {
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    if(a == 1){
	        ans.add(a);
	        return ans;
	    }
	    for(int i = 1; i <= Math.sqrt(a); i++){
	        if((a % i) == 0){
	            ans.add(i);
	            if(i != Math.sqrt(a)){
	                ans.add(a/i);
	            }
	        }
	    }
	    Collections.sort(ans);
	    return ans;
	}
}
