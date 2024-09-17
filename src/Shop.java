import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    // Attributes
    private String shopname;
    private String ownername;
    private String shopphone;
    private List<Product> products;
    private List<Customer> customers;
    private List<Transaction> transactions;

    // Constructor แบบไม่มี parameter
    public Shop() {
        this.shopname = "";
        this.ownername = "";
        this.shopphone = "";
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Constructor แบบมี parameter ที่เป็นชื่อร้าน
    public Shop(String shopname) {
        this.shopname = shopname;
        this.ownername = "";
        this.shopphone = "";
        this.products = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    // Getter และ Setter
    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public String getShopphone() {
        return shopphone;
    }

    public void setShopphone(String shopphone) {
        this.shopphone = shopphone;
    }

    // Method สำหรับเพิ่มสินค้าเข้าไปในโกดัง
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method สำหรับเพิ่มลูกค้าเป็นสมาชิกของร้านค้า
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // Method สำหรับการขายสินค้าให้แก่ลูกค้า
    public void buy(Customer customer, Product product, int amount) {
        if (product.getProduct_stockamnt() >= amount) {
            product.setProduct_stockamnt(product.getProduct_stockamnt() - amount);
            Transaction transaction = new Transaction(
                    "T" + (transactions.size() + 1),
                    customer,
                    product,
                    amount,
                    LocalDateTime.now()
            );
            transactions.add(transaction);
            System.out.println("Transaction successful!");
        } else {
            System.out.println("Not enough stock available!");
        }
    }

    // Method สำหรับแสดงรายละเอียดการขายสินค้าทั้งหมด
    public void showTransaction() {
        for (Transaction transaction : transactions) {
            transaction.displayTransactionInfo();
            System.out.println("-----------------------------");
        }
    }

    // Method main สำหรับจำลองการทำงานของร้านค้า
    public static void main(String[] args) {
        // สร้าง object ของ Shop
        Shop shop = new Shop("Tech Shop");
        shop.setOwnername("John Doe");
        shop.setShopphone("123-456-7890");

        // สร้าง object ของ Customer
        Customer customer1 = new Customer("C001", "Alice Smith", "456 Elm St, Town", "987-654-3210", "alicesmith", "pass456");
        shop.addCustomer(customer1);

        // สร้าง object ของ Product
        Product product1 = new Product("P001", "Laptop", 25000.0, 10);
        Product product2 = new Product("P002", "Smartphone", 15000.0, 20);
        shop.addProduct(product1);
        shop.addProduct(product2);

        // ลูกค้าซื้อสินค้า
        shop.buy(customer1, product1, 2);
        shop.buy(customer1, product2, 3);

        // แสดงรายละเอียดการขายสินค้าทั้งหมด
        shop.showTransaction();
    }
}