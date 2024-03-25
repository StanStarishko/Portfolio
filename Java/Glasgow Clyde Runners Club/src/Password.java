import java.util.Scanner;

public class Password implements Tools{

    public Boolean checkPassword() {
        
        int fail = 3;
        Scanner in = new Scanner(System.in);
        boolean checkResult = false;
        Tools listColors = new TextTools();

        do {

            /*System.out.println("Welcome to Glasgow Clyde Runners Club.");*/
            System.out.println("Please enter your password to continue: ");
            String login = in.nextLine();
            String password = "pass";
            if (login.equals(password)) {

                System.out.println("Password Validated");
                fail = 0;
                checkResult = true;
                /*Menu();*/
            } else {
                fail--;
                System.out.print(listColors.getAnsiCode("Red"));
                System.out.println("Your Password is incorrect");// print message to user
                System.out.println("You have: " + fail + " attempts left.");
                System.out.print(listColors.getAnsiCode("Reset"));
            }

        } while (fail != 0);

        if (checkResult) {
            System.out.println("Welcome to Glasgow Clyde Runners Club.");
        } else {
            System.out.print(listColors.getAnsiCode("Red"));
            System.out.println("Number of attempts exceeded. You are now locked out.");
            System.out.print(listColors.getAnsiCode("Reset"));
        }
        
        //in.close();
        
        return checkResult;

    }

    public String getAnsiCode(String colorString) {
        return "\u001B[0m";
    }

    public void keyEnter() {
    }
}
