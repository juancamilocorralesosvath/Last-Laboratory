package model;
/** 
  *This class administrates the information of the Hybrid cars of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */

public class Hybrid extends Car implements ElectricityServices, GasolineServices {

	private String EXTRA = "Extra";
	private String COMMON = "Common";
	private String DIESEL = "Diesel";
	private String FAST = "Fast";
	private String NORMAL = "Normal";
	private int tankCapacity;
	private String gasolineType;
	private int gasolineConsumption;
	private String chargerType;
	private int batteryLife;
	private int batteryConsumption;

	/**Name: Hybrid
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
	 * @param chargerType. the type of charger of the car.
	 * @param batteryLife. the life of the battery of the car.
	 */
	public Hybrid(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String licensePlate, String type, int doors, boolean polarizedWindows, int tankCapacity, String gasolineType, String chargerType, int batteryLife) {
		super(basePrice, brand, model, displacement, mileage, used, licensePlate, type, doors, polarizedWindows);
		this.tankCapacity = tankCapacity;
		this.gasolineType = gasolineType;
		this.chargerType = chargerType;
		this.batteryLife = batteryLife;
	}

	/**Name: Hybrid
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
	 * @param chargerType. the type of charger of the car.
	 * @param batteryLife. the life of the battery of the car.
	 */
	public Hybrid(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String type, int doors, boolean polarizedWindows, int tankCapacity, String gasolineType, String chargerType, int batteryLife) {
		super(basePrice, brand, model, displacement, mileage, used, type, doors, polarizedWindows);
		this.tankCapacity = tankCapacity;
		this.gasolineType = gasolineType;
		this.chargerType = chargerType;
		this.batteryLife = batteryLife;
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
	  
	  int result = tankCapacity * (getDisplacement() / 110);
	  return result;
	}
	/**Name: getChargerType
	 * getter method of the attribute chargerType.
	 * @return chargerType. the Type of charger of the vehicle.
	 */

	public String getChargerType() {
		return this.chargerType;
	}

	/**Name: setChargerType
	 * setter method of the attribute chargerType.
	 * @param chargerType. the Type of charger of the vehicle.
	 */
	public void setChargerType(String chargerType) {
		if(chargerType.equalsIgnoreCase("fast"))
			this.chargerType = FAST;
		else
			this.chargerType = NORMAL;
	}
    /**Name: getBatteryLife
	 * getter method of the attribute batteryLife.
	 * @return batteryLife. the lyfe of battery of the vehicle.
	 */
	public int getBatteryLife() {
		return this.batteryLife;
	}

	/**Name: setBatteryLife
	 * setter method of the attribute batteryLife.
	 * @param batteryLife. the lyfe of battery of the vehicle.
	 */
	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}
    /**Name: getBatteryConsumption
	 * getter method of the attribute batteryConsumption.
	 * @return batteryConsumption. the Consumption of the battery of the vehicle.
	 */
	public int getBatteryConsumption() {
		return this.batteryConsumption;
	}
     /**Name: calculateBatteryConsumption
	 * this method is the implementation of the interface ElectricityServices, that calculates the 
	 *consumption of the battery of the car.
	 * @return result. the Consumption of the battery of the vehicle.
	 */
	@Override
	public int calculateBatteryConsumption(){ 
	  
	  int result = 0;
	  if(getChargerType() == FAST) 
	    
	   result = getBatteryLife() * (getDisplacement() / 100);
	  else
		  result = (getBatteryLife() + 5) * (getDisplacement() / 100);
	  
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
		int result = getBasePrice() + (getBasePrice() * 15/100);
		if(getUsed())
			result = result - (result * 10/100);
		
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
	  
	  String info = super.description()+"\nTank Capacity: "+getTankCapacity()+"\nGasoline Type: "+getGasolineType()+"\nGasoline Consumption: "+getGasolineConsumption()+"\nCharger Type: "+getChargerType()+"\nBattery Life: "+getBatteryLife()+"\nBattery Consumption: "+getBatteryConsumption();
	  return info;
	}

}