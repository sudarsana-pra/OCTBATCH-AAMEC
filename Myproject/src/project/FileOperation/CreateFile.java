package project.FileOperation;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("E:\\java class\\FileOperation");
		boolean mkdir = f1.mkdir();
		System.out.println("Creating file: "+mkdir);
		
		//File f3 = new File("E:\\java class\\FileOperation\\javaFile");
		//boolean mkdirs = f3.mkdirs();
		//System.out.println("Creating multiple files: "+mkdirs);
		
		File f2 = new File("E:\\java class\\FileOperation\\Question1.txt");
		boolean createNewFile = f2.createNewFile();
		FileUtils.write(f2, "First line of the file");
		System.out.println("Create new files: "+createNewFile);
		File f3 = new File("E:\\java class\\FileOperation\\Question1.txt");
		FileUtils.write(f3, "trying to write");
		File f4 = new File("E:\\java class\\FileOperation\\Question1.txt");
		FileUtils.write(f4, "within a file");
		File f5 = new File("E:\\java class\\FileOperation\\Question1.txt");
		FileUtils.write(f5, "using java");
		File f6 = new File("E:\\java class\\FileOperation\\Question1.txt");
		FileUtils.write(f6, "Finally, I wrote a line in a file");
		File f7 = new File("E:\\java class\\FileOperation\\Question1.txt");
		FileUtils.write(f7, "JAVA IS FUN!!!");
		File f8 = new File("E:\\java class\\FileOperation\\Question1.txt");
		FileUtils.write(f8, "Using Eclipse");
		
		 
	}
}
