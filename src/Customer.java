import java.util.Date;

public class Customer extends Person{

    private double balance;
    private Date date;

    public Customer(String name, String email, long phone, double balance,  Date date) {
        super (name, email, phone);
        this.balance = balance;
        this.date = date;
    }

    public void sayHello() {
        System.out.println("Hello customer");
    }
}
