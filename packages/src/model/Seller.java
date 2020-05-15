package model;
import java.util.*;

/** 
  *This class administrates the information of the Sellers of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */
public class Seller { 
	private static final int MAX_CLIENTS = 5;

	private Client[] clientsInCharge;
	private String firstName;
	private String lastName;
	private int id;
	private int totalSales;

	/**Name: Seller
	 * Constructor method of the class Seller. The array of clients is initialized.
	 * @param firstName. the first name of the seller.
	 * @param lastName. the last name of the seller.
	 * @param id. the id of the seller.
	 * @param totalSales. the total sales the seller has made.
	 */
	public Seller(String firstName, String lastName, int id, int totalSales) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.totalSales = totalSales;
		clientsInCharge = new Client[MAX_CLIENTS];
	}

	/**Name: Seller
	 * Second Constructor method of the class Seller. The array of clients is initialized.
	 *the total sales are initialized in zero.
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public Seller(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		totalSales = 0;
		clientsInCharge = new Client[MAX_CLIENTS];
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
	 * @param firstName. the first name of the seller.
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
	 * @param lastName. the last name of the seller.
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
	 * @param id. the id of the seller.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**Name: getTotalSales
	 * getter method for the attribute totalSales.
	 *@return totalSales. attribute totalSales.
	 */

	public int getTotalSales() {
		return this.totalSales;
	}

	/**Name: setTotalSales
	 * setter method for the attribute totalSales.
	 * @param totalSales. the total Sales of the seller.
	 */
	public void setTotalSales(int totalSales) { 
		this.totalSales = totalSales;
	}
	/**Name: calculateTotalSales
	 * calculates the total sales of the seller by summing the value of the parameter,
	 *which is the value of the vehicle selled.
	 * @param sales. the value of the vehicle saled.
	 */
	
	public void calculateTotalSales(int sales){
	  
	  totalSales += sales;
	}
	
	/**Name: isAvailable
	 * evaluates if the seller has space for a client.
	 * @return available. true if the seller has space, false if not.
	 */
	
	public boolean isAvailable(){ 
	
	  boolean available = false;
	  for(int i=0; i<clientsInCharge.length; i++){ 
	    
		if(clientsInCharge[i] == null)
			available = true;
	  }
	  return available;
	}
	
	/**Name: addClient
	 * adds a client to the array of clients of the seller.
	 * @param client. the client to add.
	 */
	public void addClient(Client client){ 
	  
	  for(int i=0; i<clientsInCharge.length; i++){ 
	    
		if(clientsInCharge[i] == null){ 
		  
		  clientsInCharge[i] = client;
		}
	  }
	}
	/**Name: description
	 * shows the information of the seller.
	 * @return info. the info of the seller.
	 */
	public String description(){ 
	  
	  String info = "First Name: "+getFirstName()+"\nLast Name: "+getLastName()+"\nID: "+getId()+"\nTotal Sales: "+getTotalSales();
	  return info;
	}

}