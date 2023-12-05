package lab.polymorphism;
// This class right justifies the text box.
// RightJustified.java
public class RightJustified implements TextBlock {
  // Fields
  TextBlock original;
  int width;

  // Constructors
  public RightJustified(TextBlock original, int width) {
    this.original = original;
    this.width = width;
  }

  // Methods
  public String row(int rownum) throws Exception {
    int padding = Math.max(0, width - original.width());
    return TBUtils.spaces(padding) + original.row(rownum);
  }

  public int width() {
    return width;
  }

  public int height() {
    return original.height();
  }
}

