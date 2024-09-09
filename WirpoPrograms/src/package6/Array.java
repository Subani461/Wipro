/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int Array[] = new int[length];
		for(int i=0;i<length;i++) {
			Array[i]=sc.nextInt();
		}
		//Displaying all the elements of an Array.
		for(int X:Array) {
			System.out.print(X+" ");
		}
	}

}
