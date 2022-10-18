package RobotPolymorphism.src.by.teachmeskills.robot.legs;

public class SamsungLegs implements ILeg{
    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }
    public SamsungLegs() {
    }

    @Override
    public void step(){
        System.out.println("Иду вперед Samsung");

    }
    @Override
    public int getPrice(){
        price = 2222;
        return price;
    }

}
