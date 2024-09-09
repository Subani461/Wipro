/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class C4{
	void Meth1() {
		System.out.println("method 1 is running...");
		Meth2("Asif");
	}
	 void Meth2(String Name) {
		System.out.println("method 2 is running...");
		System.out.println("My Name is : "+Name);
	}
}
public class p31_passArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C4 c =  new C4();
		c.Meth1();
		c.Meth2("Khan");
	}

}
