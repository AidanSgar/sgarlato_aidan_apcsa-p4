package unit16;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height the height of the desired picture
	 * @param width  the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/** Mirror just part of a picture of a temple */
	public int mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
				count++;
			}
		}
		return count;
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic  the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("/home/aidansgarlato/Programing/APCSA/flower1.jpg");
		Picture flower2 = new Picture("/home/aidansgarlato/Programing/APCSA/flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel botPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		Color botColor = null;
		for (int row = 1; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				botPixel = pixels[row-1][col];
				botColor = botPixel.getColor();
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist || leftPixel.colorDistance(botColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}
	}

	public void keepOnlyBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
				pixelObj.setGreen(0);
			}
		}
	}

	public void negate() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setRed(255 - pixelObj.getRed());
				pixelObj.setGreen(255 - pixelObj.getGreen());
			}
		}
	}

	public void greyscale() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int avrg = (pixelObj.getBlue() + pixelObj.getGreen() + pixelObj.getRed()) / 3;
				pixelObj.setBlue(avrg);
				pixelObj.setRed(avrg);
				pixelObj.setGreen(avrg);
			}
		}
	}

	public void underwater() {
		int n = 5;
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if (pixelObj.getBlue() < 180 && pixelObj.getBlue() > 170) {
					pixelObj.setBlue(pixelObj.getBlue() + n);
					// pixelObj.setRed(pixelObj.getRed()-n);
					// pixelObj.setGreen(pixelObj.getGreen()-n);
				} else {
					pixelObj.setBlue(pixelObj.getBlue() - n);
					pixelObj.setRed(pixelObj.getRed() - n);
					pixelObj.setGreen(pixelObj.getGreen() - n);
				}
			}
		}
	}

	public void mirrorVerticalRightToLeft() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][width - 1 - col];
				rightPixel = pixels[row][col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorHorozantal() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int hieght = pixels.length;
		for (int row = 0; row < hieght; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				topPixel = pixels[hieght - 1 - row][col];
				botPixel = pixels[row][col];
				topPixel.setColor(botPixel.getColor());
			}
		}
	}

	public void mirrorHorozantalBotToTop() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int hieght = pixels.length;
		for (int row = 0; row < hieght; row++) {
			for (int col = 0; col < pixels[0].length; col++) {
				topPixel = pixels[hieght - 1 - row][col];
				botPixel = pixels[row][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorArms() {
		int range = 30;
		int div = 110;
		Pixel[][] pixels = this.getPixels2D();
		Pixel topPixel = null;
		Pixel botPixel = null;
		int hieght = pixels.length;
		System.out.println(hieght);
		for (int col = 0; col < pixels[0].length; col++) {
			for (int row = 0; row < range; row++) {
				topPixel = pixels[hieght - div - row][col];
				botPixel = pixels[hieght - div + row][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}

	public void mirrorGull() {
		int range = 150;
		int div = 300;
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < range; col++) {
				leftPixel = pixels[row][width - col - div];
				rightPixel = pixels[row][width + col - div];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void copy2(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < endRow
				&& toRow < endRow; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < endCol
					&& toCol < endCol; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}
	
	public void collage(Picture pic1, Picture pic2) {
		Pixel[][] pixels = this.getPixels2D();
		copy2(pic1, pixels.length/5, 2*pixels.length/5, 2*pixels[0].length/5, 3*pixels[0].length/5);
		mirrorVertical();
		copy2(pic2, 2*pixels.length/5, 3*pixels.length/5, pixels[0].length/5, 2*pixels[0].length/5);
		mirrorHorozantalBotToTop();
	}
	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		/*
		 * Picture beach = new
		 * Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg"); beach.explore();
		 * beach.zeroBlue(); beach.explore();
		 */
	}

} // this } is the end of class Picture, put all new methods before this
