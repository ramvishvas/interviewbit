// Given a positive integer n and a string s consisting only of letters D or I, you have to find any permutation of first n positive integer that satisfy the given input string.

// D means the next number is smaller, while I means the next number is greater.

// Notes

// Length of given string s will always equal to n - 1
// Your solution should run in linear time and space.
// Example :

// Input 1:

// n = 3

// s = ID

// Return: [1, 3, 2]

// Algorithms...................................................
        // whenever you encounter an I add "i" to ans and pop all element and add it to ans;
        // and if you encounter an D push it to stack.
        // examle 1 2 3 4 5 6 7 8 9 10
        // string I D D D I I D I D
// end............................................................
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        // given B = a.length()-1
        for (int i = 1; i < B; i++) {
            if (A.charAt(i - 1) == 'I') {
                ans.add(i);
                while (!stack.isEmpty()){
                    ans.add(stack.pop());   
                }
            }
            else{
                stack.push(i); 
            }
        }
        
        ans.add(B);
        while (!stack.isEmpty()){
            ans.add(stack.pop());   
        }
        return ans;
    }
}
