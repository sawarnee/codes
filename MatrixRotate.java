import java.util.Scanner;
class MatrixRotate
{
	static void print(int arr[][])
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static int[][] rotate(int arr[][])
	{
		int newarr[][] = new int[4][4];
		for(int j=3, x=0 ; j>=0 || x<4 ; j--, x++)
		{
			for(int i=0, y=0 ; i<4 || y<4 ; i++, y++)
			{
				newarr[x][y] = arr[i][j];
			}
			//System.out.println();
		}		
		return newarr;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		print(arr);
		System.out.println("==================");
		int newarr[][] = rotate(arr);
		print(newarr);
	}
}