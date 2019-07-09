import java.util.Scanner;
class Leap
{
	public static void main (String[] args)
	{
		int year;
		System.out.println("Enter the values of year");
		Scanner scn = new Scanner(System.in);
		year=scn.nextInt();
		if(year%400==0 || year%4==0)
			System.out.println(year + " is leap year");
		else
			System.out.println(year + " is not a leap year");
	}
}