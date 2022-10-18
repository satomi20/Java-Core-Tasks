package RobotPolymorphism.src.by.teachmeskills.robot.heads;

public class AppleHead implements IHead{
    private int price;

    public AppleHead(int price) {
        this.price = price;
    }

    public AppleHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Apple");
    }

    @Override
    public int getPrice() {
        price = 3000;
        return price;
    }
}
