package Loop;

public class ex08 {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            if(i%2 == 0){
                System.out.println("Even-->"+ i);
            }
        }
        for (int i = 0; i <=50 ; i++) {
            if(i%2 != 0){
                System.out.println("Odd-->" + i);
            }
        }
    }
}
