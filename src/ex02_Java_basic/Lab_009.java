package ex02_Java_basic;

public class Lab_009 {
    public static void main(String[] args) {
        String age = args[0];

        System.out.println(age instanceof String);
        int up1_age = Integer.parseInt(age);
       // System.out.println(up1_age);

        String result = (up1_age < 18) ? "Minor" :  (up1_age < 60 ) ? "Adult" : "Sr. Citizen";
        System.out.println(result);

    }
}
