package testUniversity;

import university.*;

public class Main {
  public static void main(String[] args) {
    Student student = new Student();
    student.name = "John";
    student.studentId = 888045;
    
    Course course = new Course();
    course.courseId = 34;
    course.courseName = "Programming";


    Enrollement enrollement = new Enrollement();
    enrollement.student = student;
    enrollement.course = course;

    System.out.println("Student ID: " + enrollement.student.studentId + ", Name: " + enrollement.student.name);
    System.out.println("Course ID: " + enrollement.course.courseId + ", Name: " + enrollement.course.courseName);
    

  }
}
