/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class C5{
	void Meth1() {
		System.out.println("Method1 is running....");
		int sum=addNumbers(10,20);
		System.out.println(sum);
		Meth3();
	}
	int addNumbers(int X,int Y) {
		return X+Y;
	}
	void Meth3() {
		System.out.println("Program Completed successfully....");
	}
}
public class p32_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C5 c = new C5();
		c.Meth1();
	}

}
