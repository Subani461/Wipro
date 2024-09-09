/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:36 IST 2024
 */

package package7;

public class wrapper_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1000;
		// Boxing coverting data type into Object
		Integer X = Integer.valueOf(x);
		Integer Y = new Integer(1000);
		System.out.println(X);
		System.out.println(Y);
		
		// Auto Boxing data type to Object
		Integer J=x;
		System.out.println(J);
		
		//Unboxing converting object to data type
		int M = x;
		System.out.println(M);//Auto Unboxing.
		int N=Y.intValue();
		System.out.println();// Unboxing.
	}

}
