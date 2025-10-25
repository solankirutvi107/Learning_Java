package Loop;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
       //factorial
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int fact =1;
        if(n == 0){
            fact =1;
        }
        for (int i = n; i >=1; i--) {
            fact = fact*i;

        }
       System.out.println(fact);

    }
}
