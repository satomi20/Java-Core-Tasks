package RobotPolymorphism.src.by.teachmeskills.robot.hands;

public class SamsungHands implements IHand{
    private int price;


    public SamsungHands(int price) {
        this.price = price;
    }
    public SamsungHands(){

    }

    @Override
    public void upHand(){
        System.out.println("Руки Samsung поднимает руки");

    }

    @Override
    public int getPrice() {
        price = 1900;
        return price;
    }
}
