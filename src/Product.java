public class Product {
    private String itemno;
    private  String name;
    private  double price;

    public Product(String itemno, String name, double price) {
        this.itemno = itemno;
        this.name = name;
        this.price = price;
    }

    public String getItemno() {
        return itemno;
    }

    public void setItemno(String itemno) {
        this.itemno = itemno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
