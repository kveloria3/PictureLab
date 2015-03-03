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
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testMyCollage()
  {
   Picture a = new Picture("beach.jpg");
   Picture b = new Picture("butterfly1.jpg");
   Picture c = new Picture("arch.jpg");
   c.myCollage(a, c, b);
   c.explore();
  }
  
  public static void testCopy()
  {
    Picture p = new Picture("blue-mark.jpg");
    Picture k = new Picture("beach.jpg");
    p.explore();
    p.copy(k, 0, 25, 50, 50, 70, 90);
    p.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture p = new Picture("snowman.jpg");
    p.explore();
    p.mirrorArms();
    p.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture p = new Picture("seagull.jpg");
    p.explore();
    p.mirrorGull();
    p.explore();
  }
  
  public static void testSeeFish()
  {
    Picture p = new Picture("water.jpg");
    p.explore();
    p.seeFish();
    p.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate()
  {
    Picture p = new Picture("pic Halloween.jpg");
    p.explore();
    p.negate();
    p.explore();
  }
  

  
  public static void testGrayscale()
  {
    Picture k = new Picture("pic Halloween.jpg");
    k.explore();
    k.grayscale();
    k.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture p = new Picture("pic Halloween.jpg");
    p.mirrorVerticalRightToLeft();
    p.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture p = new Picture("pic Halloween.jpg");
    p.mirrorHorizontal();
    p.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture p = new Picture("pic Halloween.jpg");
    p.mirrorHorizontalBotToTop();
    p.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testMirrorVerticalRightToLeft();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    //testSeeFish();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    //testMirrorGull();
    //testCopy();
    testMyCollage();
  }
}
