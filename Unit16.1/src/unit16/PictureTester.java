package unit16;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/home/aidansgarlato/Programing/APCSA/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/home/aidansgarlato/Programing/APCSA/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    System.out.println(temple.mirrorTemple());
    temple.explore();
  }
  
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/home/aidansgarlato/Programing/APCSA/swan.jpg");
    swan.edgeDetection(200);
    swan.explore();
  }
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
	    beach.explore();
	    beach.keepOnlyBlue();
	    beach.explore();
  }
  public static void testNegate() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  public static void testGreyscale() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
	    beach.explore();
	    beach.greyscale();
	    beach.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/water.jpg");
	    beach.explore();
	    beach.underwater();
	    beach.explore();
  }
  
  public static void testMirrorVerticalRightToLeft() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
	    beach.explore();
	    beach.mirrorVerticalRightToLeft();
	    beach.explore();
  }
  
  public static void testMirrorHorozantal() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
	    beach.explore();
	    beach.mirrorHorozantal();
	    beach.explore();
  }
  
  public static void testMirrorHorozantalBotToTop() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
	    beach.explore();
	    beach.mirrorHorozantalBotToTop();
	    beach.explore();
  }
  
  public static void testMirrorArms() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/snowman.jpg");
	    beach.explore();
	    beach.mirrorArms();
	    beach.explore();
  }
  public static void testMirrorGull() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/seagull.jpg");
	    beach.explore();
	    beach.mirrorGull();
	    beach.explore();
  }
  public static void testCopy() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/seagull.jpg");
	    beach.explore();
	    beach.copy2(new Picture("/home/aidansgarlato/Programing/APCSA/moon-surface.jpg"),100,100,200, 200 );
	    beach.explore();
  }
  public static void testCollage() {
	  Picture beach = new Picture("/home/aidansgarlato/Programing/APCSA/beach.jpg");
	    beach.explore();
	    beach.collage(new Picture("/home/aidansgarlato/Programing/APCSA/moon-surface.jpg"), new Picture("/home/aidansgarlato/Programing/APCSA/wall.jpg"));
	    beach.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGreyscale();
    //testFixUnderwater();
	//testMirrorVerticalRightToLeft();
    //testMirrorVertical();
	//testMirrorHorozantal();
	//testMirrorHorozantalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}