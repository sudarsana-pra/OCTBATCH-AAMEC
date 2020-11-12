package citi.runtime;

public class RbiBank extends IciciBank {
@Override
public void deposit(String id) {
	// TODO Auto-generated method stub
	System.out.println("percentage: "+id+"%");
}
private void fixed() {
	// TODO Auto-generated method stub
System.out.println("9%");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RbiBank bjName= new RbiBank();
		bjName.fixed();
		bjName.deposit(12);
		bjName.saving();
	}

}
