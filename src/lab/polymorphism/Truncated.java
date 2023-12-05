package lab.polymorphism;

// Truncated.java
public class Truncated implements TextBlock {
  // Fields
  TextBlock original;
  int maxWidth;

  // Constructors
  public Truncated(TextBlock original, int maxWidth) {
    this.original = original;
    this.maxWidth = maxWidth;
  }

  // Methods
  public String row(int rownum) throws Exception {
    return original.row(rownum).substring(0, Math.min(original.width(), maxWidth));
  }

  public int width() {
    return Math.min(original.width(), maxWidth);
  }

  public int height() {
    return original.height();
  }
}

