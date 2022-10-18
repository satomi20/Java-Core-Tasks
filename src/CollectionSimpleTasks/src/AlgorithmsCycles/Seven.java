package CollectionSimpleTasks.src.AlgorithmsCycles;

public class Seven {

    public static void main(String[] args) {
        int a =127;
        int length = (int)(Math.log10(a)+1);
        if (a % 10 == 1 & a % 100 != 11 ) {
            System.out.println(a + " " + "программист");
        }else if (a % 10 >= 2 & a % 10 <= 4 & (a % 100 < 10 | a % 100 > 20)) {
            System.out.println(a + " " + "программиста");
        }else {
            System.out.println(a + " " + "программистов");
        }
    }
}
