package staticModifier;

public class Main {
  public static void main(String[] args) {
    Counter.increment();
    System.out.println("Count: " + Counter.count);
  }
}
