import java.util.*;

 class AStackTest 
{
	public static void main(String args[])
	{
		/* Create an empty stack with a space for 200 items */
		AStackClass S = new AStackClass();
		
		/* Push n items to the empty array */
		System.out.println("Enter the number of items to append:");
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("Enter %1$s items" + "\r\n", n);
		for (int i = 0; i < n; i++)
		{
			int item = Integer.parseInt(new Scanner(System.in).nextLine());
	        S.push(item);
		};
	    System.out.println("Display all items in the array:");
		S.print();
		
		/* Test the operations */
		System.out.println("Enter 1 for push, 2 for pop, 3 for display");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3)
		{
			if (s == 1)
			{
				System.out.println("Enter the item for push");
				int item = Integer.parseInt(new Scanner(System.in).nextLine());
				S.push(item);
				System.out.println("Display all items:");
				S.print();
			};
			if (s == 2)
			{
				int item = S.pop();
				System.out.println("The item popped out is:");
				System.out.println(item);
				System.out.println("Display all items:");
				S.print();
			};
			if (s == 3)
			{
				S.print();
			};
			
			System.out.println("Enter 1 for push, 2 for pop, 3 for display");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
	}
}

