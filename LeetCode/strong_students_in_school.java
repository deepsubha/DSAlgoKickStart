// problem link: https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-102/problems/#

//data structure used: Arrays

/*
 * Intuition:
 * --------------
 * We sort the initial array in increasing order at first.
 * Now the task is simple, we need to calculate the sum of 'm' elements from start which will be the minSum,
 * ans the sum of 'm' elements from end which will be the maxSum
 * Complexity:
 * --------------
 * T.C: O(nlogn) -> for sorting the input array
 * S.C: O(1) -> no auxilliary space required
 */

import java.util.Arrays;

class Sol
{
    public static int diffSum(int n,int m,int arr[])
    {
        Arrays.sort(arr);
        
        int i=0,j=n-1;
        
        int minSum = 0,maxSum = 0;
        
        while(m>0){
            minSum += arr[i++];
            maxSum += arr[j--];
            m--;
        }
        
        return maxSum-minSum;
    }
}