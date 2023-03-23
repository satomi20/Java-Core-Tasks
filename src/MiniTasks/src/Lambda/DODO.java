package MiniTasks.src.Lambda;

public class DODO {
    public static void main(String[] args) {
        Bob bob = (a, b) -> a + " " + b;
        String res = bob.plus("Hello", "friend");
        System.out.println(res);
        GOG gog = a -> a.substring(3);
        String ef = gog.str("My friend??///");
        System.out.println(ef);







    }
}
