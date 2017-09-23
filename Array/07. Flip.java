// You are given a binary string(i.e. with characters 0 and 1) S consisting of characters S1, S2, …, SN. In a single operation, you can choose two indices L and R such that 1 ≤ L ≤ R ≤ N and flip the characters SL, SL+1, …, SR. By flipping, we mean change character 0 to 1 and vice-versa.

// Your aim is to perform ATMOST one operation such that in final string number of 1s is maximised. If you don’t want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

// Notes:

//     Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.

// For example,
// S = 010

// Pair of [L, R] | Final string
// _______________|_____________
// [1 1]          | 110
// [1 2]          | 100
// [1 3]          | 101
// [2 2]          | 000
// [2 3]          | 001

// We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
// Another example,

// If S = 111

// No operation can give us more than three 1s in final string. So, we return empty array [].


public class Solution {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int len = A.length();
        int[] zeroToOne = new int[len];
        int L = 0;
        int R = 0;
        int localL = 0;
        int currentSum = 0;
        int finalSum = 0;
        
        int countZero = 0;
        int countOne = 0;
        // replace 1 by -1 and 0 by 1 and find the subarray which has maximum sum
        for(int i = 0; i < len; i++){
           if(A.charAt(i) == '1'){
               zeroToOne[i] = -1;
               ++countOne;
           }else{
               zeroToOne[i] = 1;
               ++countZero;
           }
       }
       //check if all 1s
       if(countOne == len){
            return res;
        }
        // check if all 0s
        if(countZero == len){
            res.add(1);
            res.add(len);
            return res;
        }
       
        // finding sub array index
        for(int i = 0; i < len; i++){
            currentSum = currentSum + zeroToOne[i];
            if(currentSum < 0){
                localL = i + 1;
                currentSum = 0;
            }
            if(currentSum > finalSum){
                finalSum = currentSum;
                R = i;
                L = localL;
            }
        }
        
        res.add(L+1);
        res.add(R+1);
        return res;
    }
}
