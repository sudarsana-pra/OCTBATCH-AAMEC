package citi.str;

public class LitNonLit {
public static void main(String[] args) {
	String s1 = "Mani";
	String s2 = "Mani";
	System.out.println("Literal String");
	System.out.println("Address S1: "+System.identityHashCode(s1));
	System.out.println("Address S2: "+System.identityHashCode(s2));
	
	String s3=s1.concat(s2);
	
	System.out.println("Address S3: "+System.identityHashCode(s3));
	System.out.println("After Concat :"+s3);
	
	System.out.println("Non-Literal String");
	
	String s7 = new String("Mani");
	String s8 = new String("Mani");
	System.out.println("Address S7: "+System.identityHashCode(s7));
	System.out.println("Address S8: "+System.identityHashCode(s8));
	
	StringBuffer s4 = new StringBuffer("Mani");
	StringBuffer s5 = new StringBuffer("Mani");
	
	StringBuffer s6 = s4.append(s5);
	
	System.out.println("After append :"+s6);
	System.out.println("Address S4: "+System.identityHashCode(s4));
	System.out.println("Address S5: "+System.identityHashCode(s5));
	System.out.println("Address S6: "+System.identityHashCode(s6));//identityHashCode--memory address
}
}
