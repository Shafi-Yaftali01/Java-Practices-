package calculator;

public class Main {
  public static void main(String[] args) {
    int sum = Calculator.add(3,4);
    System.out.println("Sum: " + sum);

    // Invoking the function from another class
    double multiply = Calculator.multiply(5.01, 10.2);
    System.out.println("Result: " + multiply);
    
  }
}
