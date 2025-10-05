package ex04_String;

import java.util.Scanner;

public class Lab008_First_letter_of_Each_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentance: ");
        String Sentance = scanner.nextLine();

        boolean inWord = false;

        for (int i =0; i<Sentance.length();i++){
            char c = Sentance.charAt(i);

            if(c !=' ' && c!= '\t' && c!='\n' && c!='.' && c!=','){
                if(!inWord){
                    System.out.print(c + " ");
                    inWord = true;
                }
            }else {
                inWord = false;
            }
        }
        scanner.close();

    }
}
