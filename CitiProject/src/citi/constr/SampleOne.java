package citi.constr;

public class SampleOne extends Sample {

	public SampleOne() {
		this(10);
		System.out.println("Default Contsructor 6:");
	}
	public SampleOne(int id) {
		super(9894738299l,10000.23f);
		System.out.println("Parameterised Contsructor 4:");
		System.out.println("Parameterised Contsructor 5:"+id);
	}
	public static void main(String[] args) {
		SampleOne s= new SampleOne();
	}

}
