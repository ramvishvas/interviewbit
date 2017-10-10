
// Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.

// If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.

// The replacement must be in-place, do not allocate extra memory.

// Examples:

// 1,2,3 → 1,3,2

// 3,2,1 → 1,2,3

// 1,1,5 → 1,5,1

// 20, 50, 113 → 20, 113, 50
// Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

// Warning : DO NOT USE LIBRARY FUNCTION FOR NEXT PERMUTATIO


public class Solution {
	public void nextPermutation(ArrayList<Integer> a) {
	    for(int i = a.size() - 1; i > 0 ; i--){
	        if(a.get(i-1) >= a.get(i)){
	            if(i != 1){
	                continue;
	            }
	            else{
	                for(int j = 0; j < (a.size()/2); j++){
	                    a.set(j,(a.get(j) + a.get(a.size()-j - 1)));
	                    a.set(a.size()-j-1,(a.get(j) - a.get(a.size()-j-1)));
	                    a.set(j,(a.get(j) - a.get(a.size()-j-1)));
	                }
	                break;
	            }
	        }
	        else{
	            int j = a.size() - 1;
	            while(j >= i){
	                if(a.get(j) > a.get(i-1)){
	                    
	                    a.set(j,(a.get(j) + a.get(i - 1)));
	                    a.set(i - 1,(a.get(j) - a.get(i - 1)));
	                    a.set(j,(a.get(j) - a.get(i - 1)));
	                    break;
	                }
	                j--;
	            }
	            for(j = i; j < a.size() - 1; j++){
	                for(int k = j + 1; k < a.size(); k++){
	                    if(a.get(k) < a.get(j)){
    	                    
    	                    a.set(k,(a.get(k) + a.get(j)));
    	                    a.set(j,(a.get(k) - a.get(j)));
    	                    a.set(k,(a.get(k) - a.get(j)));
    	                }
	                }
	            }
	           break;
	        }
	    }
	}
}
