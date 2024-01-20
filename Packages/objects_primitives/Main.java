package objects_primitives;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "Alex";
    person.age = 22;

    System.out.println("My name is: " + person.name + ", i'm " + person.age);

  }

}
