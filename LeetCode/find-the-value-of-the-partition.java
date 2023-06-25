//problem link: https://leetcode.com/problems/find-the-value-of-the-partition/
/*
 * Intuition:
 * ------------
 * We sort the array at the beginning.Then for any valid partition,the min
 * and max elements will be any 2 consecutive elements in the array.We iterate
 * through the array and find the consecutive pair of elements having the 
 * least diff.
 * 
 * Complexity:
 * -------------
 * T.C: O(nlogn) for sorting the array
 * S.C: O(1)
 */

import java.util.Arrays;

class Solution {
    public int findValueOfPartition(int[] nums) {
        
        int ans = Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            ans = Math.min(ans,nums[i]-nums[i-1]);
        }
        
        return ans;
    }
}