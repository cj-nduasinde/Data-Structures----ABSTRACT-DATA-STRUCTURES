
import java.util.*;

public class AFIFOQueueClass{

	CirclingUnsortedArrayClass AQ = new CirclingUnsortedArrayClass(10); 

	public void enqueue(int item)
	{
		AQ.appendToLast(item);
	}

	public int dequeue()
	{
		return AQ.removeFromFirst();
	}

	public void display()
	{
		AQ.display();
	}
	
}

