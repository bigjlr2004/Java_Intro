public class String_Practice {

    public static void main(String[] args) {

        // B is capital
        String fruit1 = "Banana";

        // b is small
        String fruit2 = "banana";

        // B is capital

        String fruit3 = "Banana";

        boolean result1 = fruit1.equals(fruit2);

        boolean result2 = fruit1.equals(fruit3);

        System.out.println("Using equals() method \"" +  fruit1 + "\" is equal to \"" + fruit2 + "\": " + result1);
        System.out.println("Using equals() method \"" +  fruit1 + "\" is equal to \"" + fruit3 + "\": " + result2);

        // B is capital
        String fruit = "Banana";

        String fruitInUpperCase = fruit.toUpperCase();
        String fruitToLowerCase = fruit.toLowerCase();

        System.out.println("The fruit: \"" + fruit + "\"");
        System.out.println("The fruit converted to uppercase: \"" + fruitInUpperCase + "\"");
        System.out.println("The fruit converted to lowercase: \"" + fruitToLowerCase + "\"");


        boolean hasAna = fruit.contains("ana");
        boolean hasBrooks = fruit.contains("brooks");

        System.out.print("The fruit : \"" + fruit + "\"");
        System.out.println("The fruit \"" + fruit + "\" contains the substring \"ana\": " + hasAna);
        System.out.println("The fruit \"" + fruit + "\" contains the substring \"brooks\": " + hasBrooks);

        String fruitWithLetter_A_replacedWith_O = fruit.replace('a','o');
        System.out.println("The fruit: \"" + fruit + "\"");
        System.out.println("The fruit \"" + fruit + "\" with character \"a\" replaced with character \"o\": " + fruitWithLetter_A_replacedWith_O);


    }
}
