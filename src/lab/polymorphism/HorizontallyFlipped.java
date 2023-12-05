package lab.polymorphism;

// HorizontallyFlipped.java
public class HorizontallyFlipped implements TextBlock {
  // Fields
  TextBlock original;

  // Constructors
  public HorizontallyFlipped(TextBlock original) {
    this.original = original;
  }

  // Methods
  public String row(int rownum) throws Exception {
    return new StringBuilder(original.row(rownum)).reverse().toString();
  }

  public int width() {
    return original.width();
  }

  public int height() {
    return original.height();
  }
}

