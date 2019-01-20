//Insertion Sort, Selection Sort, Bubble Sort
import java.util.Scanner;
class InsertionSort
{
	static int[] insertionSort(int arr[])
	{
		int out[] = new int[arr.length];
		out[0] = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			for(int j=0;j<out.length;j++)
			{
				if(arr[i] <= out[j])
				{
					out[j+1] = out[j];
					out[j] = arr[i];
				}
			}
		}
		return out;
	}
}
class SelectionSort
{
	static int[] selectionSort(int[] arr)
	{	
		for(int i=0;i<arr.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] <= arr[min])
				{
					min = j;
				}
			}
			//swap(arr[i], arr[min]);
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
}
class BubbleSort
{
	static int[] bubbleSort(int[] arr)
	{
		for(int i=arr.length-1;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j] > arr[j + 1])
				{
					//swap(arr[j], arr[j+1]);
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
class Call
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);		
		int arr[] = {7,3,4,2,3,1,5,6,0};
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//int out[] = InsertionSort.insertionSort(arr);
		int out[] = SelectionSort.selectionSort(arr);
		//int out[] = BubbleSort.bubbleSort(arr);
		for(int i=0;i<out.length;i++)
		{
			System.out.print(out[i]+" ");
		}
	}
}