
public class CustExe{
	public static void main(String[] args) throws MyException {
		throw new MyException();
	}
}
class MyException extends RuntimeException
{}