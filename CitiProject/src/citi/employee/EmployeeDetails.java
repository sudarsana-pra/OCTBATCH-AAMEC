package citi.employee;

public class EmployeeDetails extends CompanyDetails {
public void employeeName() {
	// TODO Auto-generated method stub
System.out.println("Name: Manivannan.T");
}
private void employeeId() {
	// TODO Auto-generated method stub
System.out.println("ID: MT78508");
}

public static void main(String[] args) {
	//ClassName objectName= new ClassName();
	EmployeeDetails employeeRecords= new EmployeeDetails();
	
	employeeRecords.employeeId();
	employeeRecords.employeeName();
	employeeRecords.companyName();
	employeeRecords.companyAddress();
	
}
}
