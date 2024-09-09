/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:35 IST 2024
 */

package package7;

import java.io.Serializable;

public class object implements Serializable {
	private static final long serialVersionUID = 1078920442425848010l;
	String Name;
	String Mail;
	long Num;
	object(String S,String M,long N){
		this.Name=S;
		this.Mail=M;
		this.Num=N;
	}
}
