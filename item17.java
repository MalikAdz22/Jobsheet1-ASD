 public class item17 {
    public String name;
    public double price;
    public int stock;

    public item17() {
    }

    public item17(String itemName, double itemPrice, int itemStock) {
        name = itemName;
        price = itemPrice;
        stock = itemStock;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}
