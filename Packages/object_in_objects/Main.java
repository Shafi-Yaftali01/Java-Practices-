package object_in_objects;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();
    person.name = "Luka";

    Car car  = new Car();
    car.owner = person;
    car.carModel = "Supra 1997";
    
    System.out.println("Car owner name: " + car.owner + " and the Car Model: " + car.carModel);
  }
}