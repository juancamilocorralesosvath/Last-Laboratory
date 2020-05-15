package model;
import java.util.*;
/** 
  *This class administrates the information of the clients of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */

public class Client {

	private ArrayList<Vehicle> interestedIn;
	private String firstName;
	private String lastName;
	private int id;
	private int phoneNumber;
	private String email;

	/**Name: Client
	 * Constructor methos of the class. The ArrayList of vehicles of interest is initialized.
	 * @param firstName. the first name of the client.
	 * @param lastName. the last name of the client.
	 * @param id. the id of the client.
	 * @param phoneNumber. the phone number of the client.
	 * @param email. the email of the client.
	 */
	public Client(String firstName, String lastName, int id, int phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.email = email;
		interestedIn = new ArrayList<Vehicle>();
	}
	
    /**Name: Client
	 * Constructor methos of the class. The ArrayList of vehicles of interest is initialized. the email is initialized
	 *in a default value.
	 * @param firstName. the first name of the client.
	 * @param lastName. the last name of the client.
	 * @param id. the id of the client.
	 * @param phoneNumber. the phone number of the client.
	 */
	public Client(String firstName, String lastName, int id, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.phoneNumber = phoneNumber;
		email = " ";
		interestedIn = new ArrayList<Vehicle>();
	}
	/**Name: getFirstName
	 * getter method for the attribute firstName.
	 *@return firstName. attribute firstName.
	 */

	public String getFirstName() {
		return this.firstName;
	}

	/**Name: setFirstName
	 * setter method for the attribute firstName.
	 * @param firstName. the first name of the client.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**Name: getLastName
	 * getter method for the attribute lastName.
	 *@return lastName. attribute lastName.
	 */

	public String getLastName() {
		return this.lastName;
	}

	/**Name: setLastName
	 * setter method for the attribute lastName.
	 * @param lastName. the last name of the client.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**Name: getId
	 * getter method for the attribute id.
	 *@return id. attribute id.
	 */

	public int getId() {
		return this.id;
	}

	/**Name: setId
	 * setter method for the attribute id.
	 * @param id. the id of the client.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**Name: getPhoneNumber
	 * getter method for the attribute phoneNumber.
	 *@return phoneNumber. attribute phoneNumber.
	 */

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

	/**Name: setPhoneNumber
	 * setter method for the attribute phoneNumber.
	 * @param phoneNumber. the phoneNumber of the client.
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**Name: getEmail
	 * getter method for the attribute email.
	 *@return email. attribute email.
	 */
	public String getEmail() {
		return this.email;
	}

	/**Name: setEmail
	 * setter method for the attribute email.
	 * @param email. the email of the client.
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**Name: addInterestVehicle
	 * this method adds a vehicle of interest to the ArrayList of the client.
	 * @param vehicle. the vehicle of interest of the client.
	 */
	public void addInterestVehicle(Vehicle vehicle) {
		interestedIn.add(vehicle);
	}
	/**Name: infoInterestVehicles
	 * this method shows the statistics and information of the vehicles
	 *of interest of the client.
	 * @return info. the info of the vehicles of interest of the client.
	 */


	public String infoInterestVehicles() {
		int countGas = 0;
		int countElec = 0;
		int countHyb = 0;
		int countMo = 0;
		
		String info = "Client: "+getFirstName()+" "+getLastName()+" with id: "+getId()+"\nis interested in the following vehicles: \n";
		for(int i = 0; i < interestedIn.size(); i++){ 
		  
		  if(interestedIn.get(i) instanceof Gasoline){
			 
		  info += "Vehicle number "+(i+1)+":\nType: Gasoline\n"+interestedIn.get(i).description()+"\n";
		  }else if(interestedIn.get(i) instanceof Electric){
			 
		  info += "Vehicle number "+(i+1)+":\nType: Electric\n"+interestedIn.get(i).description()+"\n";
		  }else if(interestedIn.get(i) instanceof Hybrid){
			 
		  info += "Vehicle number "+(i+1)+":\nType: Hybrid\n"+interestedIn.get(i).description()+"\n";
		  }else if(interestedIn.get(i) instanceof MotorBike){
			 
		  info += "Vehicle number "+(i+1)+":\nType: MotorBike\n"+interestedIn.get(i).description()+"\n";
		  }
		} 
	 info += "Gasoline cars: " + countGas+"\n";
	 info += "Electric cars: " + countElec+"\n";
	 info += "Hybrid cars: " + countHyb+"\n";
	 info += "Motorbikes: "+ countMo+"\n";
		return info;
	}

}