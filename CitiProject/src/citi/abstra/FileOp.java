package citi.abstra;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileOp {

	public static void main(String[] args) throws IOException {
		//1. make/Create folder
		File f = new File("C:\\Users\\Dell\\Desktop\\FileOperation");
		boolean mkdir = f.mkdir();
		System.out.println("Folder is created :"+ mkdir);
		//2. make/Create multiple folder
		File f1 = new File("C:\\Users\\Dell\\Desktop\\FileOperation\\Java\\Reports");
		boolean mkdirs = f1.mkdirs();
		System.out.println("Multiple Folder is created :"+ mkdirs);
		//3. create a file
		File f2 = new File("C:\\Users\\Dell\\Desktop\\FileOperation\\Java\\Reports\\file1.txt");
		boolean createNewFile = f2.createNewFile();
		System.out.println("File is created :"+ createNewFile);
		
		// one file to another 
		File source = new File("C:\\Users\\Dell\\Desktop\\FileOperation\\Java\\Reports\\file2.txt");
		File Dest = new File("C:\\Users\\Dell\\Desktop\\FileOperation\\Java\\Reports\\file1.txt");
		FileUtils.copyFile(source, Dest);
		// Files list
		File y = new File ("C:\\Users\\Dell\\Desktop\\FileOperation\\Java\\Reports");
		File[] listFiles = y.listFiles();
		for (File X : listFiles) {
			System.out.println(X);
		}
		//4. write inside the file
				File f3 = new File("C:\\Users\\Dell\\Desktop\\FileOperation\\Java\\Reports\\file2.txt");
				FileUtils.write(f3,"welcome to file operation");
				
				
		
	}

}
