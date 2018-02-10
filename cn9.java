//printing string subsequences directly without storing them
class PrintSubsequences
{
	public static void printSubsequences(String input)
	{
		printSubsequences(input, "");	
	}
	public static void printSubsequences(String input, String output)
	{
		if(input.length() == 0)
		{
			System.out.println(output);
			return;
		}
		printSubsequences(input.substring(1), output);	
		printSubsequences(input.substring(1), output + input.charAt(0));
	}
	public static void main(String args[])
	{
		String s = "xyz";
		printSubsequences(s);
	}
}