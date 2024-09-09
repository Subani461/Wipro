/**
 * Author: Asifkhan
 * Date: Wed Aug 07 13:06:47 IST 2024
 */

package Package1;
class Vehicle{
	private String Brand;
	private int Year;
	Vehicle(String B,int Y){
		this.Brand=B;
		this.Year=Y;
	}
	// Method to print Features of Vehicle
	public void Display() {
		System.out.println("The Brand of Vehicle is : "+Brand);
		System.out.println("The Year of Vehicle is released : "+Year);
	}
	// Encapsulation
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String B1) {
		this.Brand=B1;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int Y1) {
		this.Year=Y1;
	}
}
// Inheritance
class Car extends Vehicle{
	Car(String B2,int Y2,int D1){
		super(B2,Y2);
		this.doors=D1;
	}
	private int doors;
	
	//Method Overriding.
	public void Display() {
		super.Display();
		System.out.println("No of Doors for car is : "+doors);
	}
	public int getdoors() {
		return doors;
	}
	public void setdoors(int D2) {
		this.doors=D2;
	}
}
public class OOPsImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an instance of Vehicle.
		// Vehicle might be car or bike or bus.In General i.e Vehicle.
		Vehicle V = new Vehicle("Honda",2020);
		V.Display();
		// Specifying the Vehicle i.e CAR.
		Car c = new Car("HONDASUV",2022,4);  // Compile time Polymorphism
		c.Display();
		// Another Instance for Car
		Vehicle c2 = new Car("HONDASW",2018,4); // Runtime Polymorphism
		c2.Display();
		
	}

}
