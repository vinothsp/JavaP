import java.util.Scanner;
class Swap
{
	public static void main (String[] args)
	{
		int a,b;
		System.out.println("Enter the values of a,b");
		Scanner scn = new Scanner(System.in);
		a=scn.nextInt();
		b=scn.nextInt();
		a=a+b-(b=a);
		System.out.println("a is "+ a+" b is "+b );
	}
}