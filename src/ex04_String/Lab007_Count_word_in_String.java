package ex04_String;

import java.util.Scanner;

public class Lab007_Count_word_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentance: ");
        String Sentance =scanner.nextLine();

        int count=0;
        boolean inWord = false;

        for (int i=0;i<Sentance.length();i++){
            char c =Sentance.charAt(i);

            if(c !=' ' && c!= '\t' && c!='\n' && c!='.' && c!=',') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            }else {
                    inWord =false;
                }

            }
        System.out.println("Number of words: " +count);
        scanner.close();
        }

        }
