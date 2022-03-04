package Doubts;

public class ReverseArray {

  public static int[] reverseArray(int[] array) {
    int i=0, j=array.length-1;
    while (i<j) {
      int temp = array[i];
      array[i]=array[j];
      array[j]=temp;
      i++;
      j--;
    }
    return array;
  }

  public static void main(String[] args) {
    int[] array = {2,4,3,1};
    reverseArray(array);
  }
}
