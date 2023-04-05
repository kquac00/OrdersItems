import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item>items;

// constructor
public Order(String name) {
    this.name = name;
    this.total = total;
    this.ready = ready;
    this.items = new ArrayList<Item>();
}



// getters and setters
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public double getTotal(){
        return this.total;
    }
    public void setTotal(){
        this.total = total;
    }
    public boolean getIsReady(){
        return this.ready;
    }
    public void setIsReady(){
        this.ready = ready;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setItems(){
        this.items = items;
    }
    public void markAsReady() {
        ready = true;
    }
    public void addItem(Item item){
        items.add(item);
        total += item.getPrice();
    }

}