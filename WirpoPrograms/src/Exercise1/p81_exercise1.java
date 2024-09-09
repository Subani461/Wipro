/*
  Name : Asifkhan
  Description : Increasing the Speed of Vehicle Using Inheritance.
  Date : 22/07/2024
 */
package Exercise1;
class Vvehicle{
	int speed;
	Vvehicle(int S){
		//Suppose the Vehicle moving on a certain Speed S.
		this.speed=S;
	}
	public void speedUp() {
		System.out.println("The current speed of the Vehicle is : "+speed);
	}
}
class caar extends Vvehicle{
	caar(int S) {
		super(S);
	}
	public void  speedUp(int S2) {
		// Here in this method speed of vehicle is increased by S2.
		//The the current speed is speed+S1.
		System.out.println("The new speed of car is: "+(S2+speed));
	}	
}
class Bike extends caar{
	Bike(int S) {
		super(S);
	}
	public void speedUp(int S3) {
		System.out.println("The new speed of Bike is: "+(S3+speed));
	}	
}
public class p81_exercise1 {

	public static void main(String[] args) {
		Vvehicle v = new Vvehicle(50);
		v.speedUp();
		caar cc = new caar(50);
		cc.speedUp(30);
		Bike bb = new Bike(50);
		bb.speedUp(40);
	}
}
