import java.lang.reflect.Field;
import java.util.Scanner;

public class Menus implements MenusTools {
    private final String menuHeader; // Container for menu header
    private final String menuBody; // Container for menu main part
    private final String menuFooter; // Container for menu footer
    static final String ANSI_RESET = "\u001B[0m"; //reset text

    public Menus() {
        StringBuilder srtingBuilder = new StringBuilder();
        
        srtingBuilder.append("Menu of Glasgow Clyde Runners Club App:");
        menuHeader = srtingBuilder.toString();
        srtingBuilder.delete(0, srtingBuilder.length());

        srtingBuilder.append("1. Read and Display File\n");
        srtingBuilder.append("2. Sort and Print Recorded Times\n");
        srtingBuilder.append("3. Find and Print Fastest Time\n");
        srtingBuilder.append("4. Find and Print the Slowest Time\n");
        srtingBuilder.append("5. Search\n");
        srtingBuilder.append("6. Time Occurrence\n");
        srtingBuilder.append("7. Exit Program");
        menuBody = srtingBuilder.toString();
        srtingBuilder.delete(0, srtingBuilder.length());
        
        srtingBuilder.append("Please, choose your menu option (1 - 7):");
        menuFooter = srtingBuilder.toString();
        srtingBuilder.delete(0, srtingBuilder.length());
    }

    public void setContainerMenu(String textMenu, String textColor, String typeMunu) {
        try {
            Field field = this.getClass().getDeclaredField("menu"+typeMunu);
            field.setAccessible(true);
            String newText = textColor + textMenu + ANSI_RESET;
            field.set(this, newText);
        } catch (Exception e) {
            // TODO: handle exception if needs
        }
    }

    public void showMenu() {
        System.out.println("\n\n" + menuHeader + "\n" + menuBody + "\n" + menuFooter);
    }

    public String getContainerMenu(String typeMunu) {
        String retuString = "";
        
        try {
            Field field = this.getClass().getDeclaredField("menu"+typeMunu);
            field.setAccessible(true);
            retuString = field.get(this).toString();
        } catch (Exception e) {
            // TODO: handle exception if needs
        }    

        return retuString;
    }

    public int getMenuItemSelection(int maxItem) {
        int returnItem = -1;
        Scanner inValue = new Scanner(System.in);
        Tools colors = new TextTools();

        String selection = inValue.nextLine();
        
        try {
            int selectionInt = Integer.parseInt(selection);
            if (selectionInt > 0 && selectionInt <= maxItem) {
                returnItem = selectionInt;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }

        //inValue.close();

        if (returnItem < 1) {
            System.err.println(colors.getAnsiCode("Red") + "You have entered an incorrect menu item. Try again" + ANSI_RESET);
        }
        return returnItem;
    }
}
