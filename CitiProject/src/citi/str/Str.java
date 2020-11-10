package citi.str;

public class Str {

	public static void main(String[] args) {
		// 16 methods
		String s = " Mani vannan ";
		// 1. find out the length of string
		String replace2 = s.replace(' ', '7');
		System.out.println(replace2);
		int length = s.length();
		System.out.println("leth of string :" + length);
		// 2. pick only one char from string
		char charValue = s.charAt(0);
		System.out.println("leth of string :" + charValue);
		char char2 = s.charAt(9);
		System.out.println("leth of string :" + char2);
		// 3. convert string to upper case
		String capitalCase = s.toUpperCase();
		System.out.println("string in upper case:" + capitalCase);
		// 4. convert string to lower case
		String lowerCase = s.toLowerCase();
		System.out.println("string in upper case:" + lowerCase);
		// 5.string starts with specific char or not
		boolean startsWith = s.startsWith("Man");
		System.out.println("string in starts with :" + startsWith);
		// 6.string ends with specific char or not
		boolean endsWith = s.endsWith("nan");
		System.out.println("string in ends With:" + endsWith);
		// 7.adding
		String s1 = "MANIVANNAN";
		String c = s.concat(s1);
		System.out.println("string added:" + c);
		// 8. index of char
		int h = capitalCase.indexOf("A");
		System.out.println("string index:" + h);
		// 9. last index
		int lastIndexOf = capitalCase.lastIndexOf("N");
		System.out.println("string last index:" + lastIndexOf);
		// 10. replace chaR from string
		String replace = capitalCase.replace('N', '1');
		System.out.println("string last index:" + replace);
		// 11.compare 2 strings
		boolean equals = s.equals(s1);
		System.out.println("string last index:" + equals);
		// 12.compare 2 strings ignore case
		boolean equal = s.equalsIgnoreCase(s1);
		System.out.println("string last index:" + equal);
		// 13.string empty
		String s2 = "";
		boolean empty = s2.isEmpty();
		System.out.println("string empty ?:" + empty);
		// 14. trim
		String ss = " Mani Vannan ";
		String trim1 = ss.trim();
		System.out.println("string space trim:" + trim1);
		// 15. sub string
		String s4 = "welcome to java class";
		String substring = s4.substring(11);
		System.out.println("substring:" + substring);
		String substring1 = s4.substring(11, 15);
		System.out.println("substring:" + substring1);
		// 16. split
String s5 = "Mani vannan";
String[] split = s5.split(" ");
for (int i = 0; i < split.length; i++) {
	
}
for (String X : split) {
	System.out.println(X);
}
	

	}

}
