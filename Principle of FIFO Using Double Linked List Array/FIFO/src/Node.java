
public class Node
	{
		public int item;
		public Node Flink;
	       public Node Blink;

		public Node(int Item)
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



