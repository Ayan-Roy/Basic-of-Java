package counter;
import java.util.Scanner;
public class Version1 {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number: ");
			long number;
			number = scan.nextLong();
			
			int counter = 0;
			
			while(number>0) {
				
				number = number/10;
				counter++;
			
			}	
			
			System.out.println("Total number of degit is: "+ counter);	
			
		}	
			
}
