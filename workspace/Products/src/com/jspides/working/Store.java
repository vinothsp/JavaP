package com.jspides.working;

public class Store {
	Product create (int arg)
	{
		Product P=null;
		if (arg==1)
			P=new Mobile(101,15000.00,"Android","Samsung");
		else if(arg==2)
			P=new Television(111, 23330.0, 32, "sony");
		return P;
		
	}
	void display(Product arg)
	{
		System.out.println(arg.pId);
		System.out.println(arg.price);
		if(arg instanceof Mobile)
		{
			Mobile m1=(Mobile)arg;
			System.out.println(m1.brand);
			System.out.println(m1.os);
		}
		else if(arg instanceof Television)
		{
			Television t1=(Television)arg;
			System.out.println(t1.size);
			System.out.println(t1.brand);
		}
	}

}
