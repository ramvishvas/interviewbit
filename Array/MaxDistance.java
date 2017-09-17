// Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].
// If there is no solution possible, return -1.

// Example :
// A : [3 5 4 2]
// Output : 2  
// for the pair (3, 4)

public class MaxDistance {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> a) {
	    int n = a.size();
	    int[] maxR = new int[n];
	    int[] minL = new int[n];
	    
	    minL[0] = a.get(0);
	    for(int i = 1; i < n; i++){
	        minL[i] = Math.min(a.get(i), minL[i-1]);
	    }
	    
	    maxR[n -1] = a.get(n -1);
	    for(int i = n-2; i >= 0; i--){
	        maxR[i] = Math.max(a.get(i), maxR[i+1]);
	    }
	    
	    int i = 0, j = 0, maxdiff = 0;
        while (j < n && i < n)
        {
            if (minL[i] <= maxR[j])
            {
                maxdiff = Math.max(maxdiff, j-i);
                j++;
            }
            else
                i++;
        }
     
        return maxdiff;
        
// Below one is correct solution but time limit exceed;    
    
     // int i, j, k;
	   // for(i=0, j = n-1;i < n; i++,j--){
	   //     for(k = 0; k<=i;k++){
	   //         if(a.get(j+k) >=  a.get(k)){
	   //             return j;
	   //         }
	   //     }
	   // }
	   // return -1;
    	    
	}
}

