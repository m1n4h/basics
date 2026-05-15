public class Person {
    private String name;
    private int age;
    private double salary;

    // Constructor 1: Only name
    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.salary = 0.0;
    }

    // Constructor 2: Name and Age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 0.0;
    }

    // Constructor 3: Name, Age, and Salary
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("\n Person Details ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + (age == 0 ? "Not provided" : age));
        System.out.println("Salary: " + (salary == 0.0 ? "Not provided" : "$" + salary));
    }
}