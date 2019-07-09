package kk;

public class Excc {
	public static void main(String[] args) {
		try{
			System.out.println(12/0);
			String s="kaaa";
			System.out.println(s.charAt(5));
			int arr[] = null;
			System.out.println(arr[0]);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Ec"+ae);
			//ae.printStackTrace();
		}
		catch (NullPointerException ne) {
			// TODO: handle exception
			System.out.println(ne);
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
		}
		catch (StringIndexOutOfBoundsException sib) {
			// TODO: handle exception\
			System.out.println(sib);
		}
		finally{
			System.out.println("Program terminated");
		}
		
	}

}
