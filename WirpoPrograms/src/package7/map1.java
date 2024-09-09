/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.util.HashMap;
import java.util.HashSet;

public class map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map1
		HashMap <Integer,String> map1 = new HashMap<>();
		map1.put(1,"Apple");
		map1.put(2,"Banana");
		map1.put(3,"Dog");
		//Map2
		HashMap <Integer,String> map2 = new HashMap<>();
		map2.put(1,"Apple");
		map2.put(2,"Banana");
		map2.put(3,"Dog");
		//Creating 2 sets for Comparing.
		HashSet set1 = new HashSet<>(map1.values());
		HashSet set2 = new HashSet<>(map2.values());
		//returns result
		System.out.println(set1.equals(set2));
	}

}
