package ex03_function;

public class Lab004_user_define_function {
    public static void main(String[] args) {
        int result = sum_of_two_number(5,4);
        System.out.println(result);
        int result1 =sum_of_two_number(10,20);
        System.out.println(result1);
    }
    static int sum_of_two_number(int a,int b){
        return a+b;

    }
}
