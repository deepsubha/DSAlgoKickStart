//problem link: https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-106/problems/#

/*
 * Intuition:
 * ------------
 * Consider the case edges[][] = {{1,2},{2,3},{3,4},{4,1}}.Here each node has
 * exactly 2 edges and forms a cycle. For such a case alone we can't remove
 * an edge and add it between any other nodes keeping the cycle length constant.
 * 
 * So we just calculate the no. of edges for each node.
 * 
 * Complexity:
 * -------------
 * T.C: O(n)
 * S.C: O(1)
 */

 class Solution{
    public String cyclicTree(int n, int edges[][]){

        int[] freq = new int[(int)1e5+1];
        
        for(int[] edge :edges){
            
            freq[edge[0]]++;
            freq[edge[1]]++;
            
            //if any node has more than 2 edges it means new cycle is possible
            if(freq[edge[0]]>2 || freq[edge[1]]>2) return "Yes";
        }
        
        for(int i=0;i<freq.length;i++){
            
            
            //if any node has edges!=2 it means new cycle is possible
            if(freq[i]!=2 && freq[i]>0) return "Yes";
        }
        
        return "No";
    }
    
}