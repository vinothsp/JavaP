import java.util.Scanner;
class Big
{
	public static void main (String[] args)
	{
		int a,b,c,big;
		System.out.println("Enter the values of a,b and c");
		Scanner scn = new Scanner(System.in);
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		big=(a>b)? (a>c)? a : b : (b>c)? b : c;
		System.out.println("Biggest of three number "+big);
	}
}