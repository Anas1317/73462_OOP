package pkg73462_abstraction;
//73462
public class App {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle b = new Bike();

        c.start();
        b.start();
    }
}
