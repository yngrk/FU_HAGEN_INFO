package DS_1663.ADHOC.KE4.Sort;

import java.util.Arrays;
import java.util.Random;

public class Main {
  public static void main(String[] args) throws Exception {
    Random rand = new Random();
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(100);
    }

    System.out.println(Arrays.toString(arr));
    Sorting.quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}
