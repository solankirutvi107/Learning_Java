package ex03_function;

public class Lab008_imp {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("Hello");

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));

        CharSequence s = "Rutvis".subSequence(1,4);//utv
        System.out.println(s);

        String s6 = "Java".substring(2);
        System.out.println(s6);

        String s7 = "'Javalan".substring(1,3);
        System.out.println(s7);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);




    }
}
