class DecToBin
{
	public static void main(String args[])
	{
		int n=12;
		String bin="";
		while (n>0)
		{
			int r=n%2;
			bin=r+bin;
			n=n/2;
		}
		System.out.println(bin);
	}
}