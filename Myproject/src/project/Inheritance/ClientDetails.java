package project.Inheritance;
//child class
public class ClientDetails extends CompanyDetails {
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
		clientRecord.companyName();
		clientRecord.companyAdress();
		clientRecord.employeeId();
}
}