package RobotPolymorphism.src.by.teachmeskills.robot.legs;

public class AppleLegs implements ILeg{
    private int price;

    public AppleLegs(int price) {
        this.price = price;
    }
    public AppleLegs() {
    }

    @Override
    public void step(){
        System.out.println("Иду вперед Apple");

    }

    @Override
    public int getPrice(){
        return price;
    }
}
