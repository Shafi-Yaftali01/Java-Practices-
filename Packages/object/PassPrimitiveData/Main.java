package object.PassPrimitiveData;

public class Main {
  public static void main(String[] args) {
    int number = 5;
    System.out.println("Before: " + number);
    int newNumber = number;
    modifyNumber(newNumber);
    System.out.println("After: " + newNumber);
    // We can observe that the value of number did not change even after modifying it in the modifyNumber method. This is because Java uses pass-by-value, and the value of the primitive gets copied.
  }
  public static void modifyNumber(int num) {
    num *= num;
  }
}
