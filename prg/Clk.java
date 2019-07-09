import java.util.Scanner;
class Clk
{
	public static void main(String args[])
	{
		int min=50;
		double minAng=min*6;
		int hour=4;
		double hrang=hour*30+min*0.5;
		double ang=hrang>minAng?hrang-minAng:minAng-hrang;
		ang=ang>180?360-ang:ang;
		System.out.println(ang);
		
	}
}