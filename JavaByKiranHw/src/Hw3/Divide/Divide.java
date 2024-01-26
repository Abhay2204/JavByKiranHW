package Hw3.Divide;

import Hw3.Multiplication.Multiply;

public class Divide{
	public double div(int e) {
		Multiply m = new Multiply();
		double total = m.mul(10);
		double div = total / e;
		return div;
	}
}