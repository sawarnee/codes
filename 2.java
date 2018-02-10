import java.util.Scanner;

class Solution {

    static int winningLotteryTicket(String[] tickets)
    {
        // Complete this function
        
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
        
        return counter;   
	
	//this is a comment.
	// comment added again.     
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] tickets = new String[n];
        for(int tickets_i = 0; tickets_i < n; tickets_i++){
            tickets[tickets_i] = in.next();
        }
        int result = winningLotteryTicket(tickets);
        System.out.println(result);
        in.close();
    }
}
