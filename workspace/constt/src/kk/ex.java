package kk;
class A{
}
class B extends A{
	
}
public class ex {
	public static void main(String[] args) {
		System.out.println("MMS");
		try{
			ex.m1();
		}
		catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println("Caught"+ e);
		}
		System.out.println("MME");
	}

		static void m1() throws ClassCastException
		{
			A a1=new B();
			B b1=(B)  a1;
			System.out.println(b1);
		}
	
	}
