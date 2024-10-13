public class Challenge {
    public static void main(String [] args){

        String firstname = "Harry";
        String lastName = "Grow";

        String email = "harry.grow@example.com";

        String username = firstname.toLowerCase() + lastName.toLowerCase();

        System.out.println(username);

         email = email.replace("example.com","gmail.com");

        System.out.println(email);
        System.out.println(email);

        System.out.println("Index of @ : " + email.indexOf("@"));



    }
}
