package Hw4;

public class GlobalVariable{
	int a =45,b = 15;
	int sum() {
		int ans1 = a + b;
		return ans1;
	}
	
	int sub() {
		int ans2 = a-b;
		return ans2;
	}
	
	int multiply() {
		int ans3 = a*b;
		return ans3;
	}
	
	int divide () {
		int ans4 =a/b;
		return ans4;
	}
	int mod () {
	   int ans5 = a%b;
	   return ans5;
	}

	

public static void main(String[] args) {

	GlobalVariable g = new GlobalVariable();
	
		int output1 = g.sum();
		System.out.println("addition is "+output1);
		
		int output2 =g.sub();
		System.out.println("substraction is "+output2);
		
		int output3 =g.multiply();
		System.out.println("multiplication is "+output3);
	
		float output4 =g.divide();
		System.out.println("division i "+output4);
	
		int output5 = g.mod();
		System.out.println("mod is "+ output5);
	

		}
}