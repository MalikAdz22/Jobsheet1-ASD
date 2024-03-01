public class CanteenDemo17 {
    public static void main(String[] args) {
        item17 item1 = new item17();
        item1.name = "Bakso";
        item1.price = 20000;
        item1.stock = 10;

        item17 item2 = new item17();
        item2.name = "Mie ayam";
        item2.price = 5000;
        item2.stock = 20;

        item17 item3 = new item17();
        item3.name = "Es teh";
        item3.price = 3000;
        item3.stock = 15;

        System.out.println("Item 1:");
        item1.displayInfo();

        System.out.println("Item 2:");
        item2.displayInfo();

        System.out.println("Item 3:");
        item3.displayInfo();
    }
}
