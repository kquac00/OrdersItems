import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item latte = new Item("latte", 5.75);
        Item cappuccino = new Item("cappuccino", 5.75);
        Item dripCoffee = new Item("drip coffee", 4.65);
        Item mocha = new Item("mocha", 5.95);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuri");
        order1.addItem(latte);
        order1.ready = true;


        Order order2 = new Order("Jimmy");
        order2.addItem(cappuccino);
        order2.addItem(mocha);
        order2.addItem(dripCoffee);
        order2.ready = true;

        Order order3 = new Order("Noah");
        order3.addItem(cappuccino);
        
        Order order4 = new Order("Sam");
        order4.addItem(latte);
        order4.addItem(latte);
        order4.total += latte.getPrice();


    
    
        // Application Simulations
        
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.printf("******************************************\n");
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        System.out.printf("******************************************\n");
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.printf("******************************************\n");
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);

    }
}
