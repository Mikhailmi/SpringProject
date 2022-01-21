package Shop;

public class Product {

 private int id;
 private String name;
 private int cost;

    public Product (int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    public int getId() { return id; }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("Product {id = %-2s | name = %-15s | cost = %-8s}", id, name, cost);
    }

}
