//problem link: https://leetcode.com/problems/ways-to-split-array-into-good-subarrays/description/
/*
 * Intuition:
 * ------------
 * Since each subarray must have exactly one '1', we need to find the no. of
 * partitions we can make between 2 consecutive 1's. So we calculate the no.
 * of zeros present between any two 1's and multiple it to ans.
 * 
 * Complexity:
 * -------------
 * T.C: O(n)
 * S.C: O(1)
 */

class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {
        
        long mod = (long)1e9+7;
        
        int n = nums.length;

        int i = 0;

        while(i<n && nums[i]!=1) i++;

        if(i>=n) return 0;

        int count = 0;

        long ans = 1;


        while(i<n){
            if(nums[i]==1){
                ans = (ans*(count+1))%mod;

                count = 0;
            }

            else count++;

            i++;
        }

        return (int)ans;
    }
}