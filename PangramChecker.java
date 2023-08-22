public class PangramChecker {
  public static void main(String[] args) {
    PangramChecker pc = new PangramChecker();
    System.out.println(pc.check("The quick brown fox jumps over the lazy dog."));
  }

  public boolean check(String sentence) {
    boolean isPangram = false;
    for (char c = 'a'; c <= 'z'; c++) {
      if (!sentence.toLowerCase().contains("" + c)) {
        isPangram = false;
      } else {
        isPangram = true;
      }
    }
    return isPangram;
  }
}
