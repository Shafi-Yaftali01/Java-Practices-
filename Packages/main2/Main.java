package main2;

import inventory.*;




public class Main {
  public static void main(String[] args) {
    Product product = new Product();
    product.productName = "MagicBottle";
    product.productId = 420;
    product.price = 25.95;


    Inventory inventory = new Inventory();
    inventory.product = product;
    inventory.quantity = 25000;

    Warehouse warehouse = new Warehouse();
    warehouse.inventories = "PlaceHolder for now ";
    warehouse.whareHouseId = 222;
    warehouse.whareHouseName = "Future Planet";

    System.out.println("Product ID: " + inventory.product.productId + ", Name: " + inventory.product.productName + ", Price: " + inventory.product.price);
    System.out.println("Inventory Quantity: " + inventory.quantity);
    System.out.println("Warhouse ID: " +  warehouse.whareHouseId + ", Name: " + warehouse.whareHouseName);
  }
}
