// TBTests.java 
package lab.polymorphism;
// Tests for the whole program, including edge cases.
import java.io.PrintWriter;

public class TBTests {
  public static void main(String[] args) {
    // Test Exercise 2
    testHorizontallyFlipped();
    testVerticallyFlipped();

    // Test Exercise 3
    testRotatedBlock();

    // Test Exercise 4
    testEqualityMethods();

     // Test Exercise 1
     //testSquareRoots();

     // Test Exercise 2
     testHorizontallyFlipped();
     testVerticallyFlipped();
 
     // Test Exercise 3
     testRotatedBlock();
 
     // Test Exercise 4
     testEqualityMethods();
 
     // Test Exercise 7
     //testTextBlockParameters();
 
     // Test Exercise 8
     testTruncated();
     testCentered();
     testHorizontallyFlippedEmptyBlock();
     testVerticallyFlippedEmptyBlock();
  }

  // Test Exercise 2
  private static void testHorizontallyFlipped() {
    TextBlock original = new TextLine("Hello");
    TextBlock flipped = new HorizontallyFlipped(original);

    TBUtils.print(new PrintWriter(System.out, true), original);
    System.out.println("---");
    TBUtils.print(new PrintWriter(System.out, true), flipped);
  }

  private static void testVerticallyFlipped() {
    TextBlock original = new TextLine("Hello");
    TextBlock flipped = new VerticallyFlipped(original);

    TBUtils.print(new PrintWriter(System.out, true), original);
    System.out.println("---");
    TBUtils.print(new PrintWriter(System.out, true), flipped);
  }

  // Test Exercise 3
  private static void testRotatedBlock() {
    TextBlock original = new TextLine("Hello");
    TextBlock rotated = new RotatedBlock(original);

    TBUtils.print(new PrintWriter(System.out, true), original);
    System.out.println("---");
    TBUtils.print(new PrintWriter(System.out, true), rotated);
  }

  // Test Exercise 4
  private static void testEqualityMethods() {
    TextBlock line1 = new TextLine("Hello");
    TextBlock line2 = new TextLine("Hello");
    TextBlock line3 = new TextLine("Goodbye");

    System.out.println("Equal: " + TBUtils.equal(line1, line2));  // true
    System.out.println("Equal: " + TBUtils.equal(line1, line3));  // false

    System.out.println("Equiv: " + TBUtils.eqv(line1, line2));   // true
    System.out.println("Equiv: " + TBUtils.eqv(line1, line3));   // false

    System.out.println("Eq: " + TBUtils.eq(line1, line2));       // false (different memory locations)
    System.out.println("Eq: " + TBUtils.eq(line1, line1));       // true (same memory location)
  }

  private static void printBlock(String label, TextBlock block) {
    System.out.println(label);
    TBUtils.print(new PrintWriter(System.out, true), block);
    System.out.println("---");
  }

  private static void testTruncated() {
    TextBlock line = new TextLine("Hello");
    TextBlock truncatedBlock = new Truncated(line, 0);
    printBlock("Original Line:", line);
    printBlock("Truncated Block (width 0):", truncatedBlock);


    TextBlock truncatedBlock2 = new Truncated(line, line.width() + 1);
    printBlock("Truncated Block (width > original width):", truncatedBlock2);
  }

  private static void testCentered() {
    TextBlock line = new TextLine("Hello");
    TextBlock centeredBlock = new Centered(line, 0);
    printBlock("Original Line:", line);
    printBlock("Centered Block (width 0):", centeredBlock);

    TextBlock centeredBlock2 = new Centered(line, line.width() + 1);
    printBlock("Centered Block (width > original width):", centeredBlock2);
  }
  

  private static void testHorizontallyFlippedEmptyBlock() {
    TextBlock emptyBlock = new TextLine("");
    TextBlock hFlippedEmptyBlock = new HorizontallyFlipped(emptyBlock);
    printBlock("Empty Block:", emptyBlock);
    printBlock("Horizontally Flipped Empty Block:", hFlippedEmptyBlock);
  }

  private static void testVerticallyFlippedEmptyBlock() {
    TextBlock emptyBlock = new TextLine("");
    TextBlock vFlippedEmptyBlock = new VerticallyFlipped(emptyBlock);
    printBlock("Empty Block:", emptyBlock);
    printBlock("Vertically Flipped Empty Block:", vFlippedEmptyBlock);
  }


}

