package ex05_Array;

public class Lab006_Second_max {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

        int max = Integer.MIN_VALUE;//1
        int secondMax = Integer.MIN_VALUE;//3

        for (int num : numbers) {
            if (num > max) {
                // Update second max before max changes
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        System.out.println("Second maximum number is: " + secondMax);
    }
}
