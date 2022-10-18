package RobotPolymorphism.src.by.teachmeskills.robot.heads;

import RobotPolymorphism.src.by.teachmeskills.robot.IRobot;

public class SonyHead implements IHead, IRobot {
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void action(){

    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        price = 2000;
        return price;
    }
}
