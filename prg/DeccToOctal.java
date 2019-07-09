class DeccToOctal
{
	public static void main(String args[])
	{
		int n=12;
		String bin="";
		while(n>0)
		{
			int r=n%8;
			bin=r+bin;
			n=n/8;
		}
		System.out.println(bin);
	}
}