

public class DLFIFOQueueClass {
DoubleLinkedListClass Dll;

public DLFIFOQueueClass()
{ Dll=new DoubleLinkedListClass();
	}
public void Enqueue(Student x)
{
	Dll.AppendToTail(x);
	}
public Node Dequeue ()
{
return Dll.RemoveFromHead();
	}
public void Print() {
	Dll.PrintList();
}
}
