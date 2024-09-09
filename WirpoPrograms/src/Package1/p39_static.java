/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class C11{
	int a=1;
	static int b=1;
	void incrementA() {
		System.out.println("a = "+a);
		a++;
	}
	void incrementB() {
		System.out.println("b = "+b);
		b++;
	}
}
public class p39_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
// For every iteration new object is created then value for instance remains
// same but for static it changes.
		for(int i=0;i<5;i++) {
			C11 c= new C11();
			c.incrementA();
			c.incrementB();
		}
	}

}
