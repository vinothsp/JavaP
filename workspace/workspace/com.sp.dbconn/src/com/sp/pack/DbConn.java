package com.sp.pack;
public class DbConn {
public static void main(String[] args) {
	try{
		Class.forName("com.mysql.jdbc.Driver");
	}
	catch(SQLException s){}
	}
}
