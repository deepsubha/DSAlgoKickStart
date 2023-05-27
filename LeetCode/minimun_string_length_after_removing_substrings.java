// problem link: https://leetcode.com/problems/minimum-string-length-after-removing-substrings/

// data structure used: stack

/*
 * Intuition:
 * --------------
 * We initialize a stack to recursively push the characters.
 *if stack not empty check if the current character of the string and the stack top equals the given substrings.
 *if yes we need to pop the character at stack top and move to the next string character.
 * 
 * Complexity:
 * --------------
 * T.C: O(n)
 * S.C: O(n)
 */

import java.util.Stack;

class Solution {
    public int minLength(String s) {
        
        Stack<String> st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            
            // if initially stack is is empty,push into the stack
            if(st.isEmpty()) st.push(s.charAt(i)+"");
            
            else if(!st.isEmpty()){
                
                String subStr = st.peek()+s.charAt(i)+"";
                
                if(subStr.equals("AB") || subStr.equals("CD")) st.pop();
                
                // recursively pushing each character into stack until we get "AB" or "CD" substrings
                else st.push(s.charAt(i)+"");
            }
            
        }
        
       return st.size();
    }
}