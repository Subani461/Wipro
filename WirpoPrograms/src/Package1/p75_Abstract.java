/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:48 IST 2024
 */

package Package1;
abstract class customer{
	abstract void customerDetails();
	abstract void newCustomer();
}
 abstract class buyitems extends customer{
	abstract void printBill();
}
 class myApp extends buyitems{
	 void customerDetails() {
		System.out.println("Customer Details"); 
	 }
	 void newCustomer() {
		 System.out.println("New Customer"); 
	 }
	 void printBill() {
		 System.out.println("Printing Bill.."); 
	 }
 }
public class p75_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myApp mp = new myApp();
		mp.customerDetails();
		mp.newCustomer();
		mp.printBill();
	}
}
