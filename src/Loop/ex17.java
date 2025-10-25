package Loop;

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for factorial");

        if(!scanner.hasNextInt()){
            System.out.println("Enter int value");
        }
        else{
            int number = scanner.nextInt();
            int fact=1;
            if(number == 0){
                System.out.println("factorial is 1");
            }
            if(number<0 || number>Integer.MAX_VALUE){
                System.out.println("Can't get the factorial");
            }
            int i =1;
            while (i<=number){
                fact = fact*i;
                i++;
            }
            System.out.println(fact);
        }

    }
}
