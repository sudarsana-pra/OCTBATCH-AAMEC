package citi.constr;

public class Sample {

	
	public Sample(int id) {
		// parameterized
		this("Manivannan");
		System.out.println("Parameterized Constructor 6");
		System.out.println("Parameterized Constructor 7: " +id);
	}
	public Sample() {
		// Non-parameterized
		this(101);
		System.out.println("Default Constructor 8");
	}
	public Sample(String name) {
		// parameterized
		this(9894738299l,10000.23f);
		System.out.println("Name Parameterized Constructor 4");
		System.out.println("Name Parameterized Constructor 5"+name);
	}
	public Sample(long phNo,Float salary) {
		// parameterized
		
		System.out.println("Long and Float Parameterized Constructor 1");
		System.out.println("Long and Float Parameterized Constructor 2: "+salary);
		System.out.println("Long and Float Parameterized Constructor 3: "+phNo);
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		
	}

}
