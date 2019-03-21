import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray: pixels) {
		  for (Pixel pixelObj: rowArray) {
			  pixelObj.setGreen(0);
			  pixelObj.setRed(0);
		  }
	  }
  }
  
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray: pixels) {
		  for (Pixel pixelObj: rowArray) {
			  pixelObj.setBlue(255 - pixelObj.getBlue());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setRed(255 - pixelObj.getRed());
		  }
	  }
  }
  
  public void grayscale() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray: pixels) {
		  for (Pixel pixelObj: rowArray) {
			  int avg = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3;
			  pixelObj.setBlue(avg);
			  pixelObj.setGreen(avg);
			  pixelObj.setRed(avg);
		  }
	  }
  }
  
  public void sepia() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray: pixels) {
		  for (Pixel pixelObj: rowArray) {
			  int avg = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3;
			  pixelObj.setRed((int) (243 * avg / 255));
			  pixelObj.setGreen((int) (207 * avg / 255));
			  pixelObj.setBlue((int) (151.5 * avg / 255));
		  }
	  }
  }
  
  public void fixUnderwater() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray: pixels) {
		  for (Pixel pixelObj: rowArray) {
			  if (pixelObj.getBlue() > 170) {
				  pixelObj.setBlue((int) (pixelObj.getBlue() * 1.2));
			  }
		  }
	  }
  }
  
  public void myFilter() {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray: pixels) {
		  for (Pixel pixelObj: rowArray) {
			  ArrayList<Integer> rgbVals = new ArrayList<Integer>();
			  rgbVals.add(pixelObj.getRed());
			  rgbVals.add(pixelObj.getGreen());
			  rgbVals.add(pixelObj.getBlue());
			  int max = Collections.max(rgbVals);
			  int maxIndex = rgbVals.indexOf(max);
			  if (maxIndex == 0) {
				  pixelObj.setRed(max + 25);
				  if (rgbVals.get(1) < rgbVals.get(2)) {
					  pixelObj.setGreen(rgbVals.get(1) - 25);
				  } else {
					  pixelObj.setBlue(rgbVals.get(2) - 25);
				  }
			  } else if (maxIndex == 1) {
				  pixelObj.setGreen(max + 25);
				  if (rgbVals.get(0) < rgbVals.get(2)) {
					  pixelObj.setRed(rgbVals.get(0) - 25);
				  } else {
					  pixelObj.setBlue(rgbVals.get(2) - 25);
				  }
			  } else {
				  pixelObj.setBlue(max + 25);
				  if (rgbVals.get(1) < rgbVals.get(0)) {
					  pixelObj.setGreen(rgbVals.get(1) - 25);
				  } else {
					  pixelObj.setRed(rgbVals.get(0) - 25);
				  }
			  }
		  }
	  }
  }
  
  public void blackOutFaces() { //SCALE PICTURE BY 0.2
	  Pixel[][] pixels = this.getPixels2D();
	  for (int r = 288; r <= 357; r++) {
		  for (int c = 485; c <= 557; c++) {
			  Pixel pixelObj = pixels[r][c];
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
			  pixelObj.setBlue(0);
		  }
	  }
	  for (int r = 187; r <= 225; r++) {
		  for (int c = 297; c <= 329; c++) {
			  Pixel pixelObj = pixels[r][c];
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
			  pixelObj.setBlue(0);
		  }
	  }
	  for (int r = 420; r <= 494; r++) {
		  for (int c = 334; c <= 391; c++) {
			  Pixel pixelObj = pixels[r][c];
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
			  pixelObj.setBlue(0);
		  }
	  }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  for (int col = 0; col < pixels[0].length; col++) {
		  for (int row = 0; row < height / 2; row++) {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height - 1 - row][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  public void mirrorHorizontalBotToTop() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int height = pixels.length;
	  for (int col = 0; col < pixels[0].length; col++) {
		  for (int row = 0; row < height / 2; row++) {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[height - 1 - row][col];
			  topPixel.setColor(bottomPixel.getColor());
		  }
	  }
  }
  
  public void mirrorDiagonal() {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel topRight = null;
	  Pixel bottomLeft = null;
	  int maxDim = 0;
	  if (pixels.length > pixels[0].length) {
		  maxDim = pixels[0].length;
	  } else {
		  maxDim = pixels.length;
	  }
	  for (int row = 0; row < maxDim; row++) {
		  for (int col = 0; col < row; col++) {
			  topRight = pixels[row][col];
			  bottomLeft = pixels[col][row];
			  bottomLeft.setColor(topRight.getColor());
		  }
	  }
	  
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms() {
	  int mirrorPoint = 192;
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  for (int row = 158; row < 192; row++) {
		  for (int col = 103; col < 170; col++) {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[mirrorPoint + mirrorPoint - row][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
	  mirrorPoint = 196;
	  for (int row = 171; row < 196; row++) {
		  for (int col = 239; col < 294; col++) {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[mirrorPoint + mirrorPoint - row][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("snowman.jpg");
    //beach = beach.scale(0.2, 0.2);
    beach.explore();
    beach.mirrorArms();
    beach.explore();
    
  }
  
} // this } is the end of class Picture, put all new methods before this