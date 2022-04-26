package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;
    public VipCustomer() {
        this("Defutl Name", 0.00, "defult@def.com");
        System.out.println("Empty Constructor is Called");
    }

    public VipCustomer(String name, String emailAddress) {
        this(name,0.0,emailAddress );
        System.out.println("2 value Constructor is Called");

    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("VipCustomer with parameters called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "VipCustomer{" +
                "name='" + name + '\'' +
                ", creditLimit=" + creditLimit +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
