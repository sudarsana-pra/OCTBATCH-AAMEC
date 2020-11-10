package citi.compilepoly;

public class EmployeeDetails {
	public void EmployeeDetails(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("String Method: "+name);
	}
	public void EmployeeDetails(String Id,String Name,Long phoneNumber ) {
		// TODO Auto-generated constructor stub
		System.out.println("3 arrguments: "+"\n"+Name +"\n"+Id+"\n"+phoneNumber);
	}
	public void EmployeeDetails(int Id) {
	System.out.println("Integer Method :"+Id);
	}
	public static void main(String[] args) {
		EmployeeDetails empDet = new EmployeeDetails();
		empDet.EmployeeDetails("Manivannan");
		empDet.EmployeeDetails("MT78508","Manivannan",9894738299l);
		empDet.EmployeeDetails(1234);
		
		
	}
	
}
