package ex04_String;

import java.util.Scanner;

public class Lab006_string_reverse_while {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for number of characters
        System.out.print("Enter the number of characters in the string: ");
        int n = scanner.nextInt();
        char[] input = new char[n];

        // Input characters one by one
        System.out.println("Enter characters one by one:");
        for (int i = 0; i < n; i++) {
            input[i] = scanner.next().charAt(0);
        }

        // Reverse using while loop
        int i = n - 1;
        System.out.print("Reversed string: ");
        while (i >= 0) {
            System.out.print(input[i]);
            i--;
        }
    }
}
