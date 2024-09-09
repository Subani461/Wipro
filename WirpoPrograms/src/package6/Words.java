/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:08:25 IST 2024
 */

package package6;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String Word = sc.nextLine();
		Word =" "+Word;
		int count=0;
		for(int i=0;i<Word.length();i++) {
			if(Word.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
