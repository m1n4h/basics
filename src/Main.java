

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String names = "amina kalonge";
        int age = 12;
        String grade  = "A";
        boolean married = true;
        double gpa = 4.0;


            System.out.println("Your name  is :" + names +" and your age is" + age + "and the grade  " + grade +"and your martial stastus " + married+ " "
                            +gpa);

        Scanner sc = new Scanner(System.in);
        // prompt user
        System.out.print("enter name :");
        String name = sc.nextLine();
        // System.out.println("You entered: " + name);
        System.out.println(name);





    }


    }