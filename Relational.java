package operators;

import java.util.Scanner;

public class Relational {
	public static void main(String[] ro) {
		int a,b;// true or false will get as a result
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=obj.nextInt();
		System.out.println("Enter the second number");
		b=obj.nextInt();
		System.out.println(a>b); // a is greater than b
		System.out.println(a<b); // a is less than b
		System.out.println(a==b); // a is equal to b
		System.out.println(a!=b);// a is not equal to b
		System.out.println(a>=b); // a is greater than or equal to b
		System.out.println(a<=b); //a is less than or equal to  b
	}
	
}
