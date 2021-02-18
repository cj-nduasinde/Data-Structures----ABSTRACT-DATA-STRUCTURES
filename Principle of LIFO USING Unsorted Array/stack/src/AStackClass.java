import java.util.*;

public class AStackClass
{
	
    UnsortedArrayClass AS;
    
    public AStackClass ()
    {
    	AS = new UnsortedArrayClass(100);
    }

	public void push(int item)
	{
		AS.append(item);
	}

	public int pop()
	{
		return AS.remove();
	}

	public void print()
	{
		AS.display();
	}
}

