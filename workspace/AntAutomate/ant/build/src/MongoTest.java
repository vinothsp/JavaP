package org.sp;

import java.net.UnknownHostException;
import java.util.List;

import com.mongodb.MongoClient;

public class MongoTest {

	public static void main(String[] args) {
	
		System.out.println("Mongo Test Starts");
		
		MongoClient mongo;
		try {
			 mongo = new MongoClient("localhost", 27017);
			 /*MongoDB is an open-source document database that provides high performance, high availability, 
			 and automatic scaling across a configurable set of systems that function as storage nodes.*/
		
			/* cmd:
			   ---
			  
			 mongod.exe –config F:\MongoDB\mongo.config
			 
			 f:\Mongodb\bin>mongo
			 
			 Shutdown
			 --------
			 db.shutdownServer()
			 
			 quit()
			 */
			 
		List<String> dbs = mongo.getDatabaseNames();
		
		System.out.println("DataBase Names");
		for (String db : dbs)
		{
			System.out.println(db);
		}
		System.out.println("Mongo Test Ends");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
