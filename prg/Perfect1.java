import java.util.Scanner;
class Perfect1
{
	public static void main(String args[])
	{
		int num,sum=0,i=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scn.nextInt();
		while(i<=num/2)
		{
			if(num%i==0)
				sum = sum+i;
			i++;
		}
		if(sum == num)
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}
}