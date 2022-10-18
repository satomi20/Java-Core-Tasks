package RobotPolymorphism.src.by.teachmeskills.robot;

import RobotPolymorphism.src.by.teachmeskills.robot.hands.SamsungHands;
import RobotPolymorphism.src.by.teachmeskills.robot.heads.AppleHead;
import RobotPolymorphism.src.by.teachmeskills.robot.legs.SonyLegs;

public class Robot implements IRobot {
    private AppleHead head;
    private SamsungHands hand;
    private SonyLegs leg;

    public Robot(AppleHead head, SamsungHands hand, SonyLegs leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    public Robot(){}

    public AppleHead getHead() {
        return head;
    }

    public void setHead(AppleHead head) {
        this.head = head;
    }

    public SamsungHands getHand() {
        return hand;
    }

    public void setHand(SamsungHands hand) {
        this.hand = hand;
    }

    public SonyLegs getLeg() {
        return leg;
    }

    public void setLeg(SonyLegs leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speek();
        hand.upHand();
        leg.step();
    }

    /**
     * Get the cost of a robot
     * @return int
     */
    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }



}
