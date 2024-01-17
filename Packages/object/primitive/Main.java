package object.primitive;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "Jim";
    person.lastName = "Buki";
    person.age = 20;

  }
}
/**
 * InnerPerson 
 */
 class Person {
  String name;
  String lastName; 
  int age;

  
}