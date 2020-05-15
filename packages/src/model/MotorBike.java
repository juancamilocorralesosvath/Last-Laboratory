package model;
/** 
  *This class administrates the information of the MotorBikes of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */

public class MotorBike extends Vehicle implements GasolineServices {

	private static final String STANDARD = "Standard";
	private static final String SPORTIVE = "Sportive";
	private static final String SCOOTER = "Scooter";
	private static final String CROSS = "Cross";
	
	private String type;
	private int gasolineCapacity;
	private int gasolineConsumption;

	/**Name: MotorBike
	 * Constructor method of the class.
	 * @param basePrice. base price of the vehicle.
	 * @param brand. the brand of the vehicle.
	 * @param model. the model of the vehicle.
	 * @param displacement. the displacement of the vehicle.
	 * @param mileage. the mileage of the vehicle.
	 * @param used. boolean that indicates if the vehicle is used.
	 * @param licensePlate. license plate of the vehicle.
	 * @param type. the type of the motorbike.
	 * @param gasolineCapacity. the capacity of gasoline of the motorbike.
	 */
	public MotorBike(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String licensePlate, String type, int gasolineCapacity) {
		super(basePrice, brand, model, displacement, mileage, used, licensePlate);
		this.type = type;
		this.gasolineCapacity = gasolineCapacity;
	}

	/**Name: MotorBike
	 * Second Constructor method of the class.
	 * @param basePrice. base price of the vehicle.
	 * @param brand. the brand of the vehicle.
	 * @param model. the model of the vehicle.
	 * @param displacement. the displacement of the vehicle.
	 * @param mileage. the mileage of the vehicle.
	 * @param used. boolean that indicates if the vehicle is used.
	 * @param type. the type of the motorbike.
	 * @param gasolineCapacity. the capacity of gasoline of the motorbike.
	 */
	public MotorBike(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String type, int gasolineCapacity) {
		super(basePrice, brand, model, displacement, mileage, used);
		this.type = type;
		this.gasolineCapacity = gasolineCapacity;
	}
	/**Name: getType
	 * getter method of the attribute type.
	 * @return type. the type of the motorbike.
	 */
	public String getType() {
		return this.type;
	}
	/**Name: setType
	 * getter method of the attribute type.
	 * @return type. the type of the motorbike.
	 */
	public void setType(String type) {
	  if(type.equalsIgnoreCase("standard"))
		  this.type = STANDARD;
	  else if(type.equalsIgnoreCase("sportive"))
		  this.type = SPORTIVE;
	  else if(type.equalsIgnoreCase("scooter"))
		  this.type = SCOOTER;
	  else
		  this.type = CROSS;
	}
	/**Name: getGasolineCapacity
	 * getter method of the attribute gasolineCapacity.
	 * @return gasolineCapacity. the capacity of gasoline of the motorbike.
	 */

	public int getGasolineCapacity() {
		return this.gasolineCapacity;
	}

	/**Name: setGasolineCapacity
	 * setter method of the attribute gasolineCapacity.
	 * @param gasolineCapacity. the capacity of gasoline of the motorbike.
	 */

	public void setGasolineCapacity(int gasolineCapacity) {
		this.gasolineCapacity = gasolineCapacity;
	}
	/**Name: getGasolineConsumption
	 * getter method of the attribute gasolineConsumption.
	 * @return gasolineConsumption.the consumption of gasoline of the motorbike.
	 */

	public int getGasolineConsumption() {
		return this.gasolineConsumption;
	}
	/**Name: description
	 * this method shows the information of the motorbike.
	 * @return info. the information of the motorbike.
	 */
	
	@Override
	public String description(){ 
	  
	  String info = super.description()+"\nType: "+getType()+"\nGasoline Capacity: "+getGasolineCapacity()+"\nGasoline Consumption: "+ calculateGasolineConsumption()+"\nTotal Price: "+calculateTotalPrice();
	  return info;
	}
	/**Name: calculateGasolineConsumption
	 * this method calculates the gasoline consumption of the motorbike, 
	 *implementing the interface GasolineServices.
	 * @return result.the consumption of gasoline of the motorbike.
	 */
	
	@Override
	public int calculateGasolineConsumption(){ 
	  
	 int result = getGasolineCapacity() * (getDisplacement() / 90);
	 return result;
	}
	/**Name: calculateTotalPrice
	 * this method calculates the total price of the motorbike, according to the 
	 *specifications given.
	 * @return result. the total price of the vehicle.
	 */
	@Override
	public int calculateTotalPrice(){ 
	 orderArrayOfDocuments();
	  int result = getBasePrice() + (getBasePrice() * 4 / 100);
	  if(getUsed())
		  result = result - (result * 2 / 100);
	  
	  if(hasCurrentYearDocuments() == false)
			result += 500000;
	    
		
	  return result;  
	}

}