//Fraction
class Fraction
{
	private int nr;
	private int dr;
	public Fraction(int nr,int dr)
	{
		this.nr = nr;
		this.dr = dr;
		simplify();			
	}
	public void print()
	{
		System.out.println(nr+"/"+dr);
	}
	private void simplify()
	{
		int res = 1;
		int min = Math.min(nr,dr);
		for(int i=2;i<=min;i++)
		{
			if((nr%i == 0)&&(dr%i == 0))
			{
				res = i;
			}
		}
		nr = nr/res;
		dr = dr/res;
	}
	public void add(Fraction f)
	{
		nr = nr*f.dr+dr*f.nr;
		dr = dr*f.dr;
		simplify();
	}
	public void multiply(Fraction f)
	{
		nr = nr*f.nr;
		dr = dr*f.dr;
		simplify();
	}

	public static Fraction add(Fraction f1, Fraction f2)
	{
		int newnr = f1.nr*f2.dr+f1.dr*f2.nr;
		int newdr = f1.dr*f2.dr;
		Fraction fr = new Fraction(newnr,newdr);
		return fr;		
	}
}
class Frac
{
	public static void main(String args[])
	{
		Fraction fr1 = new Fraction(20,30);
		Fraction fr2 = new Fraction(10,30);
		Fraction fr3 = new Fraction(30,40);
		
		fr1.add(fr2);

		fr2.multiply(fr3);

		fr1.print();
		fr2.print();
		fr3.print();

		Fraction f = Fraction.add(fr1,fr2);	
		f.print();

	}
}

















