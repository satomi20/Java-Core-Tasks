package LargestString.src;

public class Large {

    public static void main(String[] args) {
        String s1 = "billyw";
        String s2 = "santa";
        String s3 = "gugok";
        if (s1.length() > s2.length() & s1.length() > s3.length()){
            System.out.println("Строка s1 самая большая");
            System.out.println(s1);
            if (s2.length()>s3.length()){
                System.out.println(s2 + " средняя");
                System.out.println(s3);
            }else {
                System.out.println(s3 + " средняя");
                System.out.println(s2);
            }

        }else  if (s2.length() > s1.length() & s2.length() > s3.length()){
            System.out.println("Строка s2 самая большая");
            System.out.println(s2);
            if (s1.length()>s3.length()){
                System.out.println(s1 + " средняя");
                System.out.println(s3);
            }else {
                System.out.println(s3 + " средняя");
                System.out.println(s1);
            }

        }else if(s3.length() > s1.length() & s3.length() > s2.length()){
            System.out.println("Строка s3 больше всех");
            System.out.println(s3);
            if (s1.length()>s2.length()){
                System.out.println(s1 + " средняя");
                System.out.println(s2);
            }else {
                System.out.println(s2 + " средняя");
                System.out.println(s1);
            }
        }
    }
}
