package CollectionSimpleTasks.src.Transport.Vozdushny;

import java.util.Scanner;

public class Civilian extends Air {
    int numb_passengers;
    int allow_num_pass;
    boolean business_class;

    public int getAllow_num_pass(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество пассажиров поднявшихся на борт " + brand);
        numb_passengers = scan.nextInt();
        System.out.println("Введите допустимое количество пассажиров на борту " + brand);
        allow_num_pass = scan.nextInt();
        if (numb_passengers > allow_num_pass){
            System.out.println("Пассажиров больше допустимой нормы");
        }else if (allow_num_pass > numb_passengers){
            System.out.println("Всем кто был со мной когда я был внизу... пристегнитесь мы взлетаем");
        }return numb_passengers;
    }

    public static void main(String[] args) {
        Civilian boeing = new Civilian();
        boeing.brand = "Boeing";
        boeing.getAllow_num_pass();

    }

}
