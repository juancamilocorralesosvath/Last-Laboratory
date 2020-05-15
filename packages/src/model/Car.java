package model;
/** 
  *This class is the model for the cars of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */

public abstract class Car extends Vehicle {

	private static final String SEDAN = "Sedan";
	private static final String VAN = "Van";
	private String type;
	private int doors;
	private boolean polarizedWindows;
	

	/**Name: Car
	 * Constructor method of the class.
	 * @param basePrice. base price of the vehicle.
	 * @param brand. the brand of the vehicle.
	 * @param model. the model of the vehicle.
	 * @param displacement. the displacement of the vehicle.
	 * @param mileage. the mileage of the vehicle.
	 * @param used. boolean that indicates if the vehicle is used.
	 * @param licensePlate. license plate of the vehicle.
	 * @param type. the type of the car: van or sedan.
	 * @param doors. the number of doors of the car.
	 * @param polarizedWindows. boolean, if the car has polarized Windows or not.
 	 */
	public Car(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String licensePlate, String type, int doors, boolean polarizedWindows) {
		super(basePrice, brand, model, displacement, mileage, used, licensePlate);
		this.type = type;
		this.doors = doors;
		this.polarizedWindows = polarizedWindows;
	}

	/**Name: Car
	 * Second Constructor method of the class.
	 * @param basePrice. base price of the vehicle.
	 * @param brand. the brand of the vehicle.
	 * @param model. the model of the vehicle.
	 * @param displacement. the displacement of the vehicle.
	 * @param mileage. the mileage of the vehicle.
	 * @param used. boolean that indicates if the vehicle is used.
	 * @param type. the type of the car: van or sedan.
	 * @param doors. the number of doors of the car.
	 * @param polarizedWindows. boolean, if the car has polarized Windows or not.
 	 */
	public Car(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String type, int doors, boolean polarizedWindows) {
		super(basePrice, brand, model, displacement, mileage, used);
		this.type = type;
		this.doors = doors;
		this.polarizedWindows = polarizedWindows;
	}
	/**Name: getType
	 * getter method of the attribute type.
	 * @return type. the type of the vehicle.
	 */

	public String getType() {
		return this.type;
	}

	/**Name: setType
	 * setter method of the attribute type.
	 * @param type. the type of the vehicle.
	 */
	public void setType(String type) {
		if(type.equalsIgnoreCase("sedan"))
			this.type = SEDAN;
		else
			this.type = VAN;
	}
	/**Name: getDoors
	 * getter method of the attribute doors.
	 * @return doors. the number of doors of the vehicle.
	 */

	public int getDoors() {
		return this.doors;
	}

	/**Name: setDoors
	 * setter method of the attribute doors.
	 * @param doors. the number of doors of the vehicle.
	 */
	public void setDoors(int doors) {
		this.doors = doors;
	}
	/**Name: getPolarizedWindows
	 * getter method of the attribute polarizedWindows.
	 * @return polarizedWindows. true if the car has polarized windows, false if not.
	 */

	public boolean getPolarizedWindows() {
		return this.polarizedWindows;
	}

	/**Name: setPolarizedWindows
	 * setter method of the attribute polarizedWindows.
	 * @param polarizedWindows. boolean, true if the car has polarized windows, false if not.
	 */
	public void setPolarizedWindows(boolean polarizedWindows) {
		this.polarizedWindows = polarizedWindows;
	}
	/**Name: description
	 * this method shows the info of the car.
	 * @return info. the information of the car.
	 */
	
	@Override
	public String description(){ 
	  
	  String info = super.description() +"\nType: " + getType() + "\nDoors: "+getDoors()+"\nPolarized Windows: "+getPolarizedWindows();
	  return info;
	}
	/**Name: calculateTotalPrice
	 * abstract method for calculating the total price.
	 */
	@Override 
	public abstract int calculateTotalPrice();

}