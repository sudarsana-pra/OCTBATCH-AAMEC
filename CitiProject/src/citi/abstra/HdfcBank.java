package citi.abstra;

public class HdfcBank extends RbiBank{

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("10%");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("2%");
	}
	public static void main(String[] args) {
		HdfcBank obj =new HdfcBank();
		obj.deposit();
		obj.saving();
		obj.fixed(8);
		obj.mixed();
	}

}
