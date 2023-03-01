public class Person {

    private String name;
    private String email;
    private long phone;

    public Person(String name, String email, long phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void sayHello () {
        System.out.println("Hello person");
    }
    public void introduce () {
        System.out.println("name: " + name + ", phone: " + phone);
    }
}
