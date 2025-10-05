package ex05_Array;

public class Lab002_max_array {
    public static void main(String[] args) {
        int[] array = {44,66,55,44,55,33,22,11,22,50};
        int max = array[0];
        for(int i =0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
