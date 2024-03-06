package com.String;


public class StringE1
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

        //task 4
        String str4 = "Ok this is not as long!";
        String substring = str4.substring(11,22);
        System.out.println("Substring:" + substring);

        //task 5
        String str5 = "CAPS EQUAL SCREAMING";
        String lowercase = str5.toLowerCase();
        System.out.println("Lowercase: " + lowercase);
        String uppercase = lowercase.toUpperCase();
        System.out.println("Uppercase: " + uppercase);

        //task 6
        String str6 = "Java is the worst programing language!";
        String correctedString = str6.replace("worst" , "best");
        System.out.println("Corrected sentence: " + correctedString);

        //task7
        String str7 = "\tJ\ta\tv\ta\t";
        String trimmedString = str7.trim();
        System.out.println("Trimmed string: " + trimmedString);

        // task 8
        int num = 20;
        String str8 = String.valueOf(num) + num;
        System.out.println("7. Result: " + str8);

        //task 9
        String str9 = "Oil and Water";
        String[] words = str9.split(" ");
        System.out.println("8. Words: ");
        for (String word : words){
            System.out.println("   " + word);
        }

        // task 10
        String str10 = "Carl, Susie, Fredrick, Bob, Erik";
        String[] names = str10.split(",");
        System.out.println("9. Names:");
        for (String name : names) {
            System.out.println("   " + name);
        }

        //task 11
        String str11 = "ThisShouldBeConverted";
        char[] charArray = str11.toCharArray();
        System.out.println("10. Char Array:");
        for (char c : charArray) {
            System.out.println(" " + c);
        }

        //task 12
        char[] charArray2 = {'J','a','v','a'};
        String str12 = String.valueOf(charArray2);
        System.out.println("11. Converted String: " + str12);

    }
}