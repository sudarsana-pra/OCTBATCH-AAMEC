package project.Constructor;

public class ExampleOne {
	public ExampleOne() {
		    this("JAVA");
		    System.out.println("Default const...");
		  }

		  public ExampleOne(int id) {
		    this(3456.5678f);
		    System.out.println("ID 2:" +id);
		  }

		  public ExampleOne(String name) {
		    this(12);
		    System.out.println("Name 3:"+name);
		  }

		  public ExampleOne(float sal) {
		    System.out.println("Salary 1:"+sal);
		  }

		  public static void main(String[] args) {
			  ExampleOne a = new ExampleOne();
		  }

		}


