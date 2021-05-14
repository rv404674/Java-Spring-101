package timbachulka.constructor;

// NOTE: Constructor learning code - part2
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("unknown", 9500, "unknown@gmail.com");
        System.out.println("Default constructor called");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        System.out.println("First Main Constructor Called");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(double creditLimit, String emailAddress) {
        this("Rahul Verma", creditLimit, emailAddress);
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
}
