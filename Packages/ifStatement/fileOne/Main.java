package ifStatement.fileOne;

public class Main {
  public static void main(String[] args) {
    int age = 18;
    if (age < 5 ) {

      System.out.println("Free under age of five.");

    }
    else if (age > 5 || age < 12) {
      System.out.println("Please Pay Five Dollar first.");

    }
    else if(age > 12 || age < 18) {
      System.out.println("Please Pay Ten Dollar fist.");
    }
    else {
      System.out.println("Please Pay 15 Dollar fist."); 
      
    }
  }
}
