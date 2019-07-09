class pow
{
	public static void main(String args[])
	{
		int base=3,power=4;
		int res;
		int a=sq(base,power);
		System.out.println(a);
	}
	static int sq(int a1,int a2)
	{
		for(int i=1;i<=a2/2;i++)
		{
			a1=a1*a1;
		}
		return a1;
	}
}
