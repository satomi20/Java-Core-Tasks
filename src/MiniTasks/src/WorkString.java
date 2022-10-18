package MiniTasks.src;

public class WorkString {
    private String s1 = "I Like Java!!!";

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public void sTR(){
        String s2 = "Java";
        System.out.println(s1.indexOf(s2));
    }
}
