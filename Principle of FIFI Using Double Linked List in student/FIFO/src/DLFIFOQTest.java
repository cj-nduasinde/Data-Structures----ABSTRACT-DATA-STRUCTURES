
import java.util.Scanner;

public class DLFIFOQTest {

	
		public static void main(String args[])
		{
			int key;
			Student NewItem;
			/* Create an empty stack with a space for 200 items */
			DLFIFOQueueClass S = new DLFIFOQueueClass();
			
			/* Push n items to the empty array */
			System.out.println("Enter the number of items to append:");
			int n = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.printf("Enter %1$s items" + "\r\n", n);
			for (int i = 0; i < n; i++)
			{
				
		        S.Enqueue(new Student());
			};
		    System.out.println("Display all items in the array:");
			S.Print();
			
			/* Test the operations */
			System.out.println("Enter 1 for Enqueue, 2 for Dequeue, 3 for display");
			int s = Integer.parseInt(new Scanner(System.in).nextLine());
			while (s == 1 || s == 2 || s == 3)
			{
				if (s == 1)
				{
					System.out.println("Enter the item for Enqueue");
					
					S.Enqueue(new Student());
					System.out.println("Display all items:");
					S.Print();
				};
				if (s == 2)
				{
					Node removeNode = S.Dequeue();
					System.out.println("The item Dequeued out is:");
					System.out.println(removeNode.item);
					System.out.println("Display all items:");
					S.Print();
				};
				if (s == 3)
				{
					S.Print();
				};
				
				System.out.println("Enter 1 for Enqueue, 2 for Dequeue, 3 for display");
				s = Integer.parseInt(new Scanner(System.in).nextLine());
			}
		}
	}



