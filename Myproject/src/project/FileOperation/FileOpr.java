package project.FileOperation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOpr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("E:\\java class\\FileOperations");
		boolean makeDirectory = f1.mkdir();
		System.out.println("Create single folder :"+makeDirectory);
		File f2 = new File("E:\\java class\\FileOperations\\Examples\\Fuctions");
		boolean makeDirectories = f2.mkdirs();
		System.out.println("Create multiple files :"+makeDirectories);
        File f3 = new File("E:\\java class\\FileOperations\\Examples\\Sample1.txt");
        boolean createNewFile = f3.createNewFile();
        System.out.println("create new file :"+createNewFile);
        FileUtils.write(f3, "JAVA IS FUN");
		File f4 = new File("E:\\java class\\FileOperations\\Examples");
		File[] listFiles = f4.listFiles();
		for (File file : listFiles) {
			System.out.println("Listing file:"+file);
			
		}

	}

}
