/*/Users/subhadeepmaiti/Desktop/Practice-self/Java/MinimumCoins.java
* Fractional Knapsack Problem
*/
import java.util.Arrays;
import java.util.Comparator;
class Knapsack{
	//getting max value
	public static double getMaxValue(int[] wt, int[] val, int capacity){
		
		//forming itemvalue wrapper class for cost
		ItemValue[] ivalues = new ItemValue[wt.length];
		for(int i=0; i<wt.length; i++)
			ivalues[i] = new ItemValue(wt[i], val[i]);
			
		//sorting based on cost
		Arrays.sort(ivalues, new Comparator<ItemValue>(){
			@Override 
			public int compare(ItemValue i1, ItemValue i2){
				return i2.cost.compareTo(i1.cost);     // descending order 2nd.compareto(1st)
			}
		});
		
		for(ItemValue i: ivalues)
			        System.out.println("weight: "+ i.w +" Value: "+ i.v +" cost: "+i.cost);

		
		//calculate total value
		double totalValue = 0d;
		for(ItemValue i: ivalues){
			int curW = (int) i.w;
			int curV = (int) i.v;
			if(capacity - curW >= 0){
				capacity = capacity - curW;
				totalValue += curV;
			}else{
				double frac = (double)capacity/(double)curW;
				totalValue += curV * frac;
				capacity = (int)(capacity - (curW * frac));
				break;
			}
		}
		return totalValue;
	}
	
	//ItemValue wrapper class
	static class ItemValue{
		Double cost;
		int w;
		int v;
		public ItemValue(int w, int v){
			this.w = w;
			this.v = v;
			cost = new Double((double)v/(double)w);
		}
	} 

	//main method
	public static void main(String[] args){
		int[] wt = { 10, 40, 20, 30 };
        int[] val = { 60, 40, 100, 120 };
        int capacity = 50;
        
        double maxValue = getMaxValue(wt, val, capacity);
        System.out.println("Max value that can be fit in to Knapsack: "+maxValue);
	}
}