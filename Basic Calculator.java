package Calculator;

import java.util.Scanner;

public class Basic_Calculator {
	
	public static float addition(float num1, float num2) {
		return num1+num2;
	}
	
	public static float substraction(float num1, float num2) {
		
		return num1-num2;
	}
	
	public static float multiplication(float num1, float num2) {
		
		return num1*num2;
	}
	
	public static float division(float num1, float num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float ans = 0;
		System.out.print("Enter two numbers: ");
		float number1, number2;
		number1 = scan.nextFloat();
		number2 = scan.nextFloat();
		
		System.out.println("\t1.Addition");
		System.out.println("\t2.Substraction");
		System.out.println("\t3.Multiplication");
		System.out.println("\t4.Devision");
		System.out.println("ENter your choice");
		int choice;
		
		choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			ans = addition(number1, number2);
			break;
			
		case 2:
			ans = substraction(number1, number2);
			break;
		case 3:
			ans = multiplication(number1, number2);
			break;
		case 4:
			ans = division(number1, number2);
			break;
		default:
			System.out.println("Wrong selection.");
			
		}
		
		System.out.println("Answer is: "+ans);
	}

}
