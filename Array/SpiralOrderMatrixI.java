// Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.

// Example:
// Given the following matrix:
// [
//     [ 1, 2, 3 ],
//     [ 4, 5, 6 ],
//     [ 7, 8, 9 ]
// ]

// You should return
// [1, 2, 3, 6, 9, 8, 7, 4, 5]


public class SpiralOrderMatrixI {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	// Populate result;
    	int frow = 0, lrow = a.size() -  1,  fcolumn = 0, lcolumn = a.get(0).size() - 1;
    	 
        while(frow <= lrow && fcolumn <= lcolumn)
        {
            
            
            if(fcolumn <= lcolumn && lrow >= frow){
                for(int i = fcolumn; i <= lcolumn; ++i){
                    result.add(a.get(frow).get(i));
                }
                frow++;
            }
            
            if(frow <= lrow && lcolumn >= fcolumn){
                for(int i = frow; i <= lrow; ++i){
                    result.add(a.get(i).get(lcolumn));
                }
                
                lcolumn--;
            }
            
            
            if(lcolumn >= fcolumn && frow <= lrow){
                for(int i = lcolumn; i >= fcolumn; --i){
                    result.add(a.get(lrow).get(i));
                }
                
                lrow--;
            }
            
            if(lrow >= frow && fcolumn <= lcolumn){
                for(int i = lrow; i >= frow; --i){
                    result.add(a.get(i).get(fcolumn));
                }
                
                fcolumn++;
            }
        }
		 return result;
	}
}


