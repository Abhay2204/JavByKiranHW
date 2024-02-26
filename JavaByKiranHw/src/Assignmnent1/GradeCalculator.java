package Assignmnent1;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner (System.in);
System.out.println("Enter your percentage");
int p =  s.nextInt();
if(p >=90 ) {
	System.out.println("your grade is A");
}
else if(p>=80 && p<=89) {
	System.out.println("your grade is B");
}
else if(p>=70 && p<=79) {
	System.out.println("your grade is C");
}
else if(p>=60 && p<=69) {
	System.out.println("your grade is D");
}
else if (p>60) {
	System.out.println("your grade is F");
}
	}

}
