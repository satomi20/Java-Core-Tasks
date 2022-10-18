package RobotPolymorphism.src.by.teachmeskills.robot.hands;

public class AppleHands implements IHand{
    private int price;


    public AppleHands(int price) {
        this.price = price;
    }

    public AppleHands() {
    }

    @Override
    public void upHand(){
        System.out.println("Руки Apple поднимаются");

    }

    @Override
    public int getPrice() {
        price = 2000;
        return price;
    }


}
