// Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

// Example:

		
// Input: 	

// 1 2 3
// 4 5 6
// 7 8 9

// Return the following :

// [ 
//   [1],
//   [2, 4],
//   [3, 5, 7],
//   [6, 8],
//   [9]
// ]
// Input : 
// 1 2
// 3 4

// Return the following  : 

// [
//   [1],
//   [2, 3],
//   [4]
// ]


public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	    int n = a.get(0).size();
	    int loop = 1; 
		for(int line = 0; line < 2*n - 1; line++){
            arr.add(new ArrayList<Integer>());
            if(line < n){
                int k = line;
                for(int i = 0; i <= line; i++){
                    arr.get(line).add(a.get(i).get(k--));
                }
            }
            else{
               
               for(int i = n - 1; i >= loop; i--){
                    arr.get(line).add(a.get(line - i).get(i));
                }
                ++loop;
            }
		}
		return arr;
	}
}
