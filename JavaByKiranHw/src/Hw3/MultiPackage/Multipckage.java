package Hw3.MultiPackage;


import Hw3.Addition.Add;
import Hw3.Substraction.sub;
import Hw3.Divide.Divide;
import Hw3.Modulus.Mod;
import Hw3.Multiplication.Multiply;

public class Multipckage{
	public static void main(String[] args) {
		Add a = new Add();
		double output1 = a.sum(20, 30);
		System.out.println(output1);
		
		sub s = new sub();
		double output2 = s.substract(8);
		System.out.println(output2);
		
	    Multiply m = new Multiply();
		double output3 = m.mul(10);
		System.out.println(output3);
		
		Divide d = new Divide();
		double output4 = d.div(5);
		System.out.println(output4);
		Mod m1 = new Mod();
		double output5 = m1.Modulus(5); 
		System.out.println(output5);

		
	}
}