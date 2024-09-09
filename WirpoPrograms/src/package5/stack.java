/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:14 IST 2024
 */

package package5;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack();
		st.push("Apple");
		st.push("Banana");
		st.push("Cat");
		st.push("Dog");
		System.out.println(st);
		// Pop starts from here..
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
		st.pop();
		System.out.println(st);
	}

}
