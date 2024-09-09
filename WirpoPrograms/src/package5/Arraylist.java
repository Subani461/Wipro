/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Asif");
		list.add("Neha");
		list.add("Imran");
		list.add("Irfan");
		list.add("Aashish");
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		list.remove(1);
		for(String S:list) {
			System.out.print(S+" ");
		}
	}

}
