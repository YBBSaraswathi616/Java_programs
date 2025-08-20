package operators;

import java.util.Scanner;

public class ArithmeticUsingscanner {
	public static void main(String[] ao) {
		int a,b,sum;
		Scanner obj=new Scanner (System.in);//scanner open
		System.out.println("enter a value =");
		a=obj.nextInt();
		System.out.println("enter b value =");
		b=obj.nextInt();
		
		sum=a+b;
		System.out.println("a+b is"+sum);
		
		
		
		System.out.println("enter a string value =");
		String str1=obj.nextLine();
		System.out.println("enter b string value =");
		String str2=obj.nextLine();
		
		String str3=str1+str2;
		System.out.println("the concatenated string is"+str3);
		
		
		obj.close();//scanner ends
	}
}
