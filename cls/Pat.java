public class Pat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		String str="WAFFOROFFER";
		String rev="";
		char chArr[]=str.toCharArray();
		for(int i=chArr.length-1;i>=0;i--)
		{
			rev=rev+chArr[i];
		}
		char chRev[]=rev.toCharArray();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
					System.out.print(chArr[i]+" ");
				else if(i+j==n-1)
					System.out.print(chRev[i]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
