package project.abstraction;
//partial abstraction
public class HdfcBank extends RbiBank {
	@Override
	void deposit() {
		// TODO Auto-generated method stub
		System.out.println("percentage : 10%");
		}
@Override
void saving() {
	// TODO Auto-generated method stub
	System.out.println("saving percentage: 2%");
	
}
   public static void main(String[] args) {
	   HdfcBank bankObj= new HdfcBank();
	   bankObj.deposit();
	   bankObj.saving();
	   bankObj.fixed(30);
}
}