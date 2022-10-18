package TryCatch.src.TryCatchCar;

import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int start() throws Exception{
        Random ran = new Random();
        int powering = ran.nextInt(20);
        try {
            if (powering%2 == 0) {
                throw new Exception("The car didn't start, try again");
            }else {
                System.out.println("The car " + brand +  " started up");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return powering;
    }








}
