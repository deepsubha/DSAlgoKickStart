/*
* Minimum number of coins
*/
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
class MinimumCoins{
	static Integer[] coins= {1, 2, 5, 10, 20, 50, 100, 500, 1000};  
	//Integer-> just for testing Compare class
	//in line 25 check for custom compare method
	static int len = coins.length;
	
	public static int minimunCoinsNeed(int val){
		Vector<Integer> ans = new Vector<Integer>();
		
		for(int l=len-1; l>=0; l--){
			while(val >= coins[l]){
				ans.add(coins[l]);
				val -= coins[l];
			}
		}
		
		/*
		for(int i=0; i<len; i++)
			System.out.println(coins[i]);
		Arrays.sort(coins, new Comparator<Integer>(){
			@Override
			public int compare(Integer i1, Integer i2){
				return i2.compareTo(i1);
			}
		});
		for(int i=0; i<len; i++)
			System.out.println(coins[i]);
		*/
			
		return ans.size();
	}

	public static void main(String[] args){		
		int minimunCoinsNeed = minimunCoinsNeed(93);
		System.out.println("minimunCoinsNeed: "+minimunCoinsNeed);
	}
}