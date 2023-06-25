//problem link: https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/description/

/*
 * Intuition:
 * ------------
 * We can ignore the case when 2 of the ants collide,as because after
 * collision they will just exchange their initial directions.
 * The max time taken will be by the left moving ant which is placed at the extreme right
 * and the right moving ant which is placed at the extreme left respectively.
 * 
 * Complexity:
 * -------------
 * T.C: O(NlogN)
 * S.C: O(1)
 */

import java.util.Arrays;

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        
        Arrays.sort(left);
        Arrays.sort(right);

        int leftMaxTime = left.length>=1?left[left.length-1]:0;
        int rightMaxTime = right.length>=1?n-right[0]:0;

        int ans = Math.max(leftMaxTime,rightMaxTime);

        return ans;
    }
}