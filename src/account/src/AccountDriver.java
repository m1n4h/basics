// This is the Driver program that runs the code
public class AccountDriver {
    public static void main(String[] args) {

        // a) Instantiate three objects of class Account

        // Object 1 with default constructor
        Account acc1 = new Account();

        // Object 2 with 2 parameters
        Account acc2 = new Account("amina", "1231");

        // Object 3 with 3 parameters
        Account acc3 = new Account("Bob Jones", "4455-9", 1500.50);

        // b) Display the values of the attributes found in each object
        System.out.println("--- Account List ---");
        acc1.displayInfo();
        acc2.displayInfo();
        acc3.displayInfo();
    }
//    display using the attribute
//        System.out.println(acc2.name  +" " + acc2.number);
//        System.out.println(acc2.number);
//    }
}