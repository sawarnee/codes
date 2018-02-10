import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

//int[][] subsets
class Solution 
{

	public static int[][] subsets(int input[]) 
	{
	   	return subsets(input, input.length - 1);
   	}
  
    public static int[][] subsets(int input[], int index)
    {
      	if(index <= 0)
        {
        	int newarr[][] = {{}, {input[index]}};
        	return newarr;
        }

      	int ans[][] = subsets(input, index - 1);
      
      	int finalans[][] = new int[ans.length * 2][];
      
      	for(int i=0; i<ans.length; i++)
        {
            for(int j=0; j<ans[i].length; j++)
            {
	        	finalans[i][j] = ans[i][j];
              	finalans[i + ans.length][j] = ans[i][j];
              	finalans[i + ans.length][j + 1] = input[index];
            }
        }
      
      	return finalans;
      
    }
    public static void main(String args[])
    {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    input[i] = s.nextInt();
		}

		int arr[][] = subsets(input);

		for(int i=0; i<arr.length; i++)
	 	{
		    for(int j=0; j<arr[i].length; j++)
		    {
				System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}

    }
}








class Demo1
{
	public static void main(String args[])
	{
		String tickets[] = {"129300455", "55559948277", "012334556", "56789", "123456879"};		
		String a[] = {"0","1","2","3","4","5","6","7","8","9"};

		int counter = 0;
		for(int i = 0; i<tickets.length-1; i++)
		{
			for(int j=i+1; j<tickets.length; j++)
			{
				int count = 0;
				for(int k=0;k<a.length;k++)
				{
					if((tickets[i]+tickets[j]).contains(a[k]))
					{
						count++;
					}
				}
				if(count == 10)
				{
					counter++;
				}
			}
		}

		System.out.println(counter);


		/*int count = 0;
		for(int i=0;i<a.length;i++)
		{
			if((tickets[3]+tickets[4]).contains(a[i]))
			{
				count++;
			}
		}

		if(count == 10)
		{
			counter++;
		}
	
		System.out.println(counter);*/
	}
}
class Demo
{
	public static boolean checkAB(String input) 
	{      
      
      		/*if(input.charAt(0) != 'a')
        	{
          		return false;
        	}
		else
        	{
	      		return checkAB(input, 0);          	
	        }*/
      
      		return checkAB(input, 0);
	}

	public static boolean checkAB(String input, int index) 
	{      
      	
      		if(index >= input.length())
        	{
        	  	return true;
        	}
      
      		boolean ans = false;
      
	      	if(input.substring(index, index + 1) == "a")
        	{
         		ans = checkAB(input, index + 1);
        	}
      		else if(input.substring(index, index + 2) == "bb")
        	{
        	  	ans = checkAB(input, index + 2);
        	}
      		/*else
        	{
        	  	ans = false;
        	}*/
      
      		return ans;
	}

	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(checkAB(str));
	}
}
/*class A<T>
{
	T pair(T val)
	{
		T value = val;
		return T;
	}	
}*/
class Demo2
{
	static <T>T print(T a)
	{
		return a;
	}
	public static void main(String args[])
	{
		System.out.println(print(4));
		print("sas");
		print('c');
	}
}