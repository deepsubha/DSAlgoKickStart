Problem: https://leetcode.com/problems/check-if-it-is-a-straight-line/description/
Difficulty: Easy
Tags: Array/ List
---------------------------------------------------------------
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) return true;
        if ((coordinates[1][0] - coordinates[0][0]) == 0) {
            for(int points = 1; points<coordinates.length; points++){
                if(coordinates[points][0] != coordinates[0][0]) return false;
            }
            return true;
        }else{
            double m1 = (double)(coordinates[1][1] - coordinates[0][1]) / (double)(coordinates[1][0] - coordinates[0][0]);
            for(int points = 1; points<coordinates.length-1; points++){
                if( (coordinates[points+1][0] - coordinates[points][0])==0 ) return false;
                double m2 = (double)(coordinates[points+1][1] - coordinates[points][1]) / (double)(coordinates[points+1][0] - coordinates[points][0]);
                if(m2 != m1) return false;
            }
            return true;
        }
    }
}
