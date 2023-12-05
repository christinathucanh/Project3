package lab.polymorphism;
// This class vertically flipped the blocks.
// VerticallyFlipped.java
public class VerticallyFlipped implements TextBlock {
  // Fields
  TextBlock original;

  // Constructors
  public VerticallyFlipped(TextBlock original) {
    this.original = original;
  }

  // Methods
  public String row(int rownum) throws Exception {
    return original.row(original.height() - rownum - 1);
  }

  public int width() {
    return original.width();
  }

  public int height() {
    return original.height();
  }
}
