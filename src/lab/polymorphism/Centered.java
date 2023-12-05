package lab.polymorphism;

// Centered.java
public class Centered implements TextBlock {
  // Fields
  TextBlock original;
  int width;

  // Constructors
  public Centered(TextBlock original, int width) {
    this.original = original;
    this.width = width;
  }

  // Methods
  public String row(int rownum) throws Exception {
    int padding = Math.max(0, (width - original.width()) / 2);
    return TBUtils.spaces(padding) + original.row(rownum) + TBUtils.spaces(padding);
  }

  public int width() {
    return width;
  }

  public int height() {
    return original.height();
  }
}
