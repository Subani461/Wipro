/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;

import java.util.Optional;

public class p72 {
	public  static void main(String args[]) {
		String str=null;
		Optional<String> checkNull = Optional.ofNullable(str);
		System.out.println(checkNull.orElse("Default"));
		//System.out.println(str.length());
		if(checkNull.isPresent()) {
		}
	}
}
