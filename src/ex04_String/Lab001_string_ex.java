package ex04_String;

public class Lab001_string_ex {
    public static void main(String[] args){
        String name = "Rutvi";

        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.contains("ut"));

        StringBuilder stringBuilder =new StringBuilder("Rutvi");
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Rutvi");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuffer stringBuffer1 = new StringBuffer("Rutvi");
        System.out.println(stringBuffer1);

        stringBuffer1.append("Solanki");
        System.out.println(stringBuffer1);
    }
}
