package citi.client;

import citi.employee.CompanyDetails;

//import citi.employee.CompanyDetails;


public class ClientDetails extends CompanyDetails {
private void clientName() {
	// TODO Auto-generated method stub
System.out.println("Client name : CitiBank");
}
private void clientLocation() {
	// TODO Auto-generated method stub
System.out.println("US");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientDetails clientRec= new ClientDetails();
		clientRec.clientLocation();
		clientRec.clientName();
		clientRec.companyAddress();
		clientRec.companyName();
		
		
	}

}
