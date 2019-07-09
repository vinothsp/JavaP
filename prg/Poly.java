import java.util.Scanner;
class Poly
{
	public static void main(String args[])
	{
		int num;
		
		int rev=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no");
		num=scn.nextInt();
		int n=num;
		while(num>0)
		{
			int temp= num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		String msg=(n==rev)? "Palindrome":"Not a Polndrome";
		System.out.println(msg);
 		
	}
}