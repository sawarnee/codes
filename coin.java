//Coin exchange problem
class Coin
{
	static int count;
	static int coinExchange(int arr[], int val, int last)
	{
		if((val <= 0) || (last < 0))
		{
			return count;
		}
		
		if(arr[last] <= val)
		{
			count++;
			return coinExchange(arr, val - arr[last], last);
		}
		else
		{
			return coinExchange(arr, val, last - 1);
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
		System.out.println(coinExchange(arr, amount, arr.length - 1));
	}
}