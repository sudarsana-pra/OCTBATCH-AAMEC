package project.abstraction;

public class IobBank implements SbiBank {
	@Override
	public void savingAcc() {
		// TODO Auto-generated method stub
		System.out.println("This is your Saving Account");
		
	}
	@Override
	public void currentAcc() {
		// TODO Auto-generated method stub
		System.out.println("This is your Current account");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IobBank iobObj= new IobBank();
		iobObj.savingAcc();
		iobObj.currentAcc();
	}

}
