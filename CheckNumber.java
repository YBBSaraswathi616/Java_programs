package HomeworkPrograms;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String positivenegativezero []) 
	{
		
	 Scanner scanner = new Scanner(System.in);  
    System.out.println("Enter a number: ");	
	 int num  = scanner.nextInt();
	
	 if (num >0) {
		System.out.println(  num + " number is positive" );
		
	 }
	 else if(num <0) {
		 System.out.println(" number is negative" + num);
			
	 }
	 else {
		 System.out.println(" number is zero" + num);
			
	 }
	 
	}
}
