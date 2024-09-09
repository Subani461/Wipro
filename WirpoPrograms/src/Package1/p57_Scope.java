/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class Parentt{
	 void startApp() {
		System.out.println("Application Loaded...");
	}
}
class Childd extends Parentt{
	// Cannot Access because final methods cannot be overridden.Gives Error.
	void startApp() {
		System.out.println("Database Loaded...");
	}
}
public class p57_Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childd c = new Childd();
		c.startApp();
	}

}
