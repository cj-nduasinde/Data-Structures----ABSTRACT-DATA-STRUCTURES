import java.util.*;

public class UnsortedArrayClass
{

	public static int[] arr;
	private int arraySize;

	public UnsortedArrayClass(int scale)
	{
		arr = new int[scale];
		arraySize = 0;
	}

	public double get(int i)
	{
		return arr[i];
	}

	public int search(int Key)
	{
		int i = 0;
		while ((i < arraySize) && (arr[i] != Key))
			i = i + 1;
		if (i < arraySize) 
			return i;
		else
		{
			System.out.println("There is no such item!");
			return -1;
		}
	}

	public void append(int Item)
	{
		if (arraySize == arr.length) 
			System.out.println("It is full!");
		else
			{ 
			  arr[arraySize] = Item;
		      arraySize = arraySize + 1;
			}; 
	}

	public int remove()
	{
		if (arraySize == 0)
		{
			System.out.println("It is empty!");
			return -1;
		}
		else 
		{
		  int x = arr[arraySize - 1];
		  arraySize = arraySize - 1;
		  return x;
		}
	}

	public void deletion(int Key)
	{
		int k = search(Key);
		if (k != -1)
		{
			for (int i = k; i < arraySize; i++)
				arr[i] = arr[i + 1];
			
			arraySize = arraySize - 1;
		}
	}

	public void display()
	{
		if  (arraySize == 0)
			System.out.println("It is empty!");
		else
			for (int i = 0; i < arraySize; i++)
			{
				System.out.println(arr[i]);
			};
	}
}

