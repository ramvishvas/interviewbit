// Given a list of non negative integers, arrange them such that they form the largest number.

// For example:

// Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

// Note: The result may be very large, so you need to return a string instead of an integer.

public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    List<String> strs = new ArrayList<String>();
	    for(Integer i : a){
	        strs.add(String.valueOf(i));
	    }
	    
	    Collections.sort(strs, new MyCompartor());
	    
	     StringBuffer strBuf = new StringBuffer();
	    for(String s : strs){
	        if("0".equals(s) && strBuf.length() != 0) {
	            continue;   
	        }
	        strBuf.append(s);
	    }

	    return strBuf.toString();
	}
	
	
}

class MyCompartor implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        String first = s1 + s2;
        String second = s2 + s1;
        return second.compareTo(first);
    }
}





// public class Solution {
// 	// DO NOT MODIFY THE LIST
// 	public String largestNumber(final List<Integer> a) {
// 	    ArrayList<Integer> al = new ArrayList<Integer>(a.size());
// 	    al.addAll(a);
// 	    Collections.sort(al,new MyComparator());
// 	    String sb = "";
//         for (int s : al)
//         {
//             sb += Integer.toString(s);
//         }
//         if(sb.charAt(0) == '0')
//             return "0";
//         else 
//             return sb;
//     }
// }
// class MyComparator implements Comparator{
//     public int compare(Object obj1, Object obj2){
//         String str1 = obj1.toString() + obj2.toString();
// 	    String str2 = obj2.toString() + obj1.toString();
//         int len = str1.length();
//         for(int i = 0; i < len; i++){
//             if(Character.getNumericValue(str1.charAt(i)) > Character.getNumericValue(str2.charAt(i))){
//                 return -1;
//             }
//             else if(Character.getNumericValue(str1.charAt(i)) < Character.getNumericValue(str2.charAt(i))){
//                 return 1;
//             }
//         }
//         return 0;
//     }
// }











//  This is working solution but time limit exceed..


// public class Solution {
// 	// DO NOT MODIFY THE LIST
// 	public String largestNumber(final List<Integer> a) {
// 	    ArrayList<Integer> al = new ArrayList<Integer>(a.size());
// 	    al.addAll(a);
// 	    String ans = "";
// 	    int i, j;
// 	    for(i = 0; i < al.size() - 1; i++){
// 	        for(j=i+1; j < al.size(); j++){
// 	            if(isComeFirst(al.get(i), al.get(j)) == 0){
// 	                int temp = al.get(i);
// 	                al.set(i,al.get(j));
// 	                al.set(j,temp);
// 	            }
// 	        }
// 	        ans += Integer.toString(al.get(i));
// 	    }
// 	    ans += Integer.toString(al.get(i));
// 	   // checking if all are zero
// 	   if(ans.charAt(0) == '0'){
// 	       return "0";
// 	   }
// 	   else{
// 	       return ans;
// 	   }
// 	}
	
// // 	it will return 1 if str1 come first;
// //  else return 0;
// 	public static int isComeFirst(int num1, int num2){
// 	    String str1 = Integer.toString(num1) + Integer.toString(num2);
// 	    String str2 = Integer.toString(num2) + Integer.toString(num1);
//         int len = str1.length();
//         for(int i = 0; i < len; i++){
//             if(Character.getNumericValue(str1.charAt(i%len)) > Character.getNumericValue(str2.charAt(i%len))){
//                 return 1;
//             }
//             else if(Character.getNumericValue(str1.charAt(i%len)) < Character.getNumericValue(str2.charAt(i%len))){
//                 return 0;
//             }
//         }
//         return 1;
//     }
    
// }
