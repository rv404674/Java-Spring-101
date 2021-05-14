package timbachulka.constructor;

// NOTE: constructor learning code - part1.
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // default constructor called
    public Account(){
        // lets say, if nothing is passed we want to set some default values as well.
        // this will call the following constructor.
        this("12345", 20000, "unknown@gmail.com", "unknown", "7018471136");
        System.out.println("Default constructor called");
    }

    // this will be called, when you send the parameters as well
    // NOTE: Constructor Chaining
    // we are using this contructor to initialize other contructors.
    public Account(String number, double balance, String customerEmailAddress, String customerName, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerEmailAddress = customerEmailAddress;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        // NOTE: you will often see, this type of approach, where you will be calling one main constructor again and
        //  again, this will help you to not duplicate code.
        this("123456", 100000, customerEmailAddress, customerName, customerPhoneNumber);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit of deposit amount" + amount + "New balance " + this.balance);
    }

    public void withDrawal(double amount){
        if (this.balance-amount <0){
            System.out.println("Withdrawal not possible");
        }else{
           this.balance -= amount;
           System.out.println("Withdrawal of " + amount + "Processed ");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
