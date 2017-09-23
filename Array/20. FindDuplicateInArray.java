// Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

// Sample Input:

// [3 4 1 4 1]
// Sample Output:

// 1
// If there are multiple possible answers ( like in the sample case above ), output any one.

// If there is no duplicate, output -1

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    int n =a.size();int index =0;
	    int arr[] = new int[n];
	    for(int i =0; i< n;i++){
	        arr[i] = a.get(i);
	    }
	    
	    for(int i =0; i< n;i++){
	        if(arr[Math.abs(arr[i])] > 0){
	            arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
	        }
	        else
	            return Math.abs(arr[i]);
	    }
	    return -1;
	    
	    
	}
}

