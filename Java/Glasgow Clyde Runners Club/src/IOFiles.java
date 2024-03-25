import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IOFiles implements IOTools{
    protected String fileName = "";
    protected ArrayList<ArrayList<String>> fileBuffer = new ArrayList<>();
    protected Tools textColors = new TextTools();

    // Returning file Name
    public String getFileName() {
        return this.fileName;
    }

    public void fileIO(Boolean displayMode, ArrayList<Runner> listRunners) {

    }
    public ArrayList<Runner> getRuunersList() {
        return null;
    }

    public void setFileName(String newName, Boolean displayCurrentPath) {

        if (newName.isEmpty()) {
            Scanner in = new Scanner(System.in);

            System.out.println(textColors.getAnsiCode("Yellow") + "\nCurrent data file is " + textColors.getAnsiCode("Green") + this.fileName + textColors.getAnsiCode(""));
            System.out.println(textColors.getAnsiCode("Cyan") + "If you want to change its then input new name, if no then just key-Enter: " + textColors.getAnsiCode(""));
            newName = in.nextLine();
        }

        if (!newName.isEmpty()) {
            this.fileName = Paths.get("").toAbsolutePath() + newName;

            if (displayCurrentPath) {
                System.out.println(textColors.getAnsiCode("Yellow") + "\nCurrent data file is " + textColors.getAnsiCode("Green") + this.fileName + textColors.getAnsiCode(""));
            }
        }
    }
}
