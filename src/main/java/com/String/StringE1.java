package com.String;


public class StringOperation
{
    public static void main( String[] args ) {
        String str1 = "Java";
        int length = str1.length();
        System.out.println("Length of the String 'Java' : " + length);

    //task 2
    String str2 = "Long example sentence";
    char charAtIndex6 = str2.charAt(6);
    System.out.println("Character at index 6: " + charAtIndex6);

    //task 3
        String str3 = "Even longer example sentence";
        int index0 = str3.indexOf('0');
        System.out.println("Index of '0': " + index0);
    }
}
