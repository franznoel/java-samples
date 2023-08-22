public class SmallestIntegerFinder {
    public static void main(String[] args) {
        int[] arr = {78,56,232,12,11,43};
        System.out.println(findSmallestInt(arr));
    }

    public static int findSmallestInt(int[] args) {
      int memory = 999999999;
      for (int i = 0; i < args.length; i++) {
        if (args[i] < memory) {
          memory = args[i];
        }
      }

      return memory;
    }
}
