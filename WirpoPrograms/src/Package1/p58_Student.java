/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class students{
	int rollNum;
	String Name;
	void display(int X,String n) {
		rollNum=X;
		Name=n;
		System.out.println("Name of the student : "+Name);
		System.out.println("RollNumber of the student : "+rollNum);
	}
}
// If class is final it cannot be overridden.
class element extends students{
	int age;
	void display(int Y) {
		age=Y;
		super.display(43,"Asif");
		System.out.println("The age of the student is : "+age);
	}
}
public class p58_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		element et = new element();
		et.display(24);
	}

}
