package whileLoop;

public class Main {
  public static void main(String[] args) {
    int numbers = 5;
    int counter = 0;
    int index = 0;
    while (counter < numbers) {
      if (index % 2 == 0) {
        System.out.println("Even: " + index);
        counter++;
      }
      index++;
    }
  }
}
