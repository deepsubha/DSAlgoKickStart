//problem link: https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-104/problems/#

/*
 * Intuition:
 * ------------
 * We need to sort the array first.Then we can start from the beginning and do
 * the following:
 * 1) If (current element-k) does not exists then subtract 'k' from current element.
 * 2) If current element is unique in the array,leave as it is.
 * 3) Otherwise add 'k' to current element;
 * 
 * Complexity:
 * -------------
 * T.C: O(NlogN)
 * S.C: O(N)
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution 
{ 
    int distinctElements(int n, int k, int arr[]) 
    { 
        Arrays.sort(arr);
        
        Map<Integer,Integer> freq = new HashMap<>();
        
        for(int num:arr) freq.put(num,freq.getOrDefault(num,0)+1);
        
        for(int i=0;i<n;i++){
            if(!freq.containsKey(arr[i]-k) || freq.get(arr[i]-k)==0){
                freq.put(arr[i]-k,freq.getOrDefault(arr[i]-k,0)+1);
                freq.put(arr[i],freq.get(arr[i])-1);
            }
            
            else if(freq.get(arr[i])==1) continue;
            
            else{
                freq.put(arr[i]+k,freq.getOrDefault(arr[i]+k,0)+1);
                freq.put(arr[i],freq.get(arr[i])-1);
            }
            
        }
        
        int ans = 0;
        
        for(Map.Entry entry:freq.entrySet()){
            if((int)entry.getValue()>0) ans++;
        }       
        
        return ans;
    }
} 