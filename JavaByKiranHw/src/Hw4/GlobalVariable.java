package Hw4;

import HW1.Hw1;

public class GlobalVariable{
	int sum(int a, int b) {
		int ans1 = a + b;
		return ans1;
	}
	
	int sub(int a, int b) {
		int ans2 = a-b;
		return ans2;
	}
	
	int multiply(int a, int b) {
		int ans3 = a*b;
		return ans3;
	}
	
	int divide (int a,int b) {
		int ans4 =a/b;
		return ans4;
	}
	int mod (int a,int b) {
	   int ans5 = a%b;
	   return ans5;
	}

	

public static void main(String[] args) {

	
		
			Hw1 s = new Hw1();
			int output1 = s.sum(45, 15);
			System.out.println("addition is "+output1);
			
			int output2 =s.sub(45, 15);
			System.out.println("substraction is "+output2);
			
			int output3 =s.multiply(45, 15);
			System.out.println("multiplication is "+output3);

			float output4 =s.divide(45, 15);
			System.out.println("division i "+output4);

			int output5 = s.mod(44,15);
			System.out.println("mod is "+ output5);


		}
}