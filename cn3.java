//Polynomial class
/* Signature of four required functions is given in the code. You can create other functions as well if you need.
*  Also you should submit your code even if you are not done with all the functions. 
*/

// Main used internally is shown here just for your reference.

import java.util.Scanner;
class Call
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++)
		{
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			degree2[i] = s.nextInt();
		}
		int coeff2[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++)
		{
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice)
		{
		// Add
		case 1: 
			//result = first.add(second);
			//result.print();
			first.print();
			break;
		// Subtract	
		case 2 :
			result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			result = first.multiply(second);
			result.print();
			break;
		}

	}
}

class Polynomial {

  
  	int coefficients[];
  	int counter = 0;
	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
  
  	public Polynomial()
    	{
      		coefficients = new int[100000];
    	}
  
	public void setCoefficient(int degree, int coeff)
    	{
		if(coeff == 0)
        	{
        	  	return;
        	}
      		else
        	{
          		coefficients[degree] = coeff;
          		counter++;
        	}
		
	}
  
  	public int size()
    	{
      		return counter;
    	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print()
    	{
		for(int i=0;i<=size();i++)
        	{
			if(coefficients[i] != 0)
			{
          			System.out.print(coefficients[i]+"x^"+i+" ");
        		}
		}
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p)
	{

		return null;		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p)
	{
	
		return null;		
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p)
	{
	
		return null;	
	}

}
