import java.util.Scanner;

public class TextTools implements Tools{

    public static final String ANSI_RESET = "\u001B[0m"; //reset text

    // Colours text
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String WHITE_CYAN = "\u001b[37;46m";
    public static final String RED_YELLOW = "\u001b[31;43m";
    public static final String PINK = "\u001b[38;5;201m";
    public static final String LAVENDER = "\u001b[38;5;147m";
    public static final String AQUA = "\u001b[38;2;145;231;255m";
    public static final String PENCIL = "\u001b[38;2;253;182;0m";

    public String getAnsiCode(String colorString){
        String ansiCode = ANSI_RESET;

        colorString = colorString.toUpperCase();

        ansiCode = switch (colorString) {
            case "RESET" -> ANSI_RESET;
            case "RED" -> ANSI_RED;
            case "YELLOW" -> ANSI_YELLOW;
            case "BLUE" -> ANSI_BLUE;
            case "PURPLE" -> ANSI_PURPLE;
            case "BLACK" -> ANSI_BLACK;
            case "GREEN" -> ANSI_GREEN;
            case "CYAN" -> ANSI_CYAN;
            case "WHITE" -> ANSI_WHITE;
            case "WHITE_CYAN" -> WHITE_CYAN;
            case "RED_YELLOW" -> RED_YELLOW;
            case "PINK" -> PINK;
            case "LAVENDER" -> LAVENDER;
            case "AQUA" -> AQUA;
            case "PENCIL" -> PENCIL;
            default -> ansiCode;
        };

        return ansiCode;
    }
    
    public Boolean checkPassword() {
        return false;
    }

    public void keyEnter() {
        System.out.print(getAnsiCode("LAVENDER") + "\n For continuing key-Enter  " + getAnsiCode(""));
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

}
