// Given a non-negative number represented as an array of digits,

// add 1 to the number ( increment the number represented by the digits ).

// The digits are stored such that the most significant digit is at the head of the list.

// Example:

// If the vector has [1, 2, 3]

// the returned vector should be [1, 2, 4]

// as 123 + 1 = 124.

//     NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
//     For example, for this problem, following are some good questions to ask :

//         Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?

//         A : For the purpose of this question, YES
//         Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
//         A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


public class AddOneToNumber {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    
	    int tempSum = 0;
	    int tempRem = 0;
	    
	    for(int i = a.size()-1; i >= 0; i--)
	    {
	        tempSum = a.get(i);
	        
	        if(i == a.size()-1)
	            tempSum = tempSum + 1 + tempRem;
	            
	        else
	            tempSum = tempSum + tempRem;
	            
	        tempRem = (int)(tempSum / 10);
	        tempSum = tempSum % 10;
	        
	        a.set(i, tempSum);
	    }
	    
	    if(tempRem == 1)
	    {
	        
	        a.add(0, 1);
	    }
	    
	    //
	    if(a.get(0) == 0){
	        a.remove(0);
	    }
	    
	    // //Getting Iterator  
        Iterator itr=a.iterator();  
        
        //traversing elements of ArrayList object  
        while(itr.hasNext())
        {  
            if((int)itr.next() == 0)
            {
                itr.remove();
            }
            else
                break;
        }  
	    return a;
	}
}
