package pkg73462_abstraction_2;
//73462
public class Manager extends Employee {
    int calculateSalary() {
        return 110000 + (experience * 12500);
    }

    void displayInfo() {
        System.out.println("Manager ID: " + id);
        System.out.println("Experience: " + experience + " years");
    }
    
}
