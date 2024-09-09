/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

public class wrapperString {
	static void add(String str1,String str2) {
		//Concatenation
		String str3;
		str3=str1+str2;
		System.out.println(str3);
		// Number Addition
		int X=Integer.parseInt(str1);
		int Y=Integer.parseInt(str2);
		System.out.println(X+Y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1;
		String S2;
		S1="10";
		S2="20";
		add(S1,S2);
	}

}
