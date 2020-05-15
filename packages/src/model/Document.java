package model;
/** 
  *This class administrates the information of the documents of the vehicles of the Enterprise.
  @autor Juan Camilo Corrales Osvath
  */
public abstract class Document {

	private int price;
	private int year;
	private int[][] image;

	/**Name: Document
	 * Constructor method of the class. The matrix of the image is initialized in a default value.
	 * @param price. the price of the document.
	 * @param year. the year of expedition of the document.
	 */
	public Document(int price, int year) {
		this.price = price;
		this.year = year;
		int[][] image = {{1, 2, 3, 4, 5, 6, 7}, {10, 11, 12, 13, 14, 15, 16}, {20, 21, 22, 23, 24, 25, 26}, {40, 41, 42, 43, 44, 45, 46}, {70, 71, 72, 73, 74, 75, 76}, {50, 51, 52, 53, 54, 55, 56}, {80, 81, 82, 83, 84, 85, 86}};
	}
	/**Name: getPrice
	 * getter method for the attribute price.
	 *@return price. attribute price.
	 */
	public int getPrice() {
		return this.price;
	}

	/**Name: setPrice
	 * setter method for the attribute price.
	 * @param price. attribute price. 
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**Name: getYear
	 * getter method for the attribute year.
	 *@return year. attribute year.
	 */

	public int getYear() {
		return this.year;
	}

	/**Name: setYear
	 * setter method for the attribute year.
	 * @param year. attribute year. 
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**Name: getImage
	 * getter method for the attribute image. which is a matrix.
	 *@return image. attribute image.
	 */

	public int[][] getImage() {
		return this.image;
	}

	/**Name: setImage
	 * setter method for the attribute image. which is a matrix.
	 * @param image. attribute image. 
	 */
	public void setImage(int[][] image) {
		this.image = image;
	}
	
    /**Name: decode
	 * abstract method for decoding the image.
	 */
	public abstract String decode();

}