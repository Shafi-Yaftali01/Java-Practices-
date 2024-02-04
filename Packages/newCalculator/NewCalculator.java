package newCalculator;

public class NewCalculator {
  public static void performCalculation(int a , int b) {
    int sum = a + b;
    int minus = a - b;
    int multiply = a * b;
    double divide = (double) a /b ;  

    System.out.println("Sum: " + sum);
    System.out.println("Minus: " + minus);
    System.out.println("Multiply: " + multiply);
    System.out.println("Divide: " + divide);


  }
}
