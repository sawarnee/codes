import java.util.Scanner;
class MergeSortPractice
{
	static void mergeSort(int arr[])
	{
		mergeSort(arr, 0, arr.length - 1);
	}
	static void mergeSort(int arr[], int startIndex, int endIndex)
	{
		if(startIndex >= endIndex)
		{
			return;
		}

		int mid = (startIndex + endIndex) / 2;

		mergeSort(arr, startIndex, mid);

		mergeSort(arr, mid + 1, endIndex);

		merge(arr, startIndex, endIndex, mid);

	}
	static void merge(int arr[], int startIndex, int endIndex, int mid)
	{

		int left[] = new int[mid - startIndex + 1];

		int right[] = new int[endIndex - mid];

		for(int i=0;i<left.length;i++)
		{
			left[i] = arr[i + startIndex];
		}

		for(int i=0;i<right.length;i++)
		{
			right[i] = arr[i + mid + 1];
		}

		int i = 0;
		int j = 0;
		int k = startIndex;

		while(i < left.length && j < right.length)
		{
			if(left[i] <= right[j])
			{
				arr[k] = left[i];
				i++;
				k++;
			}
			else
			{
				arr[k] = right[j];
				j++;
				k++;
			}
		}

		while(i < left.length)
		{
			arr[k] = left[i];
			i++;
			k++;
		}

		while(j < right.length)
		{
			arr[k] = right[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		mergeSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}