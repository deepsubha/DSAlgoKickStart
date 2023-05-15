290. Word Pattern
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
---------------
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
---------------
Constraints:

1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
------------------------------------------------------------------------------------


import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> match = new HashMap<Character, String>();
        String[] words = s.split(" "); 
        char[] patternKey = pattern.toCharArray();
        if(words.length != patternKey.length) return false;

        int i = 0;
        for(char ptr: patternKey) {
            if( match.get(ptr) == null ) {
                Collection<String> patternVals = match.values();
                if(patternVals.contains(words[i])) return false;
                match.put(ptr, words[i]);
            }
            else {
                if( !match.get(ptr).equals(words[i]) ) return false;
            }
            i++;
        }
        return true;
    }
}
