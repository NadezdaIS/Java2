import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John Smith", "john.smith@example.com", 1234567890L);
        Customer customer1 = new Customer("Jane Doe", "jane.doe@example.com", 987654321L,
                20.40, new Date());

        customer1.sayHello();
        person1.sayHello();
        customer1.introduce();
        person1.introduce();
    }
}
