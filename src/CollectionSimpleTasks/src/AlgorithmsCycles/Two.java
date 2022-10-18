package CollectionSimpleTasks.src.AlgorithmsCycles;

//Треугольник и его сторон
public class Two {


   public static void main(String[] args) {
       int storona_a = 12;
       int storona_b = 10;
       int storona_c = 7;
       if (storona_a + storona_b > storona_c & storona_a + storona_c > storona_b & storona_b + storona_c > storona_a) {
           System.out.println("Треугольник существует");
       } else {
    System.out.println("Треугольника не существует");
       }
   }


}

