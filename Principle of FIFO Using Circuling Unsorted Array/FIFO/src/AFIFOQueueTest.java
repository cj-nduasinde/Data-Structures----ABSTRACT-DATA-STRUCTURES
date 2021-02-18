import java.util.*;

 class AFIFOQueueTest 
{
	public static void main(String args[])
	{
		/* Create an empty stack with a space for 200 items */
		AFIFOQueueClass AQ = new AFIFOQueueClass();
		
		/* Push n items to the empty array */
		System.out.println("Enter the number of items to enqueue:");
		int n = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.printf("Enter %1$s items" + "\r\n", n);
		for (int i = 0; i < n; i++)
		{
			int item = Integer.parseInt(new Scanner(System.in).nextLine());
	        AQ.enqueue(item);
		};
	    System.out.println("Display all items in the array:");
		AQ.display();
		
		/* Test the operations */
		System.out.println("Enter 1 for enqueue, 2 for dequeue, 3 for display");
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3)
		{
			if (s == 1)
			{
				System.out.println("Enter the item for enqueue");
				int item = Integer.parseInt(new Scanner(System.in).nextLine());
				AQ.enqueue(item);
				System.out.println("Display all items:");
				AQ.display();
			};
			if (s == 2)
			{
				int item = AQ.dequeue();
				System.out.println("The item dequeued is:");
				System.out.println(item);
				System.out.println("Display all items:");
				AQ.display();
			};
			if (s == 3)
			{
				AQ.display();
			};
			
			System.out.println("Enter 1 for enqueque, 2 for dequeue, 3 for display");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
	}
}


