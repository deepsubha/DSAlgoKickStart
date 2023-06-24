//problem link: https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-104/problems/#

/*
 * Intuition:
 * ------------
 * since height of a child node = 1+height of it's parent so we initialize
 * an array to store height of each node in the tree.
 * 
 * Complexity:
 * -------------
 * T.C: O(N)
 * S.C: O(N)
 */

class Solution 
{ 
    double density(int N, int par[]) 
    { 
        double ans = 1;
        
        int[] height = new int[N];
        
        height[0] = 1;
        
        for(int i=1;i<N;i++){
            height[i] = height[par[i]]+1;
            
            ans = Math.max(height[i],ans);
        }
        
        return (double)N/ans;
    }
} 