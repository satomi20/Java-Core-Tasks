package TryCatch.src.TryCatchCar;

public class Main {
    public static void main(String[] args) throws Exception {
        Car bmw = new Car("BMW", 234, 20000);
        Car audi = new Car("Audi", 500, 54000);
        audi.start();
    }
}
