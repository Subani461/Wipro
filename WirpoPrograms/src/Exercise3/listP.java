/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:05:52 IST 2024
 */

package Exercise3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class listP {
	static void displayMenu() {
		System.out.println("1. Add Elements in list ");
		System.out.println("2. Display the elements in the lis");
		System.out.println("3. Remove Element from the list");
		System.out.println("4. Search for an Element in list");
		System.out.println("5. Check List is Empty or not ");
		System.out.println("6. Exit");
	}
	static void addElements(ArrayList<String> list2) {
		
		list2.add("C");
		list2.add("Java");
		list2.add("Perl");
		list2.add("Python");
		list2.add("C++");
	}
	static void displayElements(ArrayList<String> L) {
		for(String S:L) {
			System.out.print(S+" ");
		}
	}
	static void remElement(ArrayList<String> L) {
		L.remove(0);
		System.out.println("List after removing element is : ");
		for(String S:L) {
			System.out.print(S+" ");
		}	
	}
	static boolean search(ArrayList<String> L,String target) {
		for(int i=0;i<L.size();i++) {
			if(L.get(i)==target) {
				return true;
			}
		}
		return false;
	}
	static void seaElement(ArrayList<String> L) {
		String target="Java";
		if(search(L,target) == true) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Not Found");
		}
	}
	static void listEmpty(ArrayList<String> L) {
		if(L.isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
			System.out.println("List is not Empty");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <String> list = new ArrayList<String>();
		displayMenu();
		int	choice;
		do{
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				addElements(list);
				System.out.println("Elements are added Succesfully..");
				break;
			case 2:
				displayElements(list);
				break;
			case 3:
				remElement(list);
				break;
			case 4:
				seaElement(list);
				break;
			case 5:
				listEmpty(list);
				break;
			case 6:
				System.out.println("Exit");
				return ;
			default:
				System.out.println("Invalid Choice");
				}
		}while(choice!=0);
	}

}
