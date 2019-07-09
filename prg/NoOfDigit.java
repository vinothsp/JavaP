import java.util.Scanner;
class Power
{
	public static void main(String args[])
	{
		int num;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scn.nextInt();
		System.out.println("Enter the power");
		pow=scn.nextInt();
		for(int i=1;i<pow;i++)
			num=num*num;
}