package CollectionSimpleTasks.src.AlgorithmsCycles;

//Вывод количества цифр и положительное оно либо отрицательное
public class Nine {

        public static void main(String []args) {
            int a = 234;
            int length = (int)(Math.log10(a)+1);//Подсчёт цифр в числе
            if (length==1) {
                System.out.println("Число однозначное");
            } else if (length==2) {
                System.out.println("Число двухзначное");
            } else if (length==3){
                System.out.println("Число трёхзначное");
            }
        }
}
