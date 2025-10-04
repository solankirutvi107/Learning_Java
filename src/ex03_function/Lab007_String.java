package ex03_function;

public class Lab007_String {
    public static void main(String[] args) {
        String name ="rutvi";
        String name1 = name.toUpperCase();
        System.out.println(name);
        System.out.println(name1);

        String s1 = "Hello";
        s1 =s1.concat("world");
        System.out.println(s1);

        char c = 'A';
        System.out.println(c);

        String s2 = "ABCD";
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s2.concat("E"));
    }
}
