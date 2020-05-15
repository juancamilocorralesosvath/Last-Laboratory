package model;

/** 
  *This class administrates the information of the Revision document of the vehicles of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */

public class Revision extends Document {//

	private int gasEmission;
	
	
	/**Name: Revision
	 * Constructor method of the class.
	 * @param price. the price of the document
	 * @param year. the year of expedition.
	 * @param gasEmission. the amount of gasses the vehicle emited.
	 */
	public Revision(int price, int year, int gasEmission) {
		super(price, year);
		this.gasEmission = gasEmission;
	}
	/**Name: getGasEmission
      * getter method of the attribute gasEmission.
	  @return gasEmission. the amount of gasses the vehicle emited. 
	 */
	public int getGasEmission() {
		return this.gasEmission;
	}

	/**Name: setGasEmission
      * setter method of the attribute gasEmission.
	  @param gasEmission. the amount of gasses the vehicle emited. 
	 */
	public void setGasEmission(int gasEmission) {
		this.gasEmission = gasEmission;
	}
	/**Name: decode
      * this method returns a String with the code of the image decoded.
	  @return info. the decoded code of the image. 
	 */
	@Override
	public String decode(){
		
	  String info = "";
	  int[][] matrix = getImage();
	  
	  for(int i=0; i<matrix.length; i++){
		   
		info += matrix[0][i]+" ";  
	  }
	  for(int i=1; i<matrix.length; i++){ 
	    
		info += matrix[i][matrix.length-1-i]+" ";
	  }
	  for(int i=1; i<matrix.length; i++){ 
	    
		info += matrix[matrix.length-1][i]+" ";
	  }
	  return info;
	}


}