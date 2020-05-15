package model;
import java.util.*;

 /** 
  *This class administrates the information of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */
public class Enterprise {
    
	private static final int PARK_ROWS = 10;
	private static final int PARK_COLS = 5;
	private static final int SELLERS = 10;
	private static final int LIMIT_YEAR = 2015;
	
	
	private Seller[] sellers;
	private ArrayList<Vehicle> vehicles;
	private Vehicle[][] parkingLot;
	private ArrayList<Client> clients;
	private String name;
	private int id;
	private int revenues;
	private int sales;

	/**Name: Enterprise
	 * Constructor method of the class Enterprise. The arrays and ArrayLists are initialized.
	 * @param name. the name of the enterprise.
	 * @param id.the id of the enterprise.
	 * @param revenues. the revenues of the enterprise.
	 * @param sales. the sales of the enterprise.
	 */
	public Enterprise(String name, int id, int revenues, int sales) {
	  
	  this.name = name;
	  this.id = id;
	  this.revenues = revenues;
	  this.sales = sales;
	  sellers = new Seller[SELLERS];
	  vehicles = new ArrayList<Vehicle>();
	  parkingLot = new Vehicle[PARK_ROWS][PARK_COLS];
	  clients = new ArrayList<Client>();
	}

	/**Name: Enterprise
	 * Second Constructor method of the class. Here i initialize the revenues and sales in zero.The arrays and ArrayLists are initialized.
	 * @param name. the name of the enterprise.
	 * @param id.the id of the enterprise.
	 */
	public Enterprise(String name, int id) {
	  this.name = name;
	  this.id = id;
	  revenues = 0;
	  sales = 0;
	  sellers = new Seller[SELLERS];
	  vehicles = new ArrayList<Vehicle>();
	  parkingLot = new Vehicle[PARK_ROWS][PARK_COLS];
	  clients = new ArrayList<Client>();
	}
	/**Name: getName
	 * getter method for the attribute name.
	 *@return name. attribute name.
	 */
	public String getName() {
		return this.name;
	}

	/**Name: setName
	 * setter method for the attribute name.
	 * @param name. the name of the enterprise.
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @param id. the id.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**Name: getRevenues
	 * getter method for the attribute revenues.
	 *@return revenues. attribute revenues.
	 */

	public int getRevenues() {
		return this.revenues;
	}

	/**Name: setRevenues
	 * setter method for the attribute revenues.
	 * @param revenues. the revenues.
	 */
	public void setRevenues(int revenues) {
		this.revenues = revenues;
	}
	/**Name: getSales
	 * getter method for the attribute sales.
	 *@return sales. attribute sales.
	 */

	public int getSales() {
		return this.sales;
	}

	/**Name: setSales
	* <b>Pre:</b> sales != null.
	 * setter method for the attribute sales.
	 * @param sales. the sales.
	 */
	public void setSales(int sales) {
		this.sales = sales;
	}
	/**Name: addVehicle
	* <b>Pre:</b> vehicle != null.
	 * adds a vehicle to the ArrayList of vehicles.
	 * @param vehicle. the vehicle to be added.
	 */
	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	/**Name: addClient
	* <b>Pre:</b> client != null.
	 * adds a client to the ArrayList of clients.
	 * @param client. the client to be added.
	 */
	public void addClient(Client client) {
		clients.add(client);
	}
	/**Name: vacantAvailable
	 * searchs if there is space to add another seller.
	 * <b>Pre:</b> array of sellers is initialized.
	 * @return vacant. true if there is space, false if not.
	 */
	public boolean vacantAvailable(){ 
	  
	  boolean vacant = false;
	  for(int i=0; i<sellers.length; i++){ 
	    
		if(sellers[i] == null)
			vacant = true;
	  }
	  return vacant;
	}
	/**Name: addSeller
	 * adds a seller to the array of sellers.
	 * <b>Pre:</b> array of sellers is initialized.
	 * @param seller. the seller to add.
	 */

	public void addSeller(Seller seller) {
		boolean added = false;
		
		for(int i = 0; i < sellers.length && !added; i++){ 
		  
		  if(sellers[i] == null){ 
		     sellers[i] = seller;
			 added = true;
		   }
		}
	}
	
	/**Name: fireSeller
	 * according to the id entered, the position of the seller in the array is turned into null.
     *in that way the seller is "fired".	 
	 * <b>Pre:</b> array of sellers is initialized.
	 * @param id. the id of the seller to fire.
	 */
	public void fireSeller(int id){ //metodo para despedir un vendedor, ojo esto no nos lo piden, asi que no es prioridad. 
	  
	  for(int i=0; i<sellers.length; i++){ 
	    
		if(sellers[i].getId() == id){ 
		  
		  sellers[i] = null;
		}
	  }
	}
	/**Name: showInfoSellers
	 * shows the information of the current sellers.	 
	 * <b>Pre:</b> array of sellers is initialized.
	 * @return info. a String with the info of the sellers.
	 */
	public String showInfoSellers(){ 
	  
	  String info = "";
	  for(int i=0; i<sellers.length; i++){ 
	    
		info += sellers[i].description();
	  }
	  return info;
	}
	
	/**Name: sellVehicle
	 * sells a vehicle from the ArrayList of vehicles, assigns the vehicle to a client (owner) and 
	 *assigns the value of the vehicle to the seller, so that we can have the statistics of the total sales of the seller.	 
	 * <b>Pre:</b> the seller of the idSeller is different from null.
	 * <b>Pre:</b> the client of the idBuyer is different from null.
	 * <b>Pre:</b> the vehicle of the licensePlate is different from null.
	 */
	public void sellVehicle(String licensePlate, int idBuyer, int idSeller){ 
	
	int value = 0;
	  for(int i=0; i<vehicles.size(); i++){ 
	    
		if(vehicles.get(i).getLicensePlate() == licensePlate){
			
		   for(int j=0; j<clients.size(); j++){
         
               if(clients.get(j).getId() == idBuyer){
             			
			     vehicles.get(i).setOwner(clients.get(j));
		         vehicles.get(i).setSelled();
			     value = vehicles.get(i).calculateTotalPrice();
		       }
		      }
		    }
	  }
	  
	  for(int i=0; i<sellers.length; i++){ 
	    
		if(sellers[i].getId() == idSeller){ 
		  
		  sellers[i].calculateTotalSales(value);
		}
	  }
	}

    /**Name: showCatalogueVehicles
	 * shows the vehicles according to how the client wants to see them. 
     * it can see only gasoline cars or electric cars, etc. and only used, or only new or both of them.	
	 * <b>Pre:</b> the ArrayList of vehicles is initialized.
	 *@return info. the String with the information of the catalogue of vehicles.
	 */
	public String showCatalogueVehicles(int option1, int option2) { 
											
		int countGas = 0;
		int countElec = 0;
		int countHyb = 0;
		int countMo = 0;
		
		String info = "Hello!\n";
		if(option2 == 1) {	
	   info += "welcome to our catalogue of Used vehicles: ";
	  if(option1 == 1) {
		  info += "\nThese are our Gasoline cars: ";
	  for(int i = 0; i < vehicles.size(); i++){ 
	    
		if(vehicles.get(i) instanceof Gasoline && vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		  
		  info += vehicles.get(i).description()+"\n";
		  countGas++;
		}
	  }  
	 }else if(option1 == 2){ 
	   
	   info += "\nThese are our Electric Cars: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof Electric && vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countElec++;
		 }
	   }
	 }else if(option1 == 3){ 
	   
	   info += "\nThese are our Hybrid Cars: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof Hybrid && vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countHyb++;
		 }
	   }
	 }else if(option1 == 4){ 
	   
	   info += "\nThese are our Motorbikes: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof MotorBike && vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countMo++;
		 }
	   }
	 } 
	 
	 info += "Total Used Gasoline cars: " + countGas+"\n";
	 info += "Total Used Electric cars: " + countElec+"\n";
	 info += "Total Used Hybrid cars: " + countHyb+"\n";
	 info += "Total Used Motorbikes: "+ countMo+"\n";
	}else if(option2 == 2) {	
	   info += "welcome to our catalogue of New vehicles: ";
	  if(option1 == 1) {
		  info += "\nThese are our Gasoline cars: ";
	  for(int i = 0; i < vehicles.size(); i++){ 
	    
		if(vehicles.get(i) instanceof Gasoline && !vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		  
		  info += vehicles.get(i).description()+"\n";
		  countGas++;
		}
	  }  
	 }else if(option1 == 2){ 
	   
	   info += "\nThese are our Electric Cars: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof Electric && !vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countElec++;
		 }
	   }
	 }else if(option1 == 3){ 
	   
	   info += "\nThese are our Hybrid Cars: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof Hybrid && !vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countHyb++;
		 }
	   }
	 }else if(option1 == 4){ 
	   
	   info += "\nThese are our Motorbikes: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof MotorBike && !vehicles.get(i).getUsed() && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countMo++;
		 }
	   }
	 } 
	 info += "Total New Gasoline cars: " + countGas+"\n";
	 info += "Total New Electric cars: " + countElec+"\n";
	 info += "Total New Hybrid cars: " + countHyb+"\n";
	 info += "Total New Motorbikes: "+ countMo+"\n";
	}else if(option2 == 3) {	
	   info += "welcome to our catalogue of vehicles: ";
	  if(option1 == 1) {
		  info += "\nThese are our Gasoline cars: ";
	  for(int i = 0; i < vehicles.size(); i++){ 
	    
		if(vehicles.get(i) instanceof Gasoline && vehicles.get(i).getOwner() != null){ 
		  
		  info += vehicles.get(i).description()+"\n";
		  countGas++;
		}
	  }  
	 }else if(option1 == 2){ 
	   
	   info += "\nThese are our Electric Cars: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof Electric && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countElec++;
		 }
	   }
	 }else if(option1 == 3){ 
	   
	   info += "\nThese are our Hybrid Cars: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof Hybrid && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countHyb++;
		 }
	   }
	 }else if(option1 == 4){ 
	   
	   info += "\nThese are our Motorbikes: \n";
	   for(int i=0; i<vehicles.size(); i++){ 
	     
		 if(vehicles.get(i) instanceof MotorBike && vehicles.get(i).getOwner() != null){ 
		   
		   info += vehicles.get(i).description()+"\n";
		   countMo++;
		 }
	   }
	 } 
	 info += "Total Gasoline cars: " + countGas+"\n";
	 info += "Total Electric cars: " + countElec+"\n";
	 info += "Total Hybrid cars: " + countHyb+"\n";
	 info += "Total Motorbikes: "+ countMo+"\n";
	}
	  return info;
	}

/**Name: assignClientToSeller
	 * assigns the entered client to a seller, if this was not possible the method returns false.	
	 * <b>Pre:</b> client != null.
	 *@return added. true if the client was assigned to a seller, false if not.
	 */
public boolean assignClientToSeller(Client client){ 
  
  boolean added = false;
  String info = "";
  for(int i=0; i<sellers.length; i++){ 
    
	if(sellers[i].isAvailable()){ 
	  
	  sellers[i].addClient(client);
	  added = true;
	}
  }
  return added; //ojo si es true, no tengo que hacer nada mas sino notificar que tiene un asesor y todo bien
               //pero si es false, entonces hay que decirle que no hay vendedores disponibles, 
}
/**Name: assignInterestVehicle
	 * assigns a vehicle of interest to the entered client. the vehicle is added to the 
     *ArrayList of vehicles of interest of the client.	 
	 * <b>Pre:</b> the client of the id is different from null.
	 * <b>Pre:</b> the vehicle of the license plate is different from null.
	 */
  public void assignInterestVehicle(int id, String license){
    
	Vehicle v = null;
	
   for(int i=0; i<vehicles.size(); i++){ 
   
     if(vehicles.get(i).getLicensePlate().equals(license)){ 
     
	   v = vehicles.get(i);
    }
  }
    for(int i=0; i<clients.size(); i++){ 
    
	  if(clients.get(i).getId() == id){ 
	  
	    clients.get(i).addInterestVehicle(v);
	 }
   }
}
/**Name: infoClient
	 * shows the info and statistics of the client of the entered id. This includes 
     *the personal information of the client, as well as its vehicles of interest.	 
	 * <b>Pre:</b> the client of the id is different from null.
	 *@return info. the information of the client.
	 */
public String infoClient(int id){
	
  String info = "";
  for(int i=0; i<clients.size(); i++){ 
    
	if(clients.get(i).getId() == id){ 
	  
	  info += clients.get(i).infoInterestVehicles();
	}
  }
  return info;
}
/**Name: calculateTotalSales
	 * calculates the total sales of the enterprise by summing the total sales of each seller.	 
	 * <b>Pre:</b> the array of sellers is initialized.
	 */
public void calculateTotalSales(){ 

  for(int i=0; i<sellers.length; i++){ 
    
	this.sales += sellers[i].getTotalSales();
  }
 
}
/**Name: moveVehiclesToTheParkingLot
	 * once this method is invoked, it moves all the vehicles (according to the conditions) to the 
     *parking Lot.	 
	 * <b>Pre:</b> the ArrayList of vehicles is initialized.
	 */
public void moveVehiclesToTheParkingLot(){ 
  
  for(int i=0; i<vehicles.size(); i++){ 
    
	if(vehicles.get(i).getSelled() == false && vehicles.get(i).getUsed() && vehicles.get(i).getModel() < LIMIT_YEAR ){ 
	  
	  if(vehicles.get(i).getModel() == 2014){ 
	    
		for(int j=0;j<PARK_ROWS; j++){ 
		  
		  if(parkingLot[j][0] == null){ 
		    
			parkingLot[j][0] = vehicles.get(i);
		  }
		}
	  }else if(vehicles.get(i).getModel() == 2013){ 
	    
		for(int j=0;j<PARK_ROWS; j++){ 
		  
		  if(parkingLot[j][1] == null){ 
		    
			parkingLot[j][1] = vehicles.get(i);
		  }
		}
	  }else if(vehicles.get(i).getModel() == 2012){ 
	    
		for(int j=0;j<PARK_ROWS; j++){ 
		  
		  if(parkingLot[j][2] == null){ 
		    
			parkingLot[j][2] = vehicles.get(i);
		  }
		}
	  }else if(vehicles.get(i).getModel() == 2011){ 
	    
		for(int j=0;j<PARK_ROWS; j++){ 
		  
		  if(parkingLot[j][3] == null){ 
		    
			parkingLot[j][3] = vehicles.get(i);
		  }
		}
	  }else if(vehicles.get(i).getModel() < 2012){ 
	    
		for(int j=0;j<PARK_ROWS; j++){ 
		  
		  if(parkingLot[j][4] == null){ 
		    
			parkingLot[j][4] = vehicles.get(i);
		  }
		}
	  }
	}
  }
}
/**Name: isFull
	 * evaluates if the Parking Lot is full or it still has space for more vehicles.	 
	 * @return full. true if it is full, false if not.
	 */
public boolean isFull(){ 
  
  boolean full = true;
 for(int i=0; i<PARK_ROWS; i++){ 
   
   for(int j=0; j<PARK_COLS; j++){ 
     
	 if(parkingLot[i][j] == null){ 
	   
	   full = false;
	 }
   }
 }

  return full;  
}
/**Name: infoParking
	 * shows the information of the vehicles in the Parking Lot.
     *@param year. the model of the vehicles that are going to be showed.	 
	 *@return info. a String with the information of the vehicles.
	 */
public String infoParking(int year){ 

  String info = "";
  for(int i=0;i<PARK_ROWS; i++){ 
    
	for(int j=0; j<PARK_COLS; j++){ 
	  
	  if(parkingLot[i][j].getModel() == year){ 
	    
		info += parkingLot[i][j].description()+"\n";
	  }
	}
  }
  return info;
}
















}