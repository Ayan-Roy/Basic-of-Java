package Array;
import java.util.Scanner;
public class Version1 {
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			int size =0;
			System.out.print("Enter the saize of the Array: ");
			size = scan.nextInt();
			String[] array = new String [size] ;
			for (int i=0; i<size; i++) {
				array[i]=scan2.nextLine();
			}
			
			System.out.print("Before  Sorting: ");
			for(String i: array) {
				System.out.print(i+"  ");
			}
			
			String temp;
			for(int i=0; i<size; i++) {
				for(int j=i+1; j<size; j++) {
					
					if(array[i].compareTo(array[j])>0) {
						
						temp = array[i];
						array[i]=array[j];
						array[j]= temp;
						
					}
					
				}
			}
			System.out.println();
			System.out.println("After sorted the Strings: ");
			for(String i: array) {
				System.out.print(i+"  ");
			}
						
		}	
			
}
