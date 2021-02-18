

public class Node
	{
		public Student item;
		public Node Flink;
	       public Node Blink;

		public Node(Student Item)
		{
			item = Item;
			Flink = null;
	             Blink = null;
		}

		public void DisplayNode()
		{
			System.out.println(item + "");
		}
	}




