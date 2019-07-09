class MyException extends Exception
{}
public class CustExc{
	public static void main(String[] args) {
		try{
		throw new MyException();
	     }
		catch (MyException e) {
			System.out.println("caught Exception");
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}