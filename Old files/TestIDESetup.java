/*
	This is for debugging or test the IDE or only testing purposes.
*/

public class TestIDESetup{
	public static int testOpp(int a, int b, String oppName){
		int res = 0;
		if (oppName == "addition")
			res = a+b;
		else if (oppName == "substraction")
			res = a-b;
		else if (oppName == "multiplication")
			res = a*b;
		else if (oppName == "division")
			res = a/b;
			
		return res;
	}
	
	public static void main(String[] arg){
		int res = testOpp(4, 3, "multiplication");	
		System.out.println("result ->> "+res);	
	}
}