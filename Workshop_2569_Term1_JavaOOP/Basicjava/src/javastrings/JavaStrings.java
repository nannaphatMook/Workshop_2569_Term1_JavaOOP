package javastrings;

public class JavaStrings {

    public static void main(String[] args) {

        String str1 = "My name is ";
        String str2 = "Dr.notSS";
        String str3 = str1 + str2;

        System.out.println(str3);

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());

        System.out.println(str3.charAt(4));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toLowerCase());
        System.out.println(str3.contains(str2));
        System.out.println(str3.indexOf("n"));
    }
}