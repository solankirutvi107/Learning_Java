package ex04_String;

import java.util.Scanner;

public class Lab004_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String user_input = scanner.next();

        String reverse_user_input = "";

        for (int i = user_input.length()-1;i>=0;i--){
            reverse_user_input = reverse_user_input + user_input.charAt(i);

        }
        System.out.println(reverse_user_input);


    }
}
