package RobotPolymorphism.src.by.teachmeskills.robot;

import RobotPolymorphism.src.by.teachmeskills.robot.hands.AppleHands;
import RobotPolymorphism.src.by.teachmeskills.robot.heads.SamsungHead;
import RobotPolymorphism.src.by.teachmeskills.robot.legs.SamsungLegs;


public class Robot2 implements IRobot {
        private SamsungHead head;
        private AppleHands hand;
        private SamsungLegs leg;

        public Robot2(SamsungHead head, AppleHands hand, SamsungLegs leg) {
            this.head = head;
            this.hand = hand;
            this.leg = leg;
        }

        public Robot2(){}

        public SamsungHead getHead() {
            return head;
        }

        public void setHead(SamsungHead head) {
            this.head = head;
        }

        public AppleHands getHand() {
            return hand;
        }

        public void setHand(AppleHands hand) {
            this.hand = hand;
        }

        public SamsungLegs getLeg() {
            return leg;
        }

        public void setLeg(SamsungLegs leg) {
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
