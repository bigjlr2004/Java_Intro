public class String_Adventure {

    public static void main(String[] args){

        // check the length using the length function and print the length
        String text = "Adventure";

        int text_length = text.length();

        System.out.println("Length of text: " + text_length);

        // get the character at position 2 using charAt()

        char char_AtPosition_3 = text.charAt(2);
        System.out.println("Character at Position 3: " + char_AtPosition_3);

        //Get a part of the string from position 1 to 4 and print the string

        String partfrom1to4 = text.substring(0,4);
        System.out.println("Substring: " + partfrom1to4);

        //compare to strings and print the output
        String anotherText = "Adventure";
        System.out.println(text.equals(anotherText));

        String toUpperCase = text.toUpperCase();
        System.out.println(toUpperCase);

        String toLowerCase = text.toLowerCase();
        System.out.println(toLowerCase);

        boolean containsVent = text.contains("vent");
        System.out.println("Contains vent: " + containsVent);

        String replaceEwithA = text.replace("e", "a");
        System.out.println(replaceEwithA);

    }
}
