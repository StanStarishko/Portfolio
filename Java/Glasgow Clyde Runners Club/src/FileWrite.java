import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;

public class FileWrite extends IOFiles {

    // Method for write file
    public void fileIO(Boolean displayMode, ArrayList<Runner> listRunners) {
        File textFfile = new File(this.getFileName());

        try {
            // Create the empty file with default permissions, etc.
            textFfile.createNewFile();
        } catch (FileAlreadyExistsException x) {
            throw new RuntimeException(x);
        } catch (IOException x) {
            // Some other sort of failure, such as permissions.
            System.err.format("createFile error: %s%n", x);
            return;
        }

        // Write the body file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(textFfile))){
            boolean addNewString = false;
            for (Runner recordRunner : listRunners) {
                if (addNewString) {
                    bw.newLine();
                }
                bw.write(recordRunner.getFullName() + " " + recordRunner.getTimeSeconds());
                addNewString = true;
            }

        } catch (FileNotFoundException e) {
            System.out.println(textColors.getAnsiCode("Red") + "File " + getFileName() + " not found!" + textColors.getAnsiCode(""));
        } catch (IOException e) {
            System.out.println(textColors.getAnsiCode("Red") + "File " + getFileName() + " unable write!" + textColors.getAnsiCode(""));
        }
    }
}
