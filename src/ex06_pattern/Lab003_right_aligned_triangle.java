package ex06_pattern;

public class Lab003_right_aligned_triangle {
    public static void main(String[] args) {
        int n =5;

        for(int i=0;i<n;i++){
            for(int j =i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
