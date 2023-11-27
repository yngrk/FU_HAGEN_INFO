package DS_1663.ADHOC.KE4.Sort;

public class Utility {
  public static void swap(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

  public static int[] divide(int[] arr, int startIndex, int endIndex) {
    int[] newArr = new int[endIndex - startIndex + 1];

    for (int i = startIndex; i <= endIndex; i++) {
      newArr[i - startIndex] = arr[i];
    }

    return newArr;
  }

  public static int findXIndex(int[] arr, int start, int end) {
    int i = start + 1;
    while (i < arr.length && arr[i - 1] == arr[i]) {
      i++;
    }

    if (i >= arr.length) {
      return -1;
    }

    if (arr[i - 1] < arr[i]) {
      return i;
    } else {
      return i - 1;
    }
  }

  public static int partition(int[] arr, int start, int end, int key) {
    int l = start;
    int r = end;

    while (l < r) {
      while (arr[l] < key) {
        l++;
      }

      while (arr[r] >= key) {
        r--;
      }

      if (l < r) {
        Utility.swap(arr, l, r);
      }
    }

    return l;
  }
}
