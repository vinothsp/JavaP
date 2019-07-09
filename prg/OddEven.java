import java.util.Scanner;
class OddEven
{
	public static void main(String args[])
	{
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		num = scn.nextInt();
		String msg = num%2==0? "EVEN NUMBER" : "ODD NUMBER";
		System.out.println(msg);
	}
}