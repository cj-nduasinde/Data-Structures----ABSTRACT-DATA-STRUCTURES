import java.util.*;

public class CirclingUnsortedArrayClass
{
	int first, last; 
    int[] arr;


	public CirclingUnsortedArrayClass(int scale)
	{
		arr = new int[scale];
		first = -1; 
		last = -1; 
	}

	public double get(int i)
	{
		return arr[i];
	}

	public int nextIndex(int currentIndex)
	{ 
		int next; 
		if (currentIndex == arr.length - 1)
			next = 0;
		else 
            next = currentIndex + 1;
		return next; 
	}
	
	public int previousIndex(int currentIndex)
	{ 
		int previous; 
		if (currentIndex == 0)
			previous = arr.length - 1;
		else 
            previous = currentIndex - 1;
		return previous; 
	}
	
	public boolean arrayFull()
	{
		if ((first == 0 && last == arr.length - 1) || (first == last + 1))
		    return true;
		else 
			return false;
	}
	
	public boolean arrayEmpty()
	{
		if (first == -1 && last == -1) 
		    return true;
		else 
			return false;
	}
	
	public int search(int Key)
	{
		if (arrayEmpty())
		{
			System.out.println("It is empty!");
			return -1;
		}
		else
		{
			int i = first;
			while (i != last && arr[i] != Key)
				i = nextIndex(i);
			if (arr[i] == Key)  
				return i;
			else
			{
				System.out.println("There is no such item!");
				return -1;
			}
		}
	}

	public void appendToLast(int Item)
	{
		if (arrayFull()) 
			System.out.println("It is full!");
		else
		{
			if (arrayEmpty())
			{
				first = 0;
			    last = 0;
			}
			else
                last = nextIndex(last);
			arr[last] = Item;
		}; 
	}

	public int removeFromLast()
	{
		if (arrayEmpty() == true)
		{
			System.out.println("It is empty!");
			return -1;
		}
		else 
		{
		  int x = arr[last];
		  if (first == last)
			  first = last = -1;
		  else 
		      last = previousIndex(last);
		  return x;
		}
	}
	
	public void appendToFirst(int Item)
	{
		if (arrayFull()) 
			System.out.println("It is full!");
		else 
		{
			if (arrayEmpty())
			{
			 	first = 0; 
			 	last = 0;
			}
			else
				first = previousIndex(first);
			arr[first] = Item;
		}
	}

	public int removeFromFirst()
	{
		if (arrayEmpty() == true)
		{
			System.out.println("It is empty!");
			return -1;
		}
		else 
		{
		  int x = arr[first];
		  if (first == last)
			  first = last = -1;
		  else 
		      first = nextIndex(first);
		  return x;
		}
	}
	
	public void deletion(int Key)
	{
		int k = search(Key);
		if (k != -1)
		{
			if (first == last)
			{
				first = -1;
				last = -1;
			}
			else
			{
				for (int i = k; i <= last; i++)
					arr[i] = arr[i + 1];
				
				last = previousIndex(last);
			}
		}
	}

	public void display()
	{
		if  (arrayEmpty())
			System.out.println("It is empty!");
		else
		{
			int i = first;
			System.out.println(arr[i]);
			while (i != last)
			{
				i = nextIndex(i);
				System.out.println(arr[i]);
			}
		}
	}
}

