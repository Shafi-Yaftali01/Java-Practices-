package object.primitive.owner;

public class Main {
  public static void main(String[] args) {
    Person first_person = new Person();
    first_person.personName = "Alex";

    Car first_car = new Car();
    first_car.carModel = "2024";
    first_car.person = first_person;

    System.out.println("Owner Name: " + first_car.person.personName + ", Car Model: " + first_car.carModel);

  }
}
