package lab.polymorphism;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.3 of September 2019
 */
public class TBExpt {
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) throws Exception {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    // Create a block to use
    TextBlock block = new TextLine("Hello");

    // Print out the block
    TBUtils.print(pen, block);
    //EXERCISE 3
    TextBlock boxedLine = new BoxedBlock(new TextLine("Hello, Boxed!"));
    TBUtils.print(pen, boxedLine);

    TextBlock doubleBoxedLine = new BoxedBlock(boxedLine);
    TBUtils.print(pen, doubleBoxedLine);

    TextBlock boxedEmptyLine = new BoxedBlock(new TextLine(""));
    TBUtils.print(pen, boxedEmptyLine);
    //END OF EXERCISE 3

    //EXERCISE 4
    // a. Using VCompose, TextLine, and BoxedBlock
    TextBlock hello = new TextLine("Hello");
    TextBlock goodbye = new TextLine("Goodbye");
    TextBlock composedBlockA = new BoxedBlock(new VComposition(hello, goodbye));
    TBUtils.print(pen, composedBlockA);

    // b. Using VCompose, TextLine, and BoxedBlock
    //TextBlock composedBlockB = new BoxedBlock(new VComposition(hello, goodbye), new TextLine(""));
    //TBUtils.print(pen, composedBlockB);

    // c. Using HCompose, TextLine, and BoxedBlock
    TextBlock composedBlockC = new BoxedBlock(new HComposition(hello, goodbye));
    TBUtils.print(pen, composedBlockC);

    // d. Using HCompose, TextLine, and BoxedBlock
    TextBlock composedBlockD = new BoxedBlock(new HComposition(goodbye, hello));
    TBUtils.print(pen, composedBlockD);
    //END OF EXERCISE 4
    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
