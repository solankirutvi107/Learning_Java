package ex02_Java_basic;

public class Lab_008 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;
        //logic
        //find  input and output datatype
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.printf("max is %d",max);
    }
}
