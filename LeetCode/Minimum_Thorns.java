// problem link: https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-105/instructions/#

// data structure used: array

/* 
 * Complexity:
 * --------------
 * T.C: O(1)
 * S.C: O(1)
 */

class Solution{
    public int minimumThorns(int n, int m, int geek[], int geekina[]){
        // Code Here.
        
        int[] dir_x = new int[]{1,-1,0,0};
        int[] dir_y = new int[]{0,0,1,-1};
        
        // thorns required to put around geek
        int op1 = helper(n,m,geek,geekina,dir_x,dir_y);

        // thorns required to put around geekina
        int op2 = helper(n,m,geekina,geek,dir_x,dir_y);
        
        // take minimum of both
        return Math.min(op1,op2);
    }
    
    public int helper(int n,int m,int[] a,int[] b,int[] x,int[] y){
        
        int count = 0;
        
        for(int i=0;i<4;i++){
            
            int curr_x = a[0]+x[i];
            int curr_y = a[1]+y[i];
            
            // if either geek or geekina falls in adjacent cell then return -1
            if(curr_x==b[0] && curr_y==b[1]) return -1;
            
            if(isSafe(a,b,n,m,curr_x,curr_y)) count++;
        }
        
        return count;
    }
    
    public boolean isSafe(int[] a,int[] b,int n,int m,int i,int j){
        
        if(i<=0 || j<=0 || i>n || j>m) return false;
        
        return true;
    }
}
