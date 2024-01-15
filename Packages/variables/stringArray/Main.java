package variables.stringArray;

public class Main {
  public static void main(String[] args) {
    String[] listFruits = {"Apple", "Pears", "Cherry"};
    // Add Favorite Fruit 
    listFruits[3] = "Watermelon";

    // show the result on the compiler 
    for (String fruit: listFruits) {
      System.out.println("Favorite: " + fruit);
      
    }



  }
}
