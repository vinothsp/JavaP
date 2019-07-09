import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scn.nextInt();
		for(int i=2; i < num; i++)
		{
			if(num % i==0)
			{
			System.out.println("Not a Prime no");
			System.exit(0);
			}
		}
		System.out.println("Prime no");
	}
}