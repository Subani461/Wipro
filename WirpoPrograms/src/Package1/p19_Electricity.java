/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;

import java.util.Scanner;

public class p19_Electricity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double MR = sc.nextInt();
		double OR = sc.nextInt();
		double tUnits = MR-OR;
		double charge;
		if(tUnits>1 && tUnits<=100) {
			charge=0;
		}
		else if(tUnits>101 && tUnits<=200) {
			charge=(100*0)+(tUnits-100)*1;
		}
		else if(tUnits>201 && tUnits<=300) {
			charge=(100*0)+(100*1)+(tUnits-200)*2;
		}
		else if(tUnits>301 && tUnits<=400) {
			charge=(100*0)+(100*1)+(100*2)+(tUnits-300)*3;
		}
		else {
			charge=(100*0)+(100*1)+(100*2)+(100*3)+(tUnits-400)*4;
			double tax = (0.10)*(charge);
			charge = charge+tax;
		}
		System.out.println("Total Charge for units is : "+charge);
	}

}
