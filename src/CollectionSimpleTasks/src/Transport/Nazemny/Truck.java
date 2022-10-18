package CollectionSimpleTasks.src.Transport.Nazemny;

import CollectionSimpleTasks.src.Transport.Transport;

import java.util.Scanner;

public class Truck extends Transport {
    int tonnage;
    int number_of_wheels;
    int fuel_rate;
    int cargo_weight;

    public int getWeight(){
        if (tonnage > cargo_weight){
            System.out.println("Грузовик загружен");
        }else if (tonnage < cargo_weight){
            System.out.println("Вес груза больше допустимой нормы");
        }return tonnage;
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вашу грузоподъемность");
        truck.tonnage = scan.nextInt();
        System.out.println("Введите вес груза");
        truck.cargo_weight = scan.nextInt();
        truck.getWeight();
    }
}
