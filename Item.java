public class Item {
    public String name;
    public double price;

// constructor
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }


// getters and setters
    public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice() {
        this.price = price;
    }
}