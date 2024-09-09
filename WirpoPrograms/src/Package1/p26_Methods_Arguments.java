/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class khan{
	void Meth1() {
		System.out.println("Meth1");
	}
	void Meth2() {
		System.out.println("Meth2");
	}
	// Passing Arguments to Methods
	void Meth3(int X) {
		System.out.println(X*X);
	}
}
public class p26_Methods_Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 khan A = new khan();
		A.Meth1();
		A.Meth2();
		A.Meth3(100);
	}

}
