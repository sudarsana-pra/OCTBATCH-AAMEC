package project.stringopr;

public class StringFind2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phNo = "987654321q";
		int length = phNo.length();
		System.out.println(length);
		for (int i = 0; i <=length-1; i++) {
			char cha = phNo.charAt(i);
			if(cha==(0|1|2|3|4|5|6|7|8|9)) {
				System.out.println("digit");
			}
			else
				System.out.println("char");
		} 
	}

}
