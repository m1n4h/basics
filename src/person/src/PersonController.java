import java.util.Scanner;

public class PersonController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n  Input Selection ");
            System.out.println("1 - Input Name only");
            System.out.println("2 - Input Name and Age");
            System.out.println("3 - Input Name, Age, and Salary");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            Person p = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    p = new Person(sc.nextLine());
                    break;
                case 2:
                    System.out.print("Enter Name: ");
                    String n2 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a2 = sc.nextInt();
                    p = new Person(n2, a2);
                    break;
                case 3:
                    System.out.print("Enter Name: ");
                    String n3 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a3 = sc.nextInt();
                    System.out.print("Enter Salary: ");
                    double s3 = sc.nextDouble();
                    p = new Person(n3, a3, s3);
                    break;
                case 0:
                    System.out.println("Program terminated.");
                    System.exit(0);
                default:
                    System.out.println("Invalid selection. Try again.");
                    continue;
            }

            int action;
            do {
                System.out.println("\n--- Selection ---");
                System.out.println("1 - Display entered details");
                System.out.println("2 - Enter details of another person");
                System.out.println("0 - Exit");
                System.out.print("Choice: ");
                action = sc.nextInt();

                switch (action) {
                    case 1:
                        p.display();

                        System.out.println("\n1 - Continue to enter details of another person");
                        System.out.println("0 - Exit");
                        System.out.print("Choice: ");
                        int postDisplay = sc.nextInt();
                        if (postDisplay == 0) {
                            System.out.println("Program terminated.");
                            System.exit(0);
                        }
                        action = 2;
                        break;
                    case 2:
                        // Returns to Step 1
                        break;
                    case 0:
                        System.out.println("Program terminated.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid input.");

                }
            } while (action != 2);
        } while (choice != 0);

        sc.close();
    }
}