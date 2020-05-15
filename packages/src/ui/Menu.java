package ui;
import java.util.Scanner;
import model.*;
/** 
  *This is the Menu class of the program, here is where the user interacts with the 
  *functionalities of the program.
  @autor Juan Camilo Corrales Osvath
  */
public class Menu { 
 
  private static final int ADD_GAS = 1;
  private static final int ADD_ELEC = 2;
  private static final int ADD_HYB = 3;
  private static final int ADD_MOT = 4;
  private static final int ADD_COSTUMER = 5;
  private static final int ADD_SELLER= 6;
  private static final int FIRE_SELLER = 7;
  private static final int INTEREST_VEHICLE = 8;
  private static final int INFO_COSTUMER = 9;
  private static final int SELL_VEHICLE = 10;
  private static final int SHOW_VEHICLES = 11;
  private static final int SEND_TO_PARKINGLOT = 12;
  private static final int SHOW_INFO_PARKINGLOT = 13;
  private static final int PARKINGLOT_IS_FULL = 14;
  private static final int EXIT = 15;
  
  private Enterprise e;
  /**Name: Menu
  *Constructor method.Here i initialize the enterprise, some vehicles, clients, sellers and documents.
  */
  public Menu(){ 
    
	e = new Enterprise("JUANCHO'S ENTERPRISE", 1007, 584000, 1000000);

	Gasoline g1 = new Gasoline(2000000, "Mercedes-benz", 2015, 1600, 0, false, "van", 4, true, 100, "diesel");
	Electric l1 = new Electric(3000000, "Tesla", 2020, 1700, 200, true, "MTO 472", "sedan", 2, true, "fast", 100);
	Hybrid h1 = new Hybrid(3000000, "Toyota", 2020, 2000, 0, false, "sedan", 4, false, 1600, "extra", "normal", 100);
	MotorBike m1 = new MotorBike(750000, "Harley-Davidson", 1975, 2000, 4000, true, "MHY 475", "sportive", 20);
	Gasoline g2 = new Gasoline(1000000, "Chevrolet", 2006, 1400, 2000, true, "MHG 546", "van", 4, false, 50, "common");
	Electric l2 = new Electric(1000000, "Tesla", 2015, 1000, 0, false, "ATO 779", "sedan", 4, false, "normal", 50);
	Hybrid h2 = new Hybrid(3500000, "BMW", 2020, 2000, 0, false, "sedan", 4, true, 200, "diesel", "fast", 200);
	MotorBike m2 = new MotorBike(1500000, "Kawasaki", 2015, 2000, 0, false, "scooter", 40);
	
	
	SOAT s1 = new SOAT(10000, 2015, 1000000);
	Revision r1 = new Revision(11000, 2015, 100);
		
	SOAT s2 = new SOAT(100000, 2020, 5000000);
	Revision r2 = new Revision(50000, 2020, 0);
	
	SOAT s3 = new SOAT(200000, 2020, 1500000);
	Revision r3 = new Revision(200000, 2020, 50);
	
	SOAT s4 = new SOAT(1000, 1975, 4000);
	Revision r4 = new Revision(500, 1975, 100);
	
	SOAT s5 = new SOAT(8000, 2010, 100000);
	Revision r5 = new Revision(7500, 2010, 500);
	
	SOAT s6 = new SOAT(80000, 2017, 800000);
	Revision r6 = new Revision(53000, 2017, 0);
	
	SOAT s7 = new SOAT(200000, 2020, 2000000);
	Revision r7 = new Revision(140000, 2020, 25);
	
	SOAT s8 = new SOAT(70000, 2017, 500000);
	Revision r8 = new Revision(50000, 2017, 200);
	
	g1.addDocuments(s1);
	g1.addDocuments(r1);
	
	l1.addDocuments(s2);
	l1.addDocuments(r2);
	
	h1.addDocuments(s3);
	h1.addDocuments(r3);
	
	h1.addDocuments(s3);
	h1.addDocuments(r3);
	
	m1.addDocuments(s4);
	m1.addDocuments(r4);
	
	g2.addDocuments(s5);
	g2.addDocuments(r5);
	
	l2.addDocuments(s6);
	l2.addDocuments(s6);
	
	h2.addDocuments(s7);
	h2.addDocuments(r7);
	
	m2.addDocuments(s8);
	m2.addDocuments(r8);
	
	e.addVehicle(g1);
	e.addVehicle(l1);
	e.addVehicle(h1);
	e.addVehicle(m1);
	e.addVehicle(g2);
	e.addVehicle(l2);
	e.addVehicle(m2);
	
	//seller Seller(String firstName, String lastName, int id, int totalSales)
	
	Seller se1 = new Seller("juan", "corrales", 18746, 1000000);
	Seller se2 = new Seller("Omar", "Renteria", 64758, 2000000);
	Seller se3 = new Seller("Carlos", "Delrio", 8769, 1000000);
	Seller se4 = new Seller("Tania", "Valderrama", 74958, 3000000);
	Seller se5 = new Seller("Jorge", "Pinzon", 74563, 500000);
	
	e.addSeller(se1);
	e.addSeller(se2);
	e.addSeller(se3);
	e.addSeller(se4);
	e.addSeller(se5);
	
	//Client String firstName, String lastName, int id, int phoneNumber, String email

    	Client c1 = new Client("Arturo", "Calle", 74643, 31245678, "arturocalle@gmail.com");
		Client c2 = new Client("Jason", "Becker", 74563, 14046736, "jasonbecker@gmail.com");
		Client c3 = new Client("James", "Hetfield", 74658, 64537625, "jamesHetfield@gmail.com");
		Client c4 = new Client("Paul", "Gilbert", 87546, 18746537, "paulgilbert@gmail.com");
		Client c5 = new Client("Guthrie", "Govan", 85746, 8763283, "guthriegovan@gmail.com");
		
		
	
	
	e.addClient(c1);
	e.addClient(c2);
	e.addClient(c3);
	e.addClient(c4);
	e.addClient(c5);

  }
  /**Name: showMenu
  *this are the options given to the user.
  */
  public void showMenu(){ 
    
	System.out.println("Welcome! what do you want to do?");
	System.out.println("(1)Add a Gasoline Car.");
	System.out.println("(2)Add a Electric Car.");
	System.out.println("(3)Add a Hybrid Car.");
	System.out.println("(4)Add a Motorbike.");
	System.out.println("(5)Add a Costumer.");
	System.out.println("(6)Add a  Seller.");
	System.out.println("(7)Fire a  Seller.");
	System.out.println("(8)Add a Vehicle of interest to a costumer.");
	System.out.println("(9)Show the Info of a Costumer.");
	System.out.println("(10)Sell a Vehicle.");
	System.out.println("(11)Show Catalogue of Vehicles.");
	System.out.println("(12)Send Vehicles to the Parking Lot.");
	System.out.println("(13)Show the info of the vehicles of the Parking Lot.");
	System.out.println("(14)See if the Parking Lot is full.");
	System.out.println("(15)to exit the program.");
	
  }
   /**Name: readOption
  *this method receives the option entered by the user.
  */
   public int readOption(){ 
  
    Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
	sc.nextLine();
	
	return option;
  }
  /**Name: addElec
  *this method adds an electric car to the ArrayList of vehicles of the enterprise.
  */
  public void addElec(){ 
    Scanner sc = new Scanner(System.in);
	
	int basePrice = 0; 
	String brand = "";
	int model = 0;
	int displacement = 0;
	int mileage = 0;
	boolean used = false;
	String licensePlate = "";
	String type = ""; 
	int doors = 0; 
	boolean polarizedWindows = false; 
	String chargerType = "";
	int batteryLife = 0;
	int answer = 0;
	int answer2 = 0;
	
	System.out.println("is the car used?\n(1)Yes\n(2)No\n");
	answer = sc.nextInt();
	sc.nextLine();
	
	if(answer == 1)
		used = true;
	else
		used = false;
	
	
	System.out.println("Base Price: ");
	basePrice = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Brand: ");
	brand = sc.nextLine();
	
	System.out.println("Model: ");
	model = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Displacement: ");
	displacement = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Mileage: ");
	mileage = sc.nextInt();
	sc.nextLine();
	
	System.out.println("License Plate: (if the car is new, don't write anything)");
	licensePlate = sc.nextLine();
	
	System.out.println("Type:(Van or Sedan) ");
	type = sc.nextLine();
	
	System.out.println("Doors: ");
	doors = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Does it has polarized windows?\n(1)Yes\n(2)No");
	answer2 = sc.nextInt();
	sc.nextLine();
	
	if(answer2 == 1)
		polarizedWindows = true;
	else
		polarizedWindows = false;
	
	System.out.println("Battery Life: ");
	batteryLife = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Charger Type:(fast or normal) ");
	chargerType = sc.nextLine();
	
	Electric elec = new Electric(basePrice, brand, model, displacement, mileage, used, licensePlate,  type, doors, polarizedWindows, chargerType, batteryLife);
	
	
	e.addVehicle(elec);
	System.out.println("Electric car added successfuly!\n");
    
  }
  /**Name: addGas
  *this method adds a Gasoline car to the ArrayList of vehicles of the enterprise.
  */
  public void addGas(){ 
    Scanner sc = new Scanner(System.in);
	
	int basePrice = 0; 
	String brand = "";
	int model = 0;
	int displacement = 0;
	int mileage = 0;
	boolean used = false;
	String licensePlate = "";
	String type = ""; 
	int doors = 0; 
	boolean polarizedWindows = false; 
	int tankCapacity = 0;
	String gasolineType = "";
	int answer = 0;
	int answer2 = 0;
	
	System.out.println("is the car used?\n(1)Yes\n(2)No\n");
	answer = sc.nextInt();
	sc.nextLine();
	
	if(answer == 1)
		used = true;
	else
		used = false;
	
	
	System.out.println("Base Price: ");
	basePrice = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Brand: ");
	brand = sc.nextLine();
	
	System.out.println("Model: ");
	model = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Displacement: ");
	displacement = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Mileage: ");
	mileage = sc.nextInt();
	sc.nextLine();
	
	System.out.println("License Plate: (if the car is new, don't write anything)");
	licensePlate = sc.nextLine();
	
	System.out.println("Type:(Van or Sedan) ");
	type = sc.nextLine();
	
	System.out.println("Doors: ");
	doors = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Does it has polarized windows?\n(1)Yes\n(2)No");
	answer2 = sc.nextInt();
	sc.nextLine();
	
	if(answer2 == 1)
		polarizedWindows = true;
	else
		polarizedWindows = false;
	
	System.out.println("Tank Capacity: ");
	tankCapacity = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Gasoline Type:(common, extra or diesel) ");
	gasolineType = sc.nextLine();
	

	Gasoline g = new Gasoline(basePrice, brand, model, displacement, mileage, used, licensePlate,  type, doors, polarizedWindows, tankCapacity, gasolineType);
	
	e.addVehicle(g);
	System.out.println("Gasoline car added successfuly!\n");

  }
  /**Name: addHyb
  *this method adds a Hybrid car to the ArrayList of vehicles of the enterprise.
  */
  public void addHyb(){ 
    Scanner sc = new Scanner(System.in);
	
	int basePrice = 0; 
	String brand = "";
	int model = 0;
	int displacement = 0;
	int mileage = 0;
	boolean used = false;
	String licensePlate = "";
	String type = ""; 
	int doors = 0; 
	boolean polarizedWindows = false; 
	int tankCapacity = 0;
	String gasolineType = "";
	String chargerType = "";
	int batteryLife = 0;
	int answer = 0;
	int answer2 = 0;
	
	System.out.println("is the car used?\n(1)Yes\n(2)No\n");
	answer = sc.nextInt();
	sc.nextLine();
	
	if(answer == 1)
		used = true;
	else
		used = false;
	
	
	System.out.println("Base Price: ");
	basePrice = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Brand: ");
	brand = sc.nextLine();
	
	System.out.println("Model: ");
	model = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Displacement: ");
	displacement = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Mileage: ");
	mileage = sc.nextInt();
	sc.nextLine();
	
	System.out.println("License Plate: (if the car is new, don't write anything)");
	licensePlate = sc.nextLine();
	
	System.out.println("Type:(Van or Sedan) ");
	type = sc.nextLine();
	
	System.out.println("Doors: ");
	doors = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Does it has polarized windows?\n(1)Yes\n(2)No");
	answer2 = sc.nextInt();
	sc.nextLine();
	
	if(answer2 == 1)
		polarizedWindows = true;
	else
		polarizedWindows = false;
	
	System.out.println("Tank Capacity: ");
	tankCapacity = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Gasoline Type:(common, extra or diesel) ");
	gasolineType = sc.nextLine();
	
	System.out.println("Battery Life: ");
	batteryLife = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Charger Type: (fast or normal)");
	chargerType = sc.nextLine();
	
	
	Hybrid hyb = new Hybrid(basePrice, brand, model, displacement, mileage, used, licensePlate,  type, doors, polarizedWindows, tankCapacity, gasolineType, chargerType, batteryLife);

	
	e.addVehicle(hyb);
	System.out.println("Hybrid car added successfuly!\n");

  }
  /**Name: addMot
  *this method adds a Motorbike to the ArrayList of vehicles of the enterprise.
  */
  public void addMot(){ 
    Scanner sc = new Scanner(System.in);
	
	int basePrice = 0; 
	String brand = "";
	int model = 0;
	int displacement = 0;
	int mileage = 0;
	boolean used = false;
	String licensePlate = "";
	String type = ""; 
	int gasolineCapacity = 0;
	int answer = 0;
	
	System.out.println("is the motorbike used?\n(1)Yes\n(2)No\n");
	answer = sc.nextInt();
	sc.nextLine();
	
	if(answer == 1)
		used = true;
	else
		used = false;
	
	
	System.out.println("Base Price: ");
	basePrice = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Brand: ");
	brand = sc.nextLine();
	
	System.out.println("Model: ");
	model = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Displacement: ");
	displacement = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Mileage: ");
	mileage = sc.nextInt();
	sc.nextLine();
	
	System.out.println("License Plate: (if the car is new, don't write anything)");
	licensePlate = sc.nextLine();
	
	System.out.println("Type:(standard, sportive, scooter or cross) ");
	type = sc.nextLine();
	
	System.out.println("Gasoline Capacity: ");
	gasolineCapacity = sc.nextInt();
	sc.nextLine();
	
	MotorBike mot = new MotorBike(basePrice, brand, model, displacement, mileage, used, licensePlate, type, gasolineCapacity);
	
	e.addVehicle(mot);
	
	System.out.println("Motorbike added successfuly!\n");
	
	
  }
  /**Name: addCostumer
  *this method adds a costumer to the ArrayList of costumers of the enterprise.
  */
  public void addCostumer(){ 
    
	Scanner sc = new Scanner(System.in);
	
	String firstName = ""; 
	String lastName = "";
	int id = 0;
	int phoneNumber = 0; 
	String email = "";
	
	System.out.println("First Name: ");
	firstName = sc.nextLine();
	
	System.out.println("Last Name: ");
	lastName = sc.nextLine();
	
	System.out.println("ID: ");
	id = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Phone Number: ");
	phoneNumber = sc.nextInt();
	sc.nextLine();
	
	System.out.println("Email: ");
	email = sc.nextLine();
	
	Client c = new Client(firstName, lastName, id, phoneNumber, email);
	
	boolean assigned = e.assignClientToSeller(c);
	
	if(assigned){ 
	
	  e.addClient(c);
	  System.out.println("Client was succesfuly added and assigned to a seller! ");
	}else{ 
	
	  e.addClient(c);
	  System.out.println("we are sorry but in this moment we have no available sellers,\n you can still buy any of our products, the only difference is that your experience won't be that personal!");
	  
	}
  }
  
  /**Name: addSeller
  *this method adds a seller to the Array of sellers of the enterprise.
  */
  public void addSeller(){ 
  Scanner sc = new Scanner(System.in);
  
    String firstName = ""; 
	String lastName = "";
	int id = 0;
	
	if(e.vacantAvailable()){ 
	  
	  System.out.println("Ok! there is space for more employees.");
	  
	  System.out.println("First Name: ");
	  firstName = sc.nextLine();
	  
	  System.out.println("Last Name: ");
	  lastName = sc.nextLine();
	  
	  System.out.println("ID: ");
	  id = sc.nextInt();
	  sc.nextLine();
	  
	  Seller s = new Seller(firstName, lastName, id);
	  e.addSeller(s);
	}else{ 
	  
	  System.out.println("Sorry, we don't have space for more sellers");
	}
  }
  
  /**Name: fireSeller
  *this method fires a seller froom the Array of sellers of the enterprise.
  */
  public void fireSeller(){ 
    Scanner sc = new Scanner(System.in);
	int selection = 0;
	
	System.out.println("You will see the list of the current sellers, please write down the id\nof the seller that will be fired.");
	System.out.println(e.showInfoSellers());
	System.out.println("ID: ");
	selection = sc.nextInt();
	sc.nextLine();
	e.fireSeller(selection);
	System.out.println("employee fired.");
  }
  /**Name: addInterestVehicle
  *this method adds a vehicle of interest to a costumer.
  */
  public void addInterestVehicle(){ 
    Scanner sc = new Scanner(System.in);
	String license = "";
	int id = 0;
	System.out.println("please write the License Plate of the vehicle of interest: ");
	license = sc.nextLine();
	
	System.out.println("please write the ID of the costumer that is interested in this vehicle: ");
	id = sc.nextInt();
	sc.nextLine();
	e.assignInterestVehicle(id, license);
	
	System.out.println("vehicle assigned!");
  }
  /**Name: infoCostumer
  *this method shows the information of a costumer.
  */
  public void infoCostumer(){ 
    Scanner sc = new Scanner(System.in);
	int id = 0;
	
	System.out.println("please write the ID of the costumer you want to see his/her information: ");
	id = sc.nextInt();
	sc.nextLine();
	System.out.println(e.infoClient(id));
	
  }
  
   /**Name: sellVehicle
  *this method sells a vehicle of the enterprise.
  */
  public void sellVehicle(){ 
  Scanner sc = new Scanner(System.in);
    String license = "";
	int idClient = 0;
	int idSeller = 0;
	
	System.out.println("please write the license plate of the vehicle that will be selled: ");
	license = sc.nextLine();
	
	System.out.println("please write the ID of the costumer that is buying the vehicle: ");
	idClient = sc.nextInt();
	sc.nextLine();
	
	System.out.println("please write the ID of the employee that is selling the vehicle: ");
	idSeller = sc.nextInt();
	sc.nextLine();
	
	e.sellVehicle(license, idClient, idSeller);
	System.out.println("vehicle selled!");
  }
  
  /**Name: catalogue
  *this method shows the catalogue of vehicles of the enterprise.
  */
  public void catalogue(){
    Scanner sc = new Scanner(System.in);	  
    int option1 = 0;
	int option2 = 0;
	
	System.out.println("please select how do you want to see the vehicles: ");
	
	System.out.println("(1)Gasoline Cars\n(2)Electric Cars\n(3)Hybrid Cars\n(4)Motorbikes\n");
	option1 = sc.nextInt();
	sc.nextLine();
	
	System.out.println("(1)Only Used\n(2)Only New\n(3)Both\n");
	option2 = sc.nextInt();
	sc.nextLine();
	
	System.out.println(e.showCatalogueVehicles(option1, option2));
	
  }
  /**Name: sendToParkingLot
  *this method sends all possible vehicles to the parking lot.
  */
  public void sendToParkingLot(){ 
  
    if(e.isFull() == false){
		
	e.moveVehiclesToTheParkingLot();
	System.out.println("vehicles were moved to the Parking Lot!");
	}else{ 
	  
	  System.out.println("Sorry, looks like the Parking Lot is full!");
	}
  }
  
  /**Name: showInfoParkingLot
  *this method shows the info of the cars in the parking lot.
  */
  public void showInfoParkingLot(){ 
    
	Scanner sc = new Scanner(System.in);
	int option = 0;
	
	System.out.println("please write the year of the model of cars you want to see the info");
	option = sc.nextInt();
	sc.nextLine();
	
	System.out.println(e.infoParking(option));
  }
  /**Name: isParkingFull
  *this method evaluates if the parking lot is full.
  */
  public void isParkingFull(){ 
    
	if(e.isFull()){ 
	  
	  System.out.println("Parking Lot is full! we'll have to buy more land...");
	}else{ 
	  
	  System.out.println("we still have space!");
	}
  }
  
   /**Name: doOperation
  *this method is the responsible for doing the operation indicated or choosed by the user.
  */
  public void doOperation(int choice){ 
    
	switch(choice){ 
	  
	  case ADD_GAS:    addGas();
	                   break;
					   
	  case ADD_ELEC:   addElec();
	                   break;

      case ADD_HYB:    addHyb();
	                   break;

   	  case ADD_MOT:    addMot();
	                   break;					   
	  
	  
      case ADD_COSTUMER: addCostumer();
	                     break;
						 
	  case ADD_SELLER:  addSeller();
	                    break;
						
      case FIRE_SELLER:  fireSeller();
	                   break;
					   
	  case INTEREST_VEHICLE: addInterestVehicle();
	                          break;
							  
	  case INFO_COSTUMER:  infoCostumer();
	                       break;
						   
	  case SELL_VEHICLE:   sellVehicle();
	                       break;
						   
	  case SHOW_VEHICLES:  catalogue();
	                       break;
						   
	  case SEND_TO_PARKINGLOT: sendToParkingLot();
	                           break;
							   
	  case SHOW_INFO_PARKINGLOT: showInfoParkingLot();
	                             break;
							   
	  case PARKINGLOT_IS_FULL: isParkingFull();
	                           break;
							   
					   
	  case EXIT:
                break;
      default:
              System.out.println("Sorry, thats not a valid option.");	  
				   
	}
  }
  /**Name: startProgram
  *this method is the responsible for running correctly the menu.
  */
  public void startProgram(){ 
    
    int option;
	
	do{ 
	  
	  showMenu();
	  option = readOption();
	  doOperation(option);
	}while(option != 15);
  }
}