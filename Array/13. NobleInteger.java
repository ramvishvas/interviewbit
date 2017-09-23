// Given an integer array, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p
// // If such an integer is found return 1 else return -1.

public class Solution {
    public int solve(ArrayList<Integer> A) {
        // sort the elements in increasing order
        Collections.sort(A);
        int len = A.size();
        // iterate the loop to (size - 2) times
        for(int i = 0; i < len - 1; i++){
            // cheak a[i] == size - 1 - index AND a[i] != a[i+1];
            if((A.get(i) == len - i - 1) && (A.get(i) != A.get(i+1))){
                return 1;
            }
        }
        // cheack if last element is zero or not
        if(A.get(len - 1) == 0){
            return 1;
        }
        
        return -1;
    }
}
