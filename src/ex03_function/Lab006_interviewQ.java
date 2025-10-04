package ex03_function;

import java.util.Scanner;

public class Lab006_interviewQ {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //String prompt = "Please enter numbers";
        int a = readInt(scanner,"Enter a number");
        int b = readInt(scanner,"Enter b number");
        System.out.println("Sum " + sum(a,b));
        System.out.println("mul " + mul(a,b));
        System.out.println("Div" + div(a,b));
        System.out.println("Min" + min(a,b));
        System.out.println("Mod" + mod(a,b));




    }
   static int readInt(Scanner scanner,String prompt){
       System.out.println(prompt);
       if (scanner.hasNextInt()){
           return scanner.nextInt();
       }else {
           System.out.println("invalid input");
           System.exit(0);
           return 0;
       }

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
    static int min(int a,int b){
        return a-b;
    }
    static int mod(int a,int b){
        return a%b;
    }
}
