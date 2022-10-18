package RobotPolymorphism.src.by.teachmeskills.robot.hands;

public class SonyHands implements IHand{
    private int price;


    public SonyHands(int price) {
        this.price = price;
    }
    public SonyHands(){}

    @Override
    public void upHand(){
        System.out.println("Руки Sony поднимаются");

    }

    @Override
    public int getPrice() {
        price = 1000;
        return price;
    }
}
