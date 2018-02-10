//Recursion
import java.util.ArrayList;
class Factorial
{
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		//int smallAns = fact(n-1);
		return n * fact(n-1);
	}
	public static void main(String args[])
	{
		int n = 6;
		System.out.println(fact(n));
	}
}
class Sum
{
	public static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n + sum(n-1);
	}
	public static void main(String args[])
	{
		int n = 6;
		System.out.println(sum(n));
	}
}
class Fibonacci
{
	public static int fib(int n)
	{
		if(n==1 || n==0)
		{
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	public static void main(String args[])
	{
		int n = 5;
		System.out.println(fib(n));
	}
}
class Sorting
{
	public static boolean checkSort(int arr[])
	{
		if(arr.length <= 1)
		{
			return true;
		}
		int smallArray[] = new int[arr.length - 1];
		for(int i=1;i<arr.length;i++)
		{
			smallArray[i-1] = arr[i];
		}
		boolean smallans = checkSort(smallArray);
		if(!smallans)
		{
			return false;
		}
		if(arr[0] <= arr[1])
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean checkSort_1(int arr[])
	{
		if(arr.length <= 1)
		{
			return true;
		}
		if(arr[0] > arr[1])
		{
			return false;
		}
		int smallArray[] = new int[arr.length - 1];
		for(int i=1;i<arr.length;i++)
		{
			smallArray[i-1] = arr[i];
		}
		boolean smallans = checkSort_1(smallArray);
		return smallans;
	}
	public static boolean checkSortBetter(int arr[], int startIndex)
	{
		if(startIndex == arr.length - 1)
		{
			return true;
		}	
		if(arr[startIndex] > arr[startIndex + 1])
		{
			return false;
		}
		boolean ans = checkSortBetter(arr, startIndex + 1);
		return ans;
	}
	public static boolean checkSortBetter(int arr[])
	{
		return checkSortBetter(arr, 0);
	}
	public static void main(String args[])
	{
		int arr[] = {0,1,2,3,4,5};
		//System.out.println(checkSort(arr));
		//System.out.println(checkSort_1(arr));
		System.out.println(checkSortBetter(arr));
	}
}
class allIndexes
{
  	static ArrayList<Integer> al = new ArrayList<Integer>();
	public static int[] allIndexes(int input[], int x) 
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      		return allIndexes(input, x, 0);
	}
  
  	public static int[] allIndexes(int arr[], int x, int startIndex)
	{
	      	if(startIndex > arr.length - 1)
        	{
          		int finalans[] = new int[al.size()];
			for(int i=0;i<finalans.length;i++)
			{
				finalans[i] = al.get(i);
			}
			return finalans;
        	}
      		if(arr[startIndex] == x)
        	{
          		al.add(startIndex);
        	}
      		int ans[] = allIndexes(arr, x, startIndex + 1);
      		return ans;
    	}	
	public static void main(String args[])
	{
		int arr[] = {9,8,10,8,8};
		int newarr[] = allIndexes(arr, 8);
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}
	}
}

























