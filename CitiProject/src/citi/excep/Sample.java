package citi.excep;

public class Sample {

	public static void main(String[] args) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
String empId = "123123";

if (empId.startsWith("13")) {
	System.out.println("He is wrking in company");
	}
else {
	throw new EmployeeNotFoundException();
}
	

	}

}
