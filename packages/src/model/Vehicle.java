package model;
import java.util.*;

/** 
  *This class administrates the information of the Vehicles of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */
public abstract class Vehicle { 
    private static final int CURRENT_YEAR = 2020;
	
	
	private ArrayList<Document> documents;
	private Client owner;
	private int totalPrice;
	private int basePrice;
	private String brand;
	private int model;
	private int displacement;
	private int mileage;
	private boolean used;
	private String licensePlate;
	private boolean selled;

	/**Name: Vehicle
	 * Constructor method of the class. The ArrayList of documents is initialized, the owner is initialized in null.
	 * @param basePrice. the base price of the vehicle.
	 * @param brand. the brand of the vehicle.
	 * @param model. the model of the vehicle.
	 * @param displacement. the displacement of the vehicle.
	 * @param mileage. the mileage of the vehicle.
	 * @param used. boolean that indicates if the vehicle is used.
	 * @param licensePlate. license plate of the vehicle.
	 */
	public Vehicle(int basePrice, String brand, int model, int displacement, int mileage, boolean used, String licensePlate) {
		this.basePrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.mileage = mileage;
		this.used = used;
		this.licensePlate = licensePlate;
		owner = null;
		documents = new ArrayList<Document>();
	}
    /**Name: Vehicle
	 * Second Constructor method of the class. The ArrayList of documents is initialized, the owner is initialized in null.
	 *the license plate is given a default value.
	 * @param basePrice. the base price of the vehicle.
	 * @param brand. the brand of the vehicle.
	 * @param model. the model of the vehicle.
	 * @param displacement. the displacement of the vehicle.
	 * @param mileage. the mileage of the vehicle.
	 * @param used. boolean that indicates if the vehicle is used.
	 */
	public Vehicle(int basePrice, String brand, int model, int displacement, int mileage, boolean used) {
		this.basePrice = basePrice;
		this.brand = brand;
		this.model = model;
		this.displacement = displacement;
		this.mileage = mileage;
		this.used = used;
		licensePlate = "this vehicle doesn't has license plate yet";
		owner = null;
		documents = new ArrayList<Document>();
	}
	/**Name: getOwner
	 * getter method of the attribute owner.
	 * @return owner. the owner of the vehicle.
	 */
	
	public Client getOwner(){ 
	  
	  return this.owner;
	}
	/**Name: setOwner
	 * setter method of the attribute owner.
	 * @param client. the owner of the vehicle.
	 */
	
	public void setOwner(Client client){ 
	  
	  this.owner = client;
	}
	
	/**Name: getTotalPrice
	 * getter method of the attribute totalPrice.
	 * @return totalPrice. the total Price of the vehicle.
	 */

	public int getTotalPrice() {
		return this.totalPrice;
	}

	/**Name: setTotalPrice
	 * setter method of the attribute totalPrice.
	 * @param totalPrice. the total Price of the vehicle.
	 */
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**Name: getBasePrice
	 * getter method of the attribute basePrice.
	 * @return basePrice. the base Price of the vehicle.
	 */

	public int getBasePrice() {
		return this.basePrice;
	}

	/**Name: setBasePrice
	 * setter method of the attribute basePrice.
	 * @param basePrice. the base Price of the vehicle.
	 */
	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}
	/**Name: getBrand
	 * getter method of the attribute brand.
	 * @return brand. the brand of the vehicle.
	 */

	public String getBrand() {
		return this.brand;
	}

	/**Name: setBrand
	 * setter method of the attribute brand.
	 * @param brand. the brand of the vehicle.
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**Name: getModel
	 * getter method of the attribute model.
	 * @return model. the model of the vehicle.
	 */

	public int getModel() {
		return this.model;
	}

	/**Name: setModel
	 * setter method of the attribute model.
	 * @param model. the model of the vehicle.
	 */
	public void setModel(int model) {
		this.model = model;
	}
	/**Name: getDisplacement
	 * getter method of the attribute displacement.
	 * @return displacement. the displacement of the vehicle.
	 */

	public int getDisplacement() {
		return this.displacement;
	}

	/**Name: setDisplacement
	 * setter method of the attribute displacement.
	 * @param displacement. the displacement of the vehicle.
	 */
	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	/**Name: getMileage
	 * getter method of the attribute mileage.
	 * @return mileage. the mileage of the vehicle.
	 */

	public int getMileage() {
		return this.mileage;
	}

	/**Name: setMileage
	 * setter method of the attribute mileage.
	 * @param mileage. the mileage of the vehicle.
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	/**Name: getUsed
	 * getter method of the attribute used.
	 * @return used. true if the vehicle is used, false if not.
	 */

	public boolean getUsed() {
		return this.used;
	}

	/**Name: setUsed
	 * setter method of the attribute used.
	 * @param used. boolean, true if the vehicle is used, false if not.
	 */
	public void setUsed(boolean used) {
		this.used = used;
	}
	/**Name: getLicensePlate
	 * getter method of the attribute licensePlate.
	 * @return licensePlate. the license Plate of the vehicle.
	 */

	public String getLicensePlate() {
		return this.licensePlate;
	}

	/**Name: setLicensePlate
	 * setter method of the attribute licensePlate.
	 * @param licensePlate.the license Plate of the vehicle.
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	/**Name: getSelled
	 * getter method of the attribute selled.
	 * @return selled. true if the vehicle is selled, false if not.
	 */
	
	public boolean getSelled(){ 
	  
	  return selled;
	}
	/**Name: setSelled
	 * setter method of the attribute selled. it depends if the vehicle has an owner assigned, if it does 
	 *it is because the vehicle was selled.
	 */
	
	public void setSelled(){ 
	  
	  if(getOwner() != null)
		  selled = true;
	  else
		  selled = false;
	}
	/**Name: description
	 * shows the info of the attributes of the vehicle.
	 *@return info. the info of the vehicle.
	 */
	public String description(){ 
	  orderArrayOfDocuments();
	  String info = "Base Price: "+ getBasePrice() +"\nBrand: "+ getBrand() + "\nModel: "+ getModel() +"\nDisplacement: " + getDisplacement() + "\nMileage: "+ getMileage() + "\nUsed: " + getUsed() + "\nLicense Plate: " + getLicensePlate();
	  info += "\nDecoded code of document: " + documents.get(documents.size()-1).decode()+"\n";
	  return info;
	}
	/**Name: orderArrayOfDocuments
	 * this method orders the positions of the array of documents according to the year 
	 *or model of the vehicle like this: the most recent goes in the last position.
	 */
	
	public void orderArrayOfDocuments(){ 
		int index = 0;
		ArrayList<Document> newArray = new ArrayList<Document>();
		
	  for(int i=0; i<documents.size(); i++){ 
	    
		int year = documents.get(i).getYear();
		boolean minor = true;
		for(int j=(i+1); j<documents.size(); j++){ 
		  
		  if(year > documents.get(j).getYear())
			  minor = false;
		  
		}
		if(minor){ 
		  
		  newArray.set(index, documents.get(i));
		  index++;
		}
	  }
	  
	  documents = newArray;
	}

    /**Name: addDocuments
	 * this method adds a document to the ArrayList of documents.
	 *@param document. the document to add.
	 */
    public void addDocuments(Document document){ 
	  
	  documents.add(document);
	}
	/**Name: hasCurrentYearDocuments
	 * this method evaluates if the vehicle as documents of the current year.
	 *@return has. true if the documents are of the current year, false if they are expired.
	 */
	public boolean hasCurrentYearDocuments(){ 
	
	  boolean has = false;
	  if(documents.get(documents.size()-1).getYear() == CURRENT_YEAR)
		  has = true;
	  
	  return has;
	}
	/**Name: calculateTotalPrice
	 * abstract method that will be implemented by the heritage classes.
	 */


	public abstract int calculateTotalPrice();

}