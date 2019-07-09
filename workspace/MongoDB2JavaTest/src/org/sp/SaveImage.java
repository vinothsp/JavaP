package org.sp;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSInputFile;

public class SaveImage {
	
	static Logger log = Logger.getLogger(SaveImage.class.getName());

	public static void main(String[] args) throws IOException {
		// Create db.users.save({username:"vinoth"})
		
		log.info("Start");
		MongoClient mongo;
		try {
			mongo = new MongoClient("localhost", 27017);
			DB db = mongo.getDB("vinoth");
			log.info("DB Success");

			//SaveImage.saveMongoImage(db);
			SaveImage.listAllImages(db);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
	}
	
	//F:\Moto\pic\PhotoLab\4036f919-4ff1-4d8f-932e-056356dd563c~01.jpg
	
	private static void  saveMongoImage(DB db) throws IOException
	{
		String dbFileName = "Vinoth";
		File imgFile = new File("F:\\Moto\\pic\\PhotoLab\\4036f919-4ff1-4d8f-932e-056356dd563c~01.jpg");
		
		
		GridFS gridfs = new GridFS(db,"photo");
		GridFSInputFile gfsInput = gridfs.createFile(imgFile);
		gfsInput.setFilename(dbFileName);
		gfsInput.save();
		
		log.info("Files save successfully");
		
	}
	
	 private static void listAllImages(DB db) {
	        GridFS gfsPhoto = new GridFS(db, "photo");
	        DBCursor cursor = gfsPhoto.getFileList();
	        while (cursor.hasNext()) {
	        	System.out.println(""+cursor.next());
	            log.info(""+cursor.next());
	        }
	    }

}
