package OOP_1618.ADHOC.KE2;

import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) Math.floor(Math.random() * 100);
    }

    Arrays.sort(arr);

    System.out.println(Arrays.toString(arr));
  }
}
