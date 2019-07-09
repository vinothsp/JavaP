import java.util.Scanner;
class Perfect
{
	public static void main(String args[])
	{
		int num,sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scn.nextInt();
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum == num)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}
}