package pkg73462_abstraction_2;
//73462
public class App {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        Manager m = new Manager();

        p.id = 1;
        p.experience = 5;
        m.id = 2;
        m.experience = 10;
        p.displayInfo();
        System.out.println("Programmer Salary: " + p.calculateSalary());
        m.displayInfo();
        System.out.println("Manager Salary: " + m.calculateSalary());
    }
}
