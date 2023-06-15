 [problem] (https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-105/instructions/#)
/* 
 Intuition: for every index we hace 2 choices, either to add it to the current
 distance covered(run clockwise) or to subtract it from the current distance
 covered (run anticlockwise) . If for any of the 2 options we get displacement
 '0' then we return true else false

 NOTE: The below soln. might give TLE for large input,optimized soln. is through dp

 * Complexity:
 * --------------
 * T.C: O(2^n)
 * S.C: O(n)
 */

class Solution{
    public String instructionCheck(int m, int n, int k[]){
        // Code Here.
        
        if(checkIfPossible(m,n,k,0,0)!=0) return "YES";
        
        else return "NO";
    }
    
    public int checkIfPossible(int totalDistance,int n,int[] arr,
    int index,int distanceCovered){
        
        if(index>=n) {
            // for displacement to be '0' distanceCovered should be a multiple of totalDistance
            return distanceCovered%totalDistance==0?1:0;
        }
        
        // running clockwise
        int op1 = checkIfPossible(totalDistance,n,arr,index+1,distanceCovered+arr[index]);
        
        // running anticlockwise
        int op2 = checkIfPossible(totalDistance,n,arr,index+1,distanceCovered-arr[index]);
    
        
        int op = op1 | op2;
        
        return op;
    }
}