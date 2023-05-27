520. Detect Capital
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
--------------
Input: word = "USA"
Output: true
Input: word = "FlaG"
Output: false
---------------
Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.

------------------------------------------------------------
class Solution {
    public boolean detectCapitalUse(String word) {
        //if word length is 1 
        if(word.length() == 1) return true;
        String whichCase = "";
        int first = word.charAt(0);
        int second = word.charAt(1);
        //if lette is lower but second letter is upper
        if ( (97<=first && first<=122) && 
             (65<=second && second<=90)) return false;
        //if second letter is upper case all letters should be upper and vice versa
        if (65<=second && second<=90) whichCase = "UPPER";
        else if (97<=second && second<=122) whichCase = "LOWER";

        for(int i=2; i<word.length(); i++) {
            int ch = word.charAt(i);
            if(whichCase == "UPPER") {
                if(97<=ch && ch<=122) return false;
            }else{
                if(65<=ch && ch<=90) return false;
            }
        }

        return true;
    }
}
