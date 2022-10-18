package RobotPolymorphism.src.by.teachmeskills.robot.legs;

public class SonyLegs implements ILeg{
    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    public SonyLegs() {
    }

    @Override
    public void step(){
        System.out.println("Иду вперед Sony");

    }
    @Override
    public int getPrice(){
        price = 1400;
        return price;
    }
}
