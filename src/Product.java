public class Product {
    // Attributes
    private String product_id;
    private String product_name;
    private double product_price;
    private int product_stockamnt;

    // Constructor แบบไม่มี parameter
    public Product() {
        this.product_id = "";
        this.product_name = "";
        this.product_price = 0.0;
        this.product_stockamnt = 0;
    }

    // Constructor แบบมี parameter ที่เป็น attribute ทั้งหมด
    public Product(String product_id, String product_name, double product_price, int product_stockamnt) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_stockamnt = product_stockamnt;
    }

    // Getter และ Setter
    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getProduct_stockamnt() {
        return product_stockamnt;
    }

    public void setProduct_stockamnt(int product_stockamnt) {
        this.product_stockamnt = product_stockamnt;
    }

    // Method สำหรับแสดงข้อมูลสินค้า
    public void displayProductInfo() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Price: " + product_price);
        System.out.println("Product Stock Amount: " + product_stockamnt);
    }

    // Method main สำหรับทดสอบการทำงาน
    public static void main(String[] args) {
        // สร้าง object ของ Product โดยใช้ constructor แบบไม่มี parameter
        Product product1 = new Product();
        product1.setProduct_id("P001");
        product1.setProduct_name("Laptop");
        product1.setProduct_price(25000.0);
        product1.setProduct_stockamnt(10);

        // สร้าง object ของ Product โดยใช้ constructor แบบมี parameter
        Product product2 = new Product("P002", "Smartphone", 15000.0, 20);

        // แสดงข้อมูลสินค้า
        System.out.println("Product 1 Information:");
        product1.displayProductInfo();

        System.out.println("\nProduct 2 Information:");
        product2.displayProductInfo();
    }
}