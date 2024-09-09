/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class parent{
	String Name;
	parent(){
		Name="Asif";
	}
	void displayName(){
		System.out.println("My Name is : "+Name);
	}
}
class child extends parent{
	int Age;
	child(){
		Age=24;
	}
	void displayAge() {
		System.out.println("My Age is : "+Age);
	}
}
public class p40_Sinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c= new child();
		c.displayName();
		c.displayAge();
	}

}
