package ex03_function;

public class Lab003_simple_method {
    public static void main(String[] args) {
        no_return_function();
        String name = with_retur_type();
        System.out.println(name);
    }
    static void no_return_function(){
        System.out.println("not return anything");

    }
    //return type-int,string,boolean,chat,float
    static String with_retur_type(){
        System.out.println("hii,i will return something");
        return "rutvi";
    }
}
