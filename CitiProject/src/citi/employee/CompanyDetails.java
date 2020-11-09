package citi.employee;

public class CompanyDetails {

	public void companyName() {
		// TODO Auto-generated method stub
System.out.println("company name : Xoriant");
	}
	public void companyAddress() {
		// TODO Auto-generated method stub
System.out.println("Address: chennai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyDetails companyRecords = new CompanyDetails();
		companyRecords.companyName();
		companyRecords.companyAddress();
		
		EmployeeDetails employeeRec = new EmployeeDetails();
		employeeRec.employeeName();
}
}