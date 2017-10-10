// Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding bits are different.

// For example,

// HammingDistance(2, 7) = 2, as only the first and the third bit differs in the binary representation of 2 (010) and 7 (111).

// Given an array of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array.
// Return the answer modulo 1000000007.

// Example

// Let f(x, y) be the hamming distance defined above.

// A=[2, 4, 6]

// We return,
// f(2, 2) + f(2, 4) + f(2, 6) + 
// f(4, 2) + f(4, 4) + f(4, 6) +
// f(6, 2) + f(6, 4) + f(6, 6) = 

// 0 + 2 + 1
// 2 + 0 + 1
// 1 + 1 + 0 = 8


// About Solution........................................

// Compilation
// Correctness
// Efficiency
// Time Limit Exceeded. Your submission didn't complete in the allocated time limit.

// In actual interview it is expected to write the most optimal solution at the first attempt. Please be careful, you might not get a second chance in front of a real Interviewer.
// Partially Correct Answer.
// You got 87/200 points!


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) {
        int ans = 0;
        int count = 0;
        int finalSum = 0;
        for(int i = 0; i < A.size() - 1; i++){
            for(int j = i+1; j < A.size(); j++){
                int n1 = A.get(i);
                int n2 = A.get(j);
                count = 0;
                if(n1 > n2){
                    while (n2 > 0) {
            			if(n1 % 2 != n2 % 2){
            			    ++count;
            			}
        			    n1 /= 2;
        			    n2 /= 2;
            		}
            		while (n1 > 0) {
            			if(n1 % 2 != 0){
            			    ++count;
            			}
            			n1 /= 2;
            		}
            		finalSum = finalSum + (2*count);
                }
                else{
                    while (n1 > 0) {
            			if(n1 % 2 != n2 % 2){
            			    ++count;
            			}
            			n1 /= 2;
            			n2 /= 2;
            		}
            		while (n2 > 0) {
            			if(n2 % 2 != 0){
            			    ++count;
            			}
            			n2 /= 2;
            		}
            		finalSum = finalSum + (2*count);
                }
            }
        }
        return finalSum;
    }
}
