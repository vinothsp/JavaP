class Permute
{
	public static void main(String args[])
	{
		int n=5;
		int r=2;
		
		double p,c;
		System.out.println("Permutetion");
		p=fact(n)/fact(n-r);
		System.out.println(p);
		System.out.println("Combination");
		c=fact(n)/(fact(r)*fact(n-r));
		System.out.println(c);
	}
	static int fact(int arg)
		{
			int f=1;
			for(int i=1;i<=arg;i++)
			{
			   f=f*i;
			}
		    return f;
		}
}