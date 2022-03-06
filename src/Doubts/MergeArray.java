package Doubts;

import java.util.Arrays;

public class MergeArray {

  public static int[] mergeArray(int[] arr1, int[] arr2) {
    int n1 = arr1.length;
    int n2 = arr2.length;
    int[] arr3 = new int[n1+n2];
    for (int i=0; i<n1; i++) {
      arr3[i] = arr1[i];
    }
    for (int i=0; i<n2; i++) {
      arr3[n1+i] = arr2[i];
    }
    Arrays.sort(arr3);
    return arr3;
  }

  public static void main(String[] args) {
    int[] arr1 = {2,4,9,5,1};
    int[] arr2 = {6,3,7,8,0};
    mergeArray(arr1,arr2);
  }
}
