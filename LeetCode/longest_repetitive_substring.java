//problem link: https://leetcode.com/problems/find-the-longest-semi-repetitive-substring/description/
/*
 * Intuition:
 * ------------
 * we store the freq. of each digit in the string and then traverse the
 * whole string to check each consecutive characters
 * 
 * Complexity:
 * -------------
 * T.C: O(n^2)
 * S.C: O(1)
 */

class Solution {
    public int longestSemiRepetitiveSubstring(String s) {
        
        int ans = -1;
        
        int n = s.length();
        
        for(int i=0;i<n-1;i++){
            
            if(n-i<ans) return ans;
            
            int[] freq = new int[10];
            
            int digit = s.charAt(i)-'0';
            
            freq[digit]++;
            
            int j,count = 0;
            
            
            for(j=i+1;j<n;j++){
                int digit1 = s.charAt(j)-'0';
                int digit2 = s.charAt(j-1)-'0';
                
                int temp=freq[digit1];
                
                if(digit1==digit2 || freq[digit1]==0){
                    freq[digit1]++;
                }                
                
                
                if(freq[digit1]>temp && freq[digit1]>1) count++;
                
                if(count>1){
                    
                    ans = Math.max(ans,j-i);
                    
                    break;
                }
            }
            if(count<=1) ans = Math.max(ans,j-i);
        }
        
        return ans==-1?1:ans;
    }
}