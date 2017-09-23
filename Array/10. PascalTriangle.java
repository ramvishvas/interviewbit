// Given numRows, generate the first numRows of Pascal’s triangle.

// Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

// Example:

// Given numRows = 5,

// Return

// [
//      [1],
//      [1,1],
//      [1,2,1],
//      [1,3,3,1],
//      [1,4,6,4,1]
// ]


public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for(int line = 1; line <= a; line++){
            arr.add(new ArrayList<Integer>());
            int count = 1;
            for(int i = 0; i < line; i++){
                arr.get(line - 1).add(count);
                count = count * (line - (i+1)) / (i+1);
            }
		}
		return arr;
	}
}
