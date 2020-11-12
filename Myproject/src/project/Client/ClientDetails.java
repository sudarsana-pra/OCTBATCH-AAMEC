package project.Client;
//single inheritance in different package.

import project.Employee.EmployeeDetails;

public class ClientDetails extends EmployeeDetails  {
	private void clientName() {
		System.out.println("client name: Alphabet");
	}
    
	private void clientAddress() {
		System.out.println("client address: USA");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientDetails clientRecord= new ClientDetails();
		
		clientRecord.clientName();
		clientRecord.clientAddress();
		clientRecord.employeeName();
		clientRecord.employeeId();
		
}
}
