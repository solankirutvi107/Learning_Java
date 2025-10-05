package ex04_String;

public class Lab005_palindrom {
    public static void main(String[] args) {
        //madam --> reverse -->madam
        //user_input == reverse(user_input)
        String input = "madam";
        String reverse ="";

        for ( int i = input.length()-1;i>=0;i--){
            reverse =reverse+input.charAt(i);
        }
        if(reverse.equalsIgnoreCase(input)){
            System.out.println("Palindrom");
        }else {
            System.out.println("Not Palindrom");
        }
    }
}
