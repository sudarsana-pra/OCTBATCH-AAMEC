package citi.multiinheritance;

public class ClientDetails extends EmployeeDetails {
private void clientName() {
	// TODO Auto-generated method stub
	System.out.println("client Name: citi");
}
private void clientAdress() {
	// TODO Auto-generated method stub
	System.out.println("client address: us");
}
public static void main(String[] args) {
	ClientDetails objName = new ClientDetails();
	objName.clientAdress();
	objName.clientName();
	objName.employeeName();
	objName.employeeId();
	
}
}
