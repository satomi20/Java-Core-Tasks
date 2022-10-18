package RobotPolymorphism.src.by.teachmeskills.robot;

import RobotPolymorphism.src.by.teachmeskills.robot.hands.AppleHands;
import RobotPolymorphism.src.by.teachmeskills.robot.hands.SamsungHands;
import RobotPolymorphism.src.by.teachmeskills.robot.heads.AppleHead;
import RobotPolymorphism.src.by.teachmeskills.robot.heads.SamsungHead;
import RobotPolymorphism.src.by.teachmeskills.robot.legs.SamsungLegs;
import RobotPolymorphism.src.by.teachmeskills.robot.legs.SonyLegs;

public class Run {
    public static void main(String[] args) {
        AppleHead appleHead = new AppleHead();
        SamsungHands samsungHands = new SamsungHands();
        SonyLegs sonyLegs = new SonyLegs();
        Robot verter = new Robot(appleHead, samsungHands, sonyLegs);
        verter.action();
        int cost = verter.getPrice();
        System.out.println(cost);

        SamsungHead samsungHead = new SamsungHead();
        AppleHands appleHands = new AppleHands();
        SamsungLegs samsungLegs = new SamsungLegs();
        Robot2 Josh = new Robot2(samsungHead, appleHands, samsungLegs );
        Josh.action();
        int cost2 = Josh.getPrice();
        System.out.print(cost2);
        if (cost > cost2){
            System.out.println("Первый робот дороже");
        }


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
