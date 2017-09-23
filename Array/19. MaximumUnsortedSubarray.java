// You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.
// Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.
// If A is already sorted, output -1.

// Example :

// Input 1:

// A = [1, 3, 2, 4, 5]

// Return: [1, 2]

// Input 2:

// A = [1, 2, 3, 4, 5]

// Return: [-1]
// In the above example(Input 1), if we sort the subarray A1, A2, then whole array A should get sorted.

public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        int n = A.size();
        int l=0, r=0;
        int lflag=1, rflag=1;
        for(int i = 1, j=n-1; i < n; i++, j--){
            if(lflag == 1){
                if(A.get(i) < A.get(i-1)){
                    l = i - 1;
                    lflag = 0;
                }
            }
            if(rflag == 1){
                if(A.get(j) < A.get(j-1)){
                    r = j;
                    rflag = 0;
                }
            }
            if(i == n-1 && lflag == 1 && rflag ==1){
                ans.add(-1);
                return ans;
            }
            if(lflag == 0 && rflag == 0 ){
                break;
            }
        }
        
        
        int max = A.get(l);
        int min = A.get(l);
        for(int i = l+1; i <= r; i++){
            if(A.get(i) < min){
                min = A.get(i);
            }
            if(A.get(i) > max){
                max = A.get(i);
            }
        }
        for(int i = 0; i < l; i++){
            if(A.get(i) > min){
                l = i;
                break;
            }
        }
        for(int i = n-1; i > r; i--){
            if(A.get(i) < max){
                r = i;
                break;
            }
        }
        
        ans.add(l);
        ans.add(r);
        return ans;
    }
}
