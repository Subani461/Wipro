/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class c9{
	int rollNumber;
	String Name;
	int Age;
	//Default Constructor
	c9(){
		rollNumber=43;
		Name="Asif";
		Age=24;
	}
	void print() {
		System.out.println("My Roll Number is : "+rollNumber);
		System.out.println("My Name is : "+Name);
		System.out.println("My Age is : "+Age);

	}
}
public class p36_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c9 c = new c9();
		c.print();
	}

}
