import java.util.Scanner;
class Power
{
	public static void main(String args[])
	{
		int num,pow,temp;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scn.nextInt();
		System.out.println("Enter the power");
		pow=scn.nextInt();
		temp=num;
		for(int i=1;i<pow;i++)
			num=temp*num;
		System.out.println(num);
	}
}