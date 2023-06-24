//problem link: https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-106/problems/#

/*
 * 
 * Complexity:
 * -------------
 * T.C: O(n) 
 * S.C: O(n) where 'n' denotes the no. of tree nodes
 */

 class Solution{
    public static int supplyVaccine(Node root){
        int[] ans = new int[1];
        
        return dfs(root,ans)>2?ans[0]+1:ans[0];
    }
    
    public static int dfs(Node root,int[] ans){
        if(root==null) return 0;
        
        int val = dfs(root.left,ans)+dfs(root.right,ans);
        
        if(val==0) return 3;
        
        if(val<3) return 0;
        
        ans[0]++;
        
        return 1;
    }
}