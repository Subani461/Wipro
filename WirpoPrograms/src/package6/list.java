/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;

import java.util.LinkedList;
import java.util.ListIterator;

public class list {
	static boolean searchList(LinkedList<String> list,String target) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i)==target) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> list = new LinkedList<String>();
		list.add("C");
		list.add("Java");
		list.add("Perl");
		list.add("Python");
		list.add("C++");
		// No of elements in a list
		System.out.println("No of Elements in a given List : "+list.size());
		
		// Search an element in list
		String element="Go";
		if(searchList(list,element)) {
			System.out.println("Element Exist in the List");
		}
		else {
			System.out.println("Element doesn't exist in the given list.");
		}
		
		//Remove the first Item
		list.remove(0);
		for(String S:list) {
			System.out.print(S+" ");
		}
		System.out.println();
		
		//Remove last Element from list
		list.remove(list.size()-1);
		
		// Iterating Elements in a given list
		System.out.println("The Elements are iterated Forward : ");
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		System.out.println("The Elements are iterated Forward : ");
		while(iterator.hasPrevious()) {
			System.out.print(iterator.previous()+" ");
		}
	}

}
