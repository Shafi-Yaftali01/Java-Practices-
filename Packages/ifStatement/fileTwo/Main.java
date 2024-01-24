package ifStatement.fileTwo;

public class Main {
 public static void main(String[] args) {
  char grade = 'A';
  String comment;

  switch (grade) {
    case 'A':
      comment = "Excellent";
      break;
    case 'B':
    comment = "Good job!";
    break;

    case 'C':
    comment = "Good!";
    break;
    case 'D':
    comment = "Not Bad";
    break;
    case 'F':
    comment = "Try Harder";
    break; 

    default:
    comment = "Invalid grade";
  }
  System.out.println("Comment: " + comment);
 }
}
