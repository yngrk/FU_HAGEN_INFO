package DS_1663.ADHOC.KE4.Sort;

public class Sorting {
  public static int[] bubbleSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      for (int j = arr.length - 1; j >= i; j--) {
        if (arr[j] < arr[j - 1]) {
          Utility.swap(arr, j, j - 1);
        }
      }
    }
    return arr;
  }

  public static int[] mergeSort(int[] arr) throws Exception {
    if (arr.length <= 1) {
      return arr;
    }

    // Divide
    int[] arr1 = mergeSort(Utility.divide(arr, 0, (int) Math.floor(arr.length / 2) - 1));
    int[] arr2 = mergeSort(Utility.divide(arr, (int) Math.floor(arr.length / 2), arr.length - 1));

    // Merge
    int[] merged = new int[arr.length];
    int k = 0;
    int i = 0;
    int j = 0;
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        merged[k] = arr1[i];
        i++;
        k++;
      } else {
        merged[k] = arr2[j];
        j++;
        k++;
      }
    }

    if (i < arr1.length) {
      for (int m = i; m < arr1.length; m++) {
        merged[k] = arr1[m];
        k++;
      }
    } else if (j < arr2.length) {
      for (int n = j; n < arr2.length; n++) {
        merged[k] = arr2[n];
        k++;
      }
    }

    return merged;
  }

  public static void quickSort(int[] arr, int start, int end) {
    if (start < end) {
      int xIndex = Utility.findXIndex(arr, start, end);
      if (xIndex != -1) {
        int k = Utility.partition(arr, start, end, arr[xIndex]);

        quickSort(arr, start, k - 1);
        quickSort(arr, k, end);
      }
    }
  }
}
