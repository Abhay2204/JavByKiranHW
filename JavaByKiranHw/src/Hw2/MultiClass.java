package Hw2;
public class MultiClass{
	public static void main (String[]args) {
	
	Addition a = new Addition();
	SubsTraction s = new SubsTraction();
	Multiply m = new Multiply();
	Divide d = new Divide();
	Mod m1 = new Mod();
	
	double add = a.add(34, 56);
	System.out.println("Addition is "+ add);
	double sub =s.sub(10);
	System.out.println("substraction is " + sub);
	double mul = m.mul(20);
	System.out.println("multiplication is " + mul);
	double div = d.div(10);
	System.out.println("division is "+ div);
	double mod = m1.Mod(5);
	System.out.println("modulus is "+ mod);

}
}