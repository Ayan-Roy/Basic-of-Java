
import java.util.Scanner;
public class Array {
	
	public static void main( String [] args)
	{		
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("Enter the Size of the Array: ");
		n = scan.nextInt();
		
		int [] Array;
		Array = new int [n];

		for(int i=0; i<n; i++)
		{
			Array[i] = scan.nextInt();
		}
		System.out.println("The Array is : ");
		for(int i =0; i<n; i++)
		{
			System.out.printf("    %d",Array[i]);
		}
		
		System.out.println();
		sum(Array, n);
	}
	
	public static void sum (int [] arr, int n)
	{
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			sum+=arr[i];
		}
		
		System.out.printf("Sum of the Array is %d ",sum);
	}

}
