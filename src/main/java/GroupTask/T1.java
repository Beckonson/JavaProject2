package GroupTask;
/*
Write a program to swap 2 String without a temporary variable?
 */
public class T1 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";

        System.out.println("Before swapping:");
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        // Concatenate the strings and use substring to swap
        string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());

        System.out.println("\nAfter swapping:");
        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);
    }
}
