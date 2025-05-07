/**
*
*
*
*/
public class Car extends Vehicle{
	private int doors;
	private int passengers;

	public Car(String make, String model, String plate, int doors, int passengers) {
		super(make, model, plate);
		this.doors = doors;
		this.passengers = passengers;
		
	}
	public int getDoors(){
		return doors;
	}
	public int getPassengers(){
		return passengers;
	}
	@Override
	public String toString(){
		return doors + "-door" + getMake() + getModel() + "with license" + getPlate();
	}
	@Override 
	public boolean equals(Object other){
	if (!(other instanceof Car)){
	   return false;}
	   Car otherCar = (Car) other;
	   
	   return super.equals(otherCar) &&
	   this.doors == otherCar.doors &&
	   this.passengers == otherCar.passengers;
	} 
	public Car copy(){
		return new Car (getMake(), getModel(), getPlate(), getDoors(), getPassengers());
	}
	

}