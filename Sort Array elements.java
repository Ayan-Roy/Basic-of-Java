package Array;
import java.util.Scanner;
public class Version1 {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int size;
			System.out.print("Enter the saize of the Array: ");
			size = scan.nextInt();
			int[] array = new int [size] ;
			for(int i =0; i<size; i++) {
				System.out.print("Elements: ");
				array[i]= scan.nextInt();
			}
			int temp;
			for(int i=0; i<size; i++) {
				
				for(int j=i+1; j<size; j++) {
					
					if(array[i]>array[j]) {
						
						temp = array[i];
						array[i]  = array[j];
						array[j] = temp;
					}
				}
			}
			
			System.out.println("Sorted Array is: ");
			
			for(int i:array) {
				System.out.print(i+"  ");
			}
			
		}	
			
}
