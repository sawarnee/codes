//String subsequences
class Subsequence
{
	public static String[] subsequences(String s)
	{
		if(s.length() == 0)
		{
			String ans[] = {""};
			return ans;
		}
		String[] smallans = subsequences(s.substring(1));
		String[] ans = new String[smallans.length * 2];
		for(int i=0; i<smallans.length;i++)
		{
			ans[i] = smallans[i];
			ans[i + smallans.length] = s.charAt(0) + ans[i];
		}

		return ans;

	}
	public static void main(String args[])
	{
		String s = "wxyz";
		String ans[] = subsequences(s);
		for(int i=0; i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
}