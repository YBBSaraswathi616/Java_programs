package operators;

import java.util.Scanner;

public class Arithmetic {

	
	public static void main(String[] aas) {
		// TODO Auto-generated method stub
		int a,b,sum,sub,mul,div,mod;
		Scanner obj=new Scanner (System.in);
		System.out.println("Enter a value: ");
		a=obj.nextInt();
		System.out.println("Enter b value: ");
		b=obj.nextInt();
		System.out.println(" hello , welcome to Arithmetic operation2");
		sum = a+b;
		System.out.println("sum = "+sum);
		sub=a-b;
		System.out.println("sub="+sub);
		mul=a*b;
		System.out.println("mul="+mul);
		div=a/b;
		System.out.println("div="+div);
		mod=a%b;
		System.out.println("mod="+mod);
		obj.close();
	}
}
