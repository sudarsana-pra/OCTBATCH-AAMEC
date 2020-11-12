package project.stringopr;

//question1

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "AamecTechnolgy";
		String s2= "SeliniumAutomationtool";
		String s3= "ramesh";
		String s4= "j a v a p r o g r a m";
		String s5= "9876543210";
		System.out.println("Length of Name:"+s1.length()+"\nLength of Tool:"+s2.length());
		System.out.println("Length of employee name:"+s3.length()+"\nLength of the program:"+s4.length());
		System.out.println("Length of phone number:"+s5.length());
		
		//question2
		int a1 = s1.lastIndexOf("o");
		System.out.println("\nLast index of O in AamecTechnolgy is:"+a1);
		System.out.println("index of O in SeliniumAutomationtool is:"+s2.indexOf("o"));
		System.out.println("Index of H in ramesh:"+s3.indexOf("h"));
		System.out.println("LastIndex of (empty space) in j a v a p r o g r a m:"+s4.lastIndexOf(" "));
		System.out.println("Index of 8 in 9876543210:"+s5.indexOf("8"));
		
		//question3
		char a2 = s1.charAt(s1.indexOf("h"));
		System.out.println("\nget the character h from AamecTechnolgy:"+a2);
		System.out.println("get the character o from SeliniumAutomationtool:"+s2.charAt(s2.indexOf("o")));
		System.out.println("Index of U in ramesh is"+s3.charAt(s3.indexOf("r")));
		System.out.println("get the character p from j a v a p r o g r a m:"+s4.charAt(s4.indexOf("p")));
		System.out.println("get the character 7 from 9876543210:"+s5.charAt(s5.indexOf("7")));
		
		}
}


