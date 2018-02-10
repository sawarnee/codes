//Tower Of Hanoi
import java.util.Scanner;
class Call
{
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) 
	{
      		if(disks == 1)
		{
			System.out.println(source+" "+destination);
			return;
		}
		towerOfHanoi(disks - 1, 'a', 'c', 'b');
		towerOfHanoi(1, 'a', 'b', 'c');
		towerOfHanoi(disks - 1, 'b', 'a', 'c');
	}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}	
}