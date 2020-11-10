package project.FileOperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class RetriveFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("E:\\java class\\FileOperation");
		boolean mkdir = f1.mkdir();
		System.out.println("Create file: "+mkdir);
		
		File f2 = new File("E:\\java class\\FileOperation\\question2.txt");
		boolean createNewFile = f2.createNewFile();
		System.out.println("new file created: "+createNewFile);
		FileUtils.write(f2, "we are writing java program");
		
		

	}

}
