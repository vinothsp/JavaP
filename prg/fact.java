import java.util.Scanner;
class fact
{
	public static void main(String args[])
	{
		int n, sum=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		n=scn.nextInt();
			for(int i=1; i<=n; i++)
				sum=sum*i;
			System.out.println(sum);
	}
}