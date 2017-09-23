// Given an index k, return the kth row of the Pascal’s triangle.

// Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

// Example:

// Input : k = 3

// Return : [1,3,3,1]
//  NOTE : k is 0 based. k = 0, corresponds to the row [1]. 
// Note:Could you optimize your algorithm to use only O(k) extra space?

public class Solution {
	public ArrayList<Integer> getRow(int a) {
	    ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int line = a+1; line <= a+1; line++){
            int count = 1;
            for(int i = 0; i < line; i++){
                arr.add(count);
                count = count * (line - (i+1)) / (i+1);
            }
		}
		return arr;
	}
}

