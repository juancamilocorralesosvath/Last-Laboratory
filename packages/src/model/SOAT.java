package model;
/** 
  *This class administrates the information of the SOAT document of the vehicles of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */
public class SOAT extends Document {//

	private int accidentSecure;
	
	/**Name: SOAT
	 * Constructor method of the class.
	 * @param price. the price of the document
	 * @param year. the year of expedition.
	 * @param accidentSecure. the amount of money secured by the document.
	 */
	public SOAT(int price, int year, int accidentSecure) {
		super(price, year);
		this.accidentSecure = accidentSecure;
	}
	/**Name: getAccidentSecure
      * getter method of the attribute accidentSecure.
	  @return accidentSecure.  the amount of money secured by the document.
	 */

	public int getAccidentSecure() {
		return this.accidentSecure;
	}

	/**Name: setAccidentSecure
      * setter method of the attribute accidentSecure.
	  @param accidentSecure.  the amount of money secured by the document.
	 */
	public void setAccidentSecure(int accidentSecure) {
		this.accidentSecure = accidentSecure;
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
	    
		info += matrix[i][0]+" ";
	  }
	  for(int i=1; i<matrix.length; i++){ 
	    
		info += matrix[matrix.length-1][i]+" ";
	  }
	  return info;
	}

	

}