package kk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exc {
	public static void main(String[] args) {
		System.out.println("MMS");
		Scanner scn = new Scanner(System.in);
		try{
		System.out.println("try......");
		int x = scn.nextInt();
		System.out.println(x);
		}
		catch (InputMismatchException ime) {
			// TODO: handle exception
			System.out.println("Caught "+ime);
		}
		finally
		{
			System.out.println("finally......");
			scn.close();
		}
	}

}
