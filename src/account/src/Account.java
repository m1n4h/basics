public class Account {
    // Private attributes (Encapsulation) and display it in main ava using that attribute
//    public String number;
//    public String name;
//    public double balance;

    // Private attributes (Encapsulation)
    private String number;
    private String name;
    private double balance;

    // Default Constructor (No parameters)
    public Account() {
        this.name = "";
        this.number = "";
        this.balance = 0.0;
    }

    // Constructor with 2 parameters
    // this keyword is usedto tell the compile that that i written in above in private is the same with  th below.
    public Account(String name, String number) {
        this.name = name;      // 'this.name' is the attribute, 'name' is the parameter
        this.number = number;
        this.balance = 0.0;    // Default balance
    }

    // Constructor with 3 parameters
    public Account(String name, String number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    // Method to display account details
    public void displayInfo() {
        System.out.println("Name: " + this.name  + "  Account: " + this.number + "    Balance: $" + this.balance);
    }
}
