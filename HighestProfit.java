import java.util.Arrays;

class HighestProfit {
  public static void main(String args[]) {
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(minMax(arr));
    System.out.println(minMax2(arr)[0] + ":" + minMax2(arr)[1]);
  }

  public static int[] minMax(int[] arr) {
    int min = Arrays.stream(arr).min().getAsInt();
    int max = Arrays.stream(arr).max().getAsInt();
    int[] result = { min, max };
    return result;
  }

  public static int[] minMax2(int[] arr) {
    Arrays.sort(arr);
    int[] result = { arr[0], arr[arr.length - 1] };
    return result;
  }
}
