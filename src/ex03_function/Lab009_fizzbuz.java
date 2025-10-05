package ex03_function;

public class Lab009_fizzbuz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {          // Multiples of both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {    // Multiples of 3
                System.out.println("Fizz");
            } else if (i % 5 == 0) {    // Multiples of 5
                System.out.println("Buzz");
            } else {                    // All other numbers
                System.out.println(i);
            }
        }
    }
}
