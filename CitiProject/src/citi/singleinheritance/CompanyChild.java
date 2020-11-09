package citi.singleinheritance;

public class CompanyChild extends EmployeeParent {

	private void cmpAddress() {
		// TODO Auto-generated method stub
		System.out.println("cmp Addree : Chennai");
	}
	private void cmpName() {
		// TODO Auto-generated method stub
		System.out.println("cmp name : citi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyChild cmpDetails =new CompanyChild();
		cmpDetails.cmpAddress();
		cmpDetails.cmpName();
		cmpDetails.empId();
		cmpDetails.empName();
	}

}
