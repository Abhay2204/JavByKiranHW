package Hw3.Modulus;

import Hw3.Divide.Divide;

public class Mod {
	public double Modulus(int f) {
		Divide d = new Divide();
		double total = d.div(5);
		double mod1 = total%f;
			return mod1;
	}
}