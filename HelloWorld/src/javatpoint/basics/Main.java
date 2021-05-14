package javatpoint;

import basics.Account;
import basics.VipCustomer;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        // Account account = new Account("12345xyz", 10000, "rv404674@gmail.com", "Rahul Verma", "7018471136");

        // NOTE: This is a tedious thing to do, if you need to do it for every customer.
        // use constructor
//        account.setCustomerName("Rahul Verma");
//        account.setCustomerEmailAddress("rv404674@gmail.com");
//        account.withDrawal(100);
//        System.out.println(account.getCustomerEmailAddress());
//        account.withDrawal(1000);
//
//        System.out.println(account.getBalance());
//
//        Account timAccount  = new Account("tim", "tim@gmail.com", "1999");

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer(5000, "rv404674@gmail.com");
        System.out.println(vipCustomer1.getCreditLimit());


        Rahul rahul = new Rahul();
        rahul.capitalize();
    }
}
