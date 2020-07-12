import java.util.Scanner;

public class ReadingUserInput {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        int age = 2020 - yearOfBirth;

        //အောက်ကလိုင်းမပါရင် နောက်တစ်ကြိမ် နာမည် input ကုဒ်က input မတောင်းတော့ဘူး
        //whenever we relate a number from the scanner, being an Int or Float or Double or some other type,
        //we press the Enter key on the keyboard as we just did with the age.
        //So doing that ends the line
        //to handle the Enter key issue, we have to call next line, so that the scanner works as expected
        //Now internally the scanner is checking for a line separator
        //when we hit Enter we're typing a line separator so that's interpreted as input
        //When we reach the next line method that retrieves the name
        //the input for a name becomes Enter, so is essentially skipped.
        scanner.nextLine(); //handle next line character

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + " and you are " + age + " years old");

        scanner.close();
    }
}
