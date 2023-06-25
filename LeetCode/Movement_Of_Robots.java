//problem link: https://leetcode.com/problems/movement-of-robots/description/

/*
 * Intuition:
 * ------------
 * We can ignore the case when 2 of the robots collide,as because after
 * collision they will just exchange their initial directions.
 * Complexity:
 * -------------
 * T.C: O(NlogN)
 * S.C: O(1)
 */

import java.util.Arrays;

class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        
        for(int i=0;i<nums.length;i++){
            if(s.charAt(i)=='L') nums[i] -= d;

            else nums[i] += d;
        }

        Arrays.sort(nums);

        long ans = 0,prefix = 0;

        long mod = (int)1e9+7;

        for(int j=0;j<nums.length;j++){

            ans += (j*(long)nums[j])-prefix;

            ans %= mod;

            prefix += nums[j];

        }

        return (int)ans;
    }
}