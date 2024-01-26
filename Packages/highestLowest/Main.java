package highestLowest;

public class Main {
  public static void main(String[] args) {
    int[] grades = {85, 93, 90, 75, 60};
    int highestGrade = grades[0];
    int lowestGrade = grades[0];

    for(int grade: grades) {
      if (grade > highestGrade) {
        highestGrade = grade;
      }
     if (grade < lowestGrade) {
        lowestGrade = grade;
      }
 

    }
    System.out.println("Highest grade " + highestGrade);
    System.out.println("Lowest grade: " + lowestGrade);
  }

}
