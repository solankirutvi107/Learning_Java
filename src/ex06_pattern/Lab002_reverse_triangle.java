package ex06_pattern;

import java.util.Scanner;

public class Lab002_reverse_triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n number for triangle");
        int  n =scanner.nextInt();

        for (int i = n; i >= 1 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
