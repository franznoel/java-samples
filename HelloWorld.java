class HelloWorld {
    public static void main(String[] args) {
        String hello = new String("Hello AWS Cloud");

        String[] arrOfStr = hello.split(" ");

        for (String a : arrOfStr) {
          String reversedString = new StringBuffer(a).reverse().toString();
          System.out.print(reversedString);
          System.out.print(" ");
        }
    }
}
