package citi.excep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SamplePrg {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		InputStreamReader str = new InputStreamReader(System.in); //itnput from console
		BufferedReader br = new BufferedReader(str); // readed by buffered reader
		String re = br.readLine();
		int p = Integer.parseInt(re);
		int k = p+5;
		System.out.println(k);
		if (k<10) {
			throw new ArithmeticException();
		}
		
	}

}
