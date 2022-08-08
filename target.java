import java.util.Scanner;
import static java.lang.System.*;

public class target    // it is our  main class
{
	public static void main(String args[]) // it is our main method
	{
		Scanner ps = new Scanner(System.in);
		out.println("Enter the length of array = ");
		int len = ps.nextInt();  // here we read the array elements
		
		int[] arr;              // creating array 
		arr = new int[len];
		out.println("Enter "+len+" elements = ");	
		
		for(int i=0;i<len;i++)   // this for loop is we used for storing elements
		{
			arr[i]= ps.nextInt();
		}
		out.println("Enter the Sum of two number = ");
		int target = ps.nextInt();
		
		search bs = new search();    // creating objects for subclass 
		
		bs.Sum(arr,len,target);
		ps.close();
	}
}

class search    // it is our sub class
{
	public void Sum(int arr[],int len,int target)
	{
		int lenght = len;
		for(int i=0;i<lenght;i++)
		{
			for(int j=i+1;j<lenght;j++)
	       	{
				if(target == arr[i]+arr[j])
				{
					out.print("Element: ["+arr[i]+","+arr[j]+"]");
					
				}
			}
		}
	}
}