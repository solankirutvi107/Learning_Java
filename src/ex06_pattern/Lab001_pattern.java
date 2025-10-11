package ex06_pattern;

import java.util.Scanner;

public class Lab001_pattern {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the n for Pattern");
        int n = scanner.nextInt();

        for(int i = 0; i<n;i++){
            for(int j =0 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
