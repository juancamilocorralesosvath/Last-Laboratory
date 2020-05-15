package model;
/** 
  *This class administrates the information of the Gasoline cars of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */

public class Gasoline extends Car implements GasolineServices {

	private static final String EXTRA = "Extra";
	private static final String COMMON = "Common";
	private static final String DIESEL = "Diesel";
	
	private int tankCapacity;
	private String gasolineType;
	private int gasolineConsumption;

	/**Name: Gasoline
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
	 * @param tankCapacity. the gasoline capacity of the car.
	 * @param gasolineType. the type of gasoline of the car.
	 */
	public Gasoline(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String licensePlate, String type, int doors, boolean polarizedWindows, int tankCapacity, String gasolineType) {
		super(basePrice, brand, model, displacement, mileage, used, licensePlate, type, doors, polarizedWindows);
		this.tankCapacity = tankCapacity;
		this.gasolineType = gasolineType;
	}

	/**Name: Gasoline
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
	 * @param tankCapacity. the gasoline capacity of the car.
	 * @param gasolineType. the type of gasoline of the car.
	 */
	public Gasoline(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String type, int doors, boolean polarizedWindows, int tankCapacity, String gasolineType) {
		super(basePrice, brand, model, displacement, mileage, used, type, doors, polarizedWindows);
		this.tankCapacity = tankCapacity;
		this.gasolineType = gasolineType;
	}
    /**Name: getTankCapacity
	 * getter method of the attribute tankCapacity.
	 * @return tankCapacity. the gasoline capacity of the car.
	 */

	public int getTankCapacity() {
		return this.tankCapacity;
	}

	 /**Name: setTankCapacity
	 * setter method of the attribute tankCapacity.
	 * @param tankCapacity. the gasoline capacity of the car.
	 */

	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	 /**Name: getGasolineType
	 * getter method of the attribute gasolineType.
	 * @return gasolineType.the type of gasoline of the car.
	 */
	public String getGasolineType() {
		return this.gasolineType;
	}

	 /**Name: setGasolineType
	 * setter method of the attribute gasolineType.
	 * @param gasolineType.the type of gasoline of the car.
	 */

	public void setGasolineType(String gasolineType) {
		if(gasolineType.equalsIgnoreCase("extra"))
			this.gasolineType = EXTRA;
		else if(gasolineType.equalsIgnoreCase("common"))
			this.gasolineType = COMMON;
		else
			this.gasolineType = DIESEL;
	}
	 /**Name: getGasolineConsumption
	 * getter method of the attribute gasolineConsumption.
	 * @return gasolineConsumption.the consumption of gasoline of the car.
	 */
	public int getGasolineConsumption() {
		return this.gasolineConsumption;
	}

	/**Name: calculateGasolineConsumption
	 * this method calculates the gasoline consumption of the car, 
	 *implementing the interface GasolineServices.
	 * @return result.the consumption of gasoline of the car.
	 */
	@Override
	public int calculateGasolineConsumption(){ 
	  
	  int result = tankCapacity * (getDisplacement() / 100);
	  return result;
	}
	/**Name: calculateTotalPrice
	 * this method calculates the total price of the car, according to the 
	 *specifications given.
	 * @return result. the total price of the vehicle.
	 */
    @Override
	public int calculateTotalPrice() {
		orderArrayOfDocuments();
		int result = 0;
	  if(getUsed()){
	      result = getBasePrice() - (getBasePrice() * 10/100);
	  }else{ 
		  result = getBasePrice();
	  }
	  
	  if(hasCurrentYearDocuments() == false)
			result += 500000;
	 
	  return result;
	  
	}
	/**Name: description
	 * this method shows the information of the car.
	 * @return info. the information of the car.
	 */
	@Override
	public String description(){ 
	  
	  String info = super.description()+"\nTank Capacity: "+getTankCapacity()+"\nGasoline Type: "+getGasolineType()+"\nGasoline Consumption: "+getGasolineConsumption();
	  return info;
	}

}