package ex03_function;

public class Lab_005_UD_part1 {
    public static void main(String[] args) {
        wop_wor_greet();
        String msg = wop_withreturn_greet();
        System.out.println(msg);
        withpara_withoutreturn("Rutvi",25);
        int sum = with_para_with_Return(10,20,30);
        System.out.println(sum);
    }
    //without parameter and without return
    static void wop_wor_greet(){
        System.out.println("Hi.... without parameter and without return type");
    }
    //without parameter and with return
    static String wop_withreturn_greet(){
        System.out.println("Hiii without parameter and with return");
        return "Hy how are you";
    }
    //with parameter and without return
    static void withpara_withoutreturn(String name,int Age){
        System.out.println("My name ->"+ name + " My age  is ->" + Age);
    }
    //with parameter and with return
    static int with_para_with_Return(int a,int b,int c){
        System.out.println("functiton with both parameter and return");
        return a+b+c;
    }
}
