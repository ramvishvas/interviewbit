
// Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

// Example:

// Given n = 3,

// You should return the following matrix:

// [
//   [ 1, 2, 3 ],
//   [ 8, 9, 4 ],
//   [ 7, 6, 5 ]
// ]


public class Solution {
	public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
	    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		for(int k = 0; k < a; k++){
            arr.add(new ArrayList<Integer>(a));
            for(int l = 0; l < a; l++){
                arr.get(k).add(0);
            }
		}
		int L = 0;
		int R = a-1;
		int U = 0;
		int D = a-1;
		int count = 1;
		while(L <= R && U <= D ){
			if (L <= R && count <= a*a) {
				for (int i =L; i <= R; i++ ) {
					arr.get(U).set(i,count++);
				}
				U++;
			}

			if (U <= D && count <= a*a) {
				for (int i =U; i <= D; i++ ) {
					arr.get(i).set(R,count++);
				}
				R--;
			}

			if (R >= L && count <= a*a) {
				for (int i =R; i >= L; i-- ) {
					arr.get(D).set(i,count++);
				}
				D--;
			}

			if (D >= U && count <= a*a) {
				for (int i =D; i >= U; i-- ) {
					arr.get(i).set(L,count++);
				}
				L++;
			}
		}
		return arr;
	}
}
