package citi.excep;

public class ExceHan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(0);
System.out.println(1);
System.out.println(2);
System.out.println(3);
try {
	System.out.println(4/0);
}
catch (ArithmeticException e) {
	System.out.println("Do not divide number by zero");
}
finally {
	System.out.println("Prg Status : Success");
}
System.out.println(5);
System.out.println(6);
	}

}
