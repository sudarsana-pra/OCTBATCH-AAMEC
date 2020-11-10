package citi.inter;

public class HdfcBank implements RbiBank,Sbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HdfcBank obj = new HdfcBank();
		obj.deposit();
		obj.fixed();
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("8%");
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("6%");
	}

	@Override
	public void saving() {
		// TODO Auto-generated method stub
		
	}

}
