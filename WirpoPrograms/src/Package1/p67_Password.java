/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
class Password{
	static boolean isValidPassword(String str) {
		if(str.length()<8){
			return false;
		}
	    if(!Character.isLetter(str.charAt(0))) {
			return false;
		}
	    boolean Num=false;
	    boolean spl=false;
	    char ch[] = new char[str.length()];
	    ch=str.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    	if(Character.isDigit(ch[i])==true) {
	    		Num=true;
	    	}
	    	else if(!(Character.isLetter(ch[i]) && Character.isDigit(ch[i]))){
	    		spl=true;
	    	}
	    }
	    return Num && spl;
	}
}
public class p67_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Password = "Assm@786";
		Password P = new Password();
		if(P.isValidPassword(Password)) {
			System.out.println("Given Password is Valid Password");
		}
		else {
			System.out.println("Given Password is not an Valid Password");
		}
	}

}
