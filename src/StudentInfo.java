import java.util.Scanner;
public class StudentInfo{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your  Age:  ");
        int age = sc.nextInt();
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("\n -- student details ---");
        System.out.print("Name:" + name);
        System.out.print("Age: " + age);
        System.out.print("GPA :" + gpa);
    }
}