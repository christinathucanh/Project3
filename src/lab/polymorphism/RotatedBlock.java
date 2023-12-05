package lab.polymorphism;
//This class rotates the block
// RotatedBlock.java
public class RotatedBlock implements TextBlock {
  // Fields
  TextBlock original;

  // Constructors
  public RotatedBlock(TextBlock original) {
    this.original = original;
  }

  // Methods
  public String row(int rownum) throws Exception {
    StringBuilder rotatedRow = new StringBuilder();
    for (int i = 0; i < original.height(); i++) {
      rotatedRow.append(original.row(i).charAt(rownum));
    }
    return rotatedRow.toString();
  }

  public int width() {
    return original.height();
  }

  public int height() {
    return original.width();
  }
}

