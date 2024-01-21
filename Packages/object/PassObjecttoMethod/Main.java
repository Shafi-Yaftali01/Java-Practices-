package object.PassObjecttoMethod;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "Shafi";
    person.age = 17;

    System.out.println("Before: " + person.name + ", and " + person.age);
    modifyPerson(person);
    System.out.println("After:" + person.name + ", and " + person.age);
    
    // Explanation:
    // We can see that the values of the Person object changed after modifying them in the modifyPerson method. This is because Java uses pass-by-value for objects as well, but the value being passed is the reference to the object, not the object itself. Thus, any changes made to the object's fields within the method will persist outside the method.

  }

  public static void modifyPerson(Person person) {
    person.name = "Buck";
    person.age = 18;

  }
}

