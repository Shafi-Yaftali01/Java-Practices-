package stringMethod;

public class Main {
  public static void main(String[] args) {
    String string = "Hello World";
    System.out.println("Length: " + string.length());
    System.out.println("Uppercase: " + string.toUpperCase());
    System.out.println("Lowercase: " + string.toLowerCase());
    System.out.println("Substring:" + string.substring(2, 7));
    System.out.println("Replace" + string.replace("Hello", "Hey"));
  }
}
