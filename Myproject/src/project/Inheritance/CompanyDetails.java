package project.Inheritance;
//Parent class
public class CompanyDetails extends EmployeeDetails {
	public void companyName() {
		System.out.println("company name: google");
	}
    public void companyAdress() {
    	System.out.println("company address: New Delhi");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyDetails companyRecords= new CompanyDetails();
		
		companyRecords.employeeName();
		companyRecords.employeeId();
		companyRecords.companyName();
		companyRecords.companyAdress();
}
}
