Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1
On returning, the array A should be :

0 0 0
1 0 1
1 0 1
Note that this will be evaluated on the extra memory used. Try to minimize the space and time complexity.

Algorithhm  ...............................
1) From all index Starting at zero to last
       if  indexOf(0) exists set all element of that row to 0 and store
            all index of zero to another temprory arrayList and if index already exists then skip that index.
       else
           leave that row as it is.
2) for each element of ArrayList set all elements of currosponding Colunn to 0

end .....................................


public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    int m = a.size();
	    int n = a.get(0).size();
	    int index = -1;
	   // for row ................................
	    for(int i = 0; i < m; i++){
	       // for(int j = 0; j < n; j++){
	       // add n -> 1
	        index = a.get(i).indexOf(0);
	       // System.out.println(index);
	        if(index != -1){
	            if(ans.indexOf(index) == -1)
	                ans.add(index);
	            index++;
	            while(index < n){
	                if(a.get(i).get(index) == 0 && ans.indexOf(index) == -1){
	                    ans.add(index);
	                }
	                index++;
	            }
	            int j = 1;
	            while(j <= n){
	                a.get(i).set(j-1, 0);
	                j++;
	            }
	        }
	    }
	   //  for column to set 0 ...............
	    for(int i = 0; i < ans.size(); i++){
            index = ans.get(i);
            int j = 0;
            while(j < m){
                a.get(j).set(index,0);
                j++;
            }
	    }
	}
}

 
