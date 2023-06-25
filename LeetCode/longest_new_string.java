//problem link: https://leetcode.com/problems/construct-the-longest-new-string/description/

/*
 Intuition:
 ------------
 No matter the count of any of the 3 strings,we can always use all of 
 "ab" strings available. We just need to check for "aa" and "bb" 
 strings count.
  
 Complexity:
 -------------
 T.C: O(1)
 S.C: O(1)
 */

class Solution {
    public int longestString(int x, int y, int z) {
        
        int ans = 0,factor = 0;
        
        int lowest = x<y?x:y;

        /*if count of "aa" and "bb" strings are equal then we can use
        all of the strings.
        */
        if(x==y)
            factor = x+y;
        
        /* If the count of "aa" and "bb" strings are not equal then
        answer will be the lowest count among the 2 ("aa" and "bb")
        */
        else
            factor = lowest*2+1;
        
        ans = (factor+z)*2;
        
        return ans;
    }
}