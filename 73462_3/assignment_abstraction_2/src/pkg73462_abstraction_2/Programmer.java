package pkg73462_abstraction_2;
//73462
public class Programmer extends Employee {
    int calculateSalary() {
        return 100000 + (experience * 10000);
    }

    void displayInfo() {
        System.out.println("Programmer ID: " + id);
        System.out.println("Experience: " + experience + " years");
    }
    
}
