//problem link: https://leetcode.com/problems/find-the-longest-semi-repetitive-substring/description/
/*
 * Intuition:
 * ------------
 * we traverse the entire string and ignore the 1st duplicate found,
 * as one duplicate is allowed.For any more duplicates found we update
 * the pointer 'i' to point to the last duplicate found
 * 
 * Complexity:
 * -------------
 * T.C: O(n)
 * S.C: O(1)
 */

class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        
        int i=0,j=1,ans = 1,last=0;

        for(j=1;j<s.length();j++){

            if(s.charAt(j)==s.charAt(j-1)){
                
                if(last!=0){ 
                    i = last; //if already one duplicate found earlier,we point 'i' to the last duplicate
                }
                last = j; //for first time repitition we just update the last variable,as one duplicate is allowed
                
            }

            ans = Math.max(ans,j-i+1);

        }

        return ans;
    }
}