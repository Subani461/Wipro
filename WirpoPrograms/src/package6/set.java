/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(5);
		set.add(4);
		set.add(2);
		set.add(1);
		set.add(3);
		ArrayList<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		HashSet<Integer> sortedSet = new HashSet<Integer>(list);
		for(int X:sortedSet) {
			System.out.print(X+" ");
		}
	}

}
