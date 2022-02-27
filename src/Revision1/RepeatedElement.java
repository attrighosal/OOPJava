package Revision1;

public class RepeatedElement {

  public static int findRepeatedElement(int[] array, int n) {
    for (int i=0; i<=n; i++) {
      int index = Math.abs(array[i]);
      array[index] *= -1;
    }
    for (int i=1; i<=n; i++) {
      if(array[i]>0) {
        return i;
      }
    }
    return n;
  }
}
