//coin exchange new
class Coin1
{
	static int min;
	static int minElement(int arr[], int index, int val)
	{
		min = arr[index];
		if(index > arr.length - 1)
		{
			return min;
		}

		if(val % arr[index] < min)
		{
			min = arr[index];
		}
		else
		{
			return minElement(arr, index + 1, val);
		}
		
		
	}
	public static void main(String args[])
	{
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n = s.nextInt();				// no. of different type of coins
		int arr[] = new int[n]; 			// Different coins
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		int amount = s.nextInt();			// total amount 
		//System.out.println(coinExchange(arr, amount, arr.length - 1));
		System.out.println(coinExchange(arr, 0, amount));		
	}
}