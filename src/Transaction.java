import java.time.LocalDateTime;

public class Transaction {
    // Attributes
    private String transaction_id;
    private Customer customer;
    private Product product;
    private int product_amnt;
    private LocalDateTime date;

    // Constructor แบบไม่มี parameter
    public Transaction() {
        this.transaction_id = "";
        this.customer = new Customer();
        this.product = new Product();
        this.product_amnt = 0;
        this.date = LocalDateTime.now();
    }

    // Constructor แบบมี parameter ที่เป็น attribute ทั้งหมด
    public Transaction(String transaction_id, Customer customer, Product product, int product_amnt, LocalDateTime date) {
        this.transaction_id = transaction_id;
        this.customer = customer;
        this.product = product;
        this.product_amnt = product_amnt;
        this.date = date;
    }

    // Getter และ Setter
    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProduct_amnt() {
        return product_amnt;
    }

    public void setProduct_amnt(int product_amnt) {
        this.product_amnt = product_amnt;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    // Method สำหรับแสดงข้อมูลการทำรายการ
    public void displayTransactionInfo() {
        System.out.println("Transaction ID: " + transaction_id);
        System.out.println("Customer Information:");
        customer.displayCustomerInfo();
        System.out.println("Product Information:");
        product.displayProductInfo();
        System.out.println("Product Amount: " + product_amnt);
        System.out.println("Transaction Date: " + date);
    }

    // Method main สำหรับทดสอบการทำงาน
    public static void main(String[] args) {
        // สร้าง object ของ Customer
        Customer customer1 = new Customer("C001", "John Doe", "123 Main St, City", "123-456-7890", "johndoe", "password123");

        // สร้าง object ของ Product
        Product product1 = new Product("P001", "Laptop", 25000.0, 10);

        // สร้าง object ของ Transaction โดยใช้ constructor แบบไม่มี parameter
        Transaction transaction1 = new Transaction();
        transaction1.setTransaction_id("T001");
        transaction1.setCustomer(customer1);
        transaction1.setProduct(product1);
        transaction1.setProduct_amnt(2);
        transaction1.setDate(LocalDateTime.now());

        // สร้าง object ของ Transaction โดยใช้ constructor แบบมี parameter
        Transaction transaction2 = new Transaction("T002", customer1, product1, 3, LocalDateTime.now());

        // แสดงข้อมูลการทำรายการ
        System.out.println("Transaction 1 Information:");
        transaction1.displayTransactionInfo();

        System.out.println("\nTransaction 2 Information:");
        transaction2.displayTransactionInfo();
    }
}