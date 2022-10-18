package CollectionSimpleTasks.src.Transport.Nazemny;

import java.util.Scanner;

public class Automobile extends Ground {
    String body_type;
    int num_passengers;
    Scanner scan = new Scanner(System.in);
    public double distance;

    public double getkW() {
        double kW = 0;
        kW = power * 0.74;
        double scale = Math.pow(5, 3);
        double result = Math.ceil(kW * scale) / scale;
        return result;
    }

    public double getKm(){
        System.out.println("Введите скорость авто");
        double speed = scan.nextDouble();
        System.out.println("Введите время");
        double time = scan.nextDouble();
        distance = speed * time;
        System.out.println("За время " + time + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью "
                + speed + " проедет " + distance + " км, и потратит " + top() + " литров топлива");
        return distance;
    }

    private double top() {
        //System.out.println("Введите залитое топливо");
        double fuel = scan.nextDouble();
        return distance/fuel;
    }

    public static void main (String[] args) {
        Automobile bmw = new Automobile();
        bmw.power = 345; bmw.max_speed =450; bmw.weight = 3000; bmw.brand = "BMW M-3";
        bmw.fuel_rate = 14; bmw.body_type = "Sedan"; bmw. num_passengers = 5;
        bmw.getkW();        ///Расчет мощности в кв

        String BMW = "Мощность: " + bmw.power + System.lineSeparator() +
                "Макс. скорость:" + bmw.max_speed + System.lineSeparator() +
                "Вес: " + bmw.weight + System.lineSeparator() +
                "Марка: " + bmw.brand + System.lineSeparator() +
                "Расход топлива на 100: " + bmw.fuel_rate + System.lineSeparator() +
                "Тип кузова: " + bmw.body_type + System.lineSeparator() +
                "Кол-во пассажиров: " + bmw.num_passengers + System.lineSeparator() +
                "Мощность в кВ: " + bmw.getkW();
        System.out.println(BMW);
        bmw.getKm();
    }
}
