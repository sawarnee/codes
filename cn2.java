//Dynamic Array class
class DynamicArray
{
	int arr[];
	int nextindex;
	public DynamicArray()
	{
		arr = new int[5];	
	}
	public int size()
	{
		return nextindex;
	}
	public void add(int value)
	{
		if(nextindex == arr.length)
		{
			restructure();
		}
		arr[nextindex] = value;
		nextindex++;
	}
	public int get(int index)
	{
		if(index < nextindex)
		{
			return arr[index];
		}
		else
		{
			return -1;
		}
	}
	public boolean isEmpty()
	{
		if(size() == 0)
		{
			return true;
		}
		else
		{	
			return false;
		}
	}
	public void set(int index, int value)
	{
		if(index > nextindex)
		{
			return;
		}
		else if(index < nextindex)
		{
			arr[index] = value;
		}
		else
		{
			add(value);
		}
	}
	public int removeLast()
	{
		if(size()==0)
		{
			return -1;
		}
		int value = arr[nextindex-1];
		nextindex--;
		return value;
	}
	private void restructure()
	{
		int temp[] = arr;
		arr = new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
		{
			arr[i] = temp[i];
		}
	}
}
class Call
{
	public static void main(String args[])
	{
		//add, set, isEmpty, get, removeLast, size//
		DynamicArray d = new DynamicArray();

		for(int i=0;i<100;i++)
		{
			d.add(i+10);
		}
		
		System.out.println(d.size()+"\n");

		//d.set(101,72);

		//for(int i=0;i<d.size();i++)
		//{
		//	System.out.println(d.get(i));
		//}

		//System.out.println(d.get(11));

		//System.out.println("\n"+d.removeLast());
		//System.out.println(d.size());

		while(!d.isEmpty())
		{
			System.out.println(d.removeLast());
			System.out.println("size : "+d.size()+"\n");
		}

	}	
}