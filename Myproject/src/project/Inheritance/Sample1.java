package project.Inheritance;

public class Sample1 extends Sample {
	public void empDetail() {
		System.out.println("EMployeeDetails");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 empObj = new Sample1();
		
		empObj.employee();
		empObj.empDetail();

	}

}
