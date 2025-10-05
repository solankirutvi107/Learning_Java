package ex05_Array;

public class Lab001_arrays {
    public static void main(String[] args) {
        int[] marks = {91,93,94,95,88,77,78};
        boolean[] is_married_people = {true,false,true};
       // System.out.println(marks);
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
       // System.out.println(marks[-1]);

       String name = "Rutvi";
       String[] name_each_element =name.split("");
        for (String name1:name_each_element){
           System.out.println(name1);
        }

    }
}
