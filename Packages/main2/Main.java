package Packages.main2;

import Packages.inventory.*;




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
    
  }
}
