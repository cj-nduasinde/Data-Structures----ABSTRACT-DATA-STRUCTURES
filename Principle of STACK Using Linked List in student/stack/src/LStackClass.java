
public class LStackClass {
LinkedListClass ls;
public LStackClass()
{
ls = new LinkedListClass();
}
public void Push (Student x)
{
	ls.Append (x);
	}
public Node Pop()
{
	return ls.Remove();
	
	}
public void Print()
{ 
	ls.PrintList();
	}

}
