/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

public class p72_garbaze {
	public void finalize() throws Throwable{
		System.out.println("Finialize Method Called..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p72_garbaze obj1 = new p72_garbaze();
		p72_garbaze obj2 = new p72_garbaze();
		obj1=null;
		Runtime.getRuntime().gc();
		System.out.println("End of Method");
	}

} 
