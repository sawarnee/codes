//MergeSort
class MergeSort
{

	public static void mergeSort(int[] input)
	{
	      	mergeSort(input, 0, input.length - 1);		
	}
  
  	public static void mergeSort(int[] input, int startIndex, int endIndex)
  	{
	      	if(startIndex >= endIndex)
        	{
          		return;
        	}
      
      		int mid = (startIndex + endIndex) / 2;
      	
      		mergeSort(input, startIndex, mid);
      		mergeSort(input, mid + 1, endIndex);
      
      		merge(input, startIndex, mid, endIndex);
    	}
  
  	public static void merge(int[] input, int startIndex, int mid, int endIndex)
    	{
      
      		int left[] = new int[mid - startIndex + 1];
      	
      		int right[] = new int[endIndex - mid];


		for (int i=0; i<left.length; ++i)
            		left[i] = input[startIndex + i];
        	for (int j=0; j<right.length; ++j)
            		right[j] = input[mid + 1 + j];

      
      		int i = 0;
      		int j = 0;
      		int k = startIndex;
      
      		while(i < left.length && j < right.length)
        	{
          		if(left[i] <= right[j])
            		{
              			input[k] = left[i];
              			i++;
            		}
          		else
            		{
              			input[k] = right[j];
              			j++;
            		}
          		k++;
        	}
      
      		while(i < left.length)
        	{
          		input[k] = left[i];
          		i++;
          		k++;
        	}

       		while(j < right.length)
        	{
          		input[k] = right[j];
          		j++;
          		k++;
        	}
    	}

	public static void main(String args[])
	{
		int arr[] = {6,2,4,3,1,5};
		mergeSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
