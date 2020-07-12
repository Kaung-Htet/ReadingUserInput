import java.util.Scanner;

public class ReadingUserInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your year of birth:");

        //return true if user input is int
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){

            int yearOfBirth = scanner.nextInt();

            //အောက်ကလိုင်းမပါရင် နောက်တစ်ကြိမ် နာမည် input ကုဒ်က input မတောင်းတော့ဘူး
            //whenever we relate a number from the scanner, being an Int or Float or Double or some other type,
            //we press the Enter key on the keyboard as we just did with the age.
            //So doing that ends the line
            //to handle the Enter key issue, we have to call next line, so that the scanner works as expected
            //Now internally the scanner is checking for a line separator
            //when we hit Enter we're typing a line separator so that's interpreted as input
            //When we reach the next line method that retrieves the name
            //the input for a name becomes Enter, so is essentially skipped.
            scanner.nextLine(); //handle next line character (Enter)

            int age = 2020 - yearOfBirth;

            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }

            //It's recommended that we close the scanner after we don’t need it anymore
            // as it then releases the underlying memory that scanner was using internally.
            scanner.close();
        } else {
            System.out.println("Unable to parse year of birth");
        }


    }
}
