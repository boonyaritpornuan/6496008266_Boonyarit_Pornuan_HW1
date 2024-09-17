public class Customer {
    // Attributes
    private String customer_id;
    private String customer_fullname;
    private String customer_address;
    private String customer_phone;
    private String customer_loginname;
    private String customer_password;

    // Constructor แบบไม่มี parameter
    public Customer() {
        this.customer_id = "";
        this.customer_fullname = "";
        this.customer_address = "";
        this.customer_phone = "";
        this.customer_loginname = "";
        this.customer_password = "";
    }

    // Constructor แบบมี parameter ที่เป็น attribute ทั้งหมด
    public Customer(String customer_id, String customer_fullname, String customer_address, String customer_phone, String customer_loginname, String customer_password) {
        this.customer_id = customer_id;
        this.customer_fullname = customer_fullname;
        this.customer_address = customer_address;
        this.customer_phone = customer_phone;
        this.customer_loginname = customer_loginname;
        this.customer_password = customer_password;
    }

    // Getter และ Setter
    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_fullname() {
        return customer_fullname;
    }

    public void setCustomer_fullname(String customer_fullname) {
        this.customer_fullname = customer_fullname;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_loginname() {
        return customer_loginname;
    }

    public void setCustomer_loginname(String customer_loginname) {
        this.customer_loginname = customer_loginname;
    }

    public String getCustomer_password() {
        return customer_password;
    }

    public void setCustomer_password(String customer_password) {
        this.customer_password = customer_password;
    }

    // Method สำหรับแสดงข้อมูลลูกค้า
    public void displayCustomerInfo() {
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Full Name: " + customer_fullname);
        System.out.println("Customer Address: " + customer_address);
        System.out.println("Customer Phone: " + customer_phone);
        System.out.println("Customer Login Name: " + customer_loginname);
        System.out.println("Customer Password: " + customer_password);
    }

    // Method main สำหรับทดสอบการทำงาน
    public static void main(String[] args) {
        // สร้าง object ของ Customer โดยใช้ constructor แบบไม่มี parameter
        Customer customer1 = new Customer();
        customer1.setCustomer_id("C001");
        customer1.setCustomer_fullname("John Doe");
        customer1.setCustomer_address("123 Main St, City");
        customer1.setCustomer_phone("123-456-7890");
        customer1.setCustomer_loginname("johndoe");
        customer1.setCustomer_password("password123");

        // สร้าง object ของ Customer โดยใช้ constructor แบบมี parameter
        Customer customer2 = new Customer("C002", "Jane Smith", "456 Elm St, Town", "987-654-3210", "janesmith", "pass456");

        // แสดงข้อมูลลูกค้า
        System.out.println("Customer 1 Information:");
        customer1.displayCustomerInfo();

        System.out.println("\nCustomer 2 Information:");
        customer2.displayCustomerInfo();
    }
}