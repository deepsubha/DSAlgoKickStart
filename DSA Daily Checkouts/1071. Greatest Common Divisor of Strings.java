1071. Greatest Common Divisor of Strings
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
-----------
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Input: str1 = "LEET", str2 = "CODE"
Output: ""
-----------
Constraints:
1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
--------------------------------------------------------------------------------


import java.util.ArrayList;
import java.util.List;
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1 == "" || str2 == "") return "";
        int hcfNo = hcf(str1.length(), str2.length());
        if(str1.length() > str2.length())
            return findgcdString(str2, str1, hcfNo);
        else
            return findgcdString(str1, str2, hcfNo);
    }

    private static int hcf(int n1, int n2) {
        if(n2 == 0) return n1;
        else return hcf(n2, n1%n2);
    }

    private static String findgcdString(String first, String second, int len) {
        String matching = first.substring(0, len);
        int high,low = 0;
        for(int i=len; i+len <= first.length(); i=high) {
            low = i;
            high = i+len;
            String str = first.substring(low, high);
            if(!str.equals(matching)) return "";
        }
        if( !matching.equals(second.substring(0, len)) ) return "";
        high=0; low = 0;
        for(int i=len; i+len <= second.length(); i=high) {
            low = i;
            high = i+len;
            String str = second.substring(low, high);
            if(!str.equals(matching)) return "";
        }
        return matching;
    }
}
