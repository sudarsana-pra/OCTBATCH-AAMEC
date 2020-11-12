package project.polymorphism;
//Method overloading
public class EmployeeDetail {
	public void EmployeeDetails(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("Employee Name :" +name);
	}
		
	public void EmployeeDetails(String Name,int Id) {
		System.out.println("Employee name: " +Name+"\t"+ "Employee Id: " +Id);
		}
	public void EmployeeDetails(String Name,int Id,long phoneNum) {
		System.out.println("Employee Name:"+Name+"\t"+"Employee Id:"+Id +"\t"+"phone number;"+phoneNum);
	}
	
		public static void main(String[] args) {
			EmployeeDetail empObj= new EmployeeDetail();
			empObj.EmployeeDetails("Ramesh G");
			empObj.EmployeeDetails("Ramesh G",5052);
			empObj.EmployeeDetails("Ramesh",5052,9876543210l);
			}
		}
