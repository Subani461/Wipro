/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> mapp = new HashMap<>();
		mapp.put(1,"Apple");
		mapp.put(2,"Banana");
		mapp.put(3,"Dog");
		mapp.put(4,"Cat");
		mapp.put(5,"Elephant");
		mapp.put(6,"Fan");
		//Displaying all the Elements.
		for(Entry<Integer, String> entry:mapp.entrySet()) {
			System.out.println("Key : "+entry.getKey()+" value : "+entry.getValue());
		}
		// Printing the 4th element
		System.out.println("The Element is : "+mapp.get(4));
		// Removing the Fan
		mapp.remove(6);
		System.out.println("The map after removing one element"+mapp);
		System.out.println("Size of map is : "+mapp.size());
;	}

}
