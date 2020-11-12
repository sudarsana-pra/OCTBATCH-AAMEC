package project.ctrlstatment;
//Count of even number 1 to 100

public class CountEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 2; i<=100; i+=2) {
			count++;
		}
		System.out.println("number of even numbers between 1 to 100 is: " +count);
	}

}
