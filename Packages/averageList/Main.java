package averageList;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {4, 2, 3, 4, 5};
    int sum = 0;
    int count = 0;
    for (int number: numbers) {
      if (number % 2 != 0) {
        sum += number;
        count++;
      }
    }
    double average = (double) sum / count;
    System.out.println("Average of odd numbers: " + average);
  }
}
