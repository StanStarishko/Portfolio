import java.util.Scanner;

public class PasswordSrc {
    public static void main(String[] args) {
        
        String password = "pass";
        int fail = 3;
        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Welcome to Glasgow Clyde Runners Club.");
            System.out.println("Please enter your password to continue: ");
            String login = in.nextLine();
            if (login.equals(password)) {

                System.out.println("Password Validated");
                fail = 0;
                /*Menu();*/
            } else {
                fail--;
                System.out.println("Your Password is incorrect");// print message to user
                System.out.println("You have: " + fail + " attempts left.");
            }

        } while (fail != 0);

        System.out.println("Number of attempts exceeded. You are now locked out.");
        in.close();
        System.exit(0);

    }
}
