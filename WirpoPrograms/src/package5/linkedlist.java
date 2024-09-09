/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> list = new LinkedList<String>();
		list.add("C");
		list.add("Java");
		list.add("Perl");
		list.add("Python");
	    String element="Java";
	    int index=0;
	    // Searching for an Element and returning the index value.
	  for(int i=0;i<list.size();i++) {
		  if(list.get(i)==element) {
			  index=i;
		  }
	  }
	  System.out.println("The Element "+element+" is present at index : "+index);
	  // Deleting an element at particular index
	  list.remove(3);
	  //Traversing the linked list.
	  for(String s:list) {
		  System.out.print(s+" ");
	  }
	}

}
