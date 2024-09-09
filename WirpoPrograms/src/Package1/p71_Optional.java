/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
import java.util.Optional;

public class p71_Optional {
	public static String getString() {
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[5];
	//	Optional<String> checkNull = Optional.ofNullable(sttr);
		String strr = null;
		Optional<String> checkNull = Optional.ofNullable(strr);
		//System.out.println(checkNull.isPresent());
		System.out.println(strr.length());
		if(checkNull.isPresent()) {
			System.out.println("String is not an Null");
		}
		else {
				System.out.println("String is  Null");
		}
	}
	

}
