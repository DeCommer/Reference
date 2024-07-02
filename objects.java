class Product {
    private String brand;
    private int price;
    private String name;

    public Product() { //to assign default values

        brand = "Some Brand";
        name = "Some name";
        price = 1300;
        System.out.println("This is a constructor");
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(brand + ": " + name + ", $" + price);
    }
}

class Account {
    String accountName;
    String password;
}

public class objects {
    

    public static void main(String[] args) {

        Product prod1 = new Product();
        // prod1.setBrand("Apple");
        // prod1.setPrice(1200);
        // prod1.setName("iPhone 16");

        // Product.setName("iPhone 16");
        // System.out.println(prod1.getBrand());

        // Product prod2 = new Product();
        // prod2.setBrand("Yeti");
        // prod2.setPrice(450);
        // prod2.setName("cooler");
        // prod1.brand = "Yeti";
        // prod1.price = 450;
        // Product.name = "cooler";

        prod1.show();
        // prod2.show();


        Account acc1 = new Account();
        acc1.accountName = "Primary";
        acc1.password = "2385$fj#*2n!"; //not a real password

    }
}
