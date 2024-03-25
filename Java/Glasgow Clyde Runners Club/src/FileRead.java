import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class FileRead extends IOFiles {

    public FileRead() {
        fileName = "src\\Data\\race-results-1.txt";
    }

    // Method for read file
    public void fileIO(Boolean displayMode, ArrayList<Runner> listRunners) {
        File textFfile = new File(this.getFileName());
        fileBuffer.clear(); // Clearing buffer

        //Read file to the buffer of 2D array
        try (BufferedReader br = new BufferedReader(new FileReader(textFfile))) {
            String fileLine = null;

            while ((fileLine = br.readLine()) != null) {
                ArrayList<String> arrayLine = new ArrayList<>(Arrays.asList(fileLine.split(" ")));
                fileBuffer.add(arrayLine);
            }

            br.close();

            //Printing from 2D array
            if (displayMode) {
                String extString;

                System.out.println(textColors.getAnsiCode("PENCIL") + "File contents:" + textColors.getAnsiCode("Aqua"));

                for (ArrayList<String> strings : fileBuffer) {
                    ArrayList<String> currentLine = new ArrayList<>(strings);
                    fileLine = textColors.getAnsiCode("Cyan") + "Runner " + textColors.getAnsiCode("Aqua");

                    for (int idxSecond = 0; idxSecond < currentLine.size(); idxSecond++) {
                        fileLine += currentLine.get(idxSecond);
                        extString = " ";

                        if (idxSecond == 1) {
                            extString = textColors.getAnsiCode("Cyan") + " and his time (sec) is " + textColors.getAnsiCode("Aqua");
                        }

                        fileLine += extString;
                    }

                    System.out.println(fileLine);
                }

                textColors.keyEnter();
            }
        } catch (FileNotFoundException e) {
            System.out.println(textColors.getAnsiCode("Red") + "File " + getFileName() + " not found!" + textColors.getAnsiCode(""));
            textColors.keyEnter();
        } catch (IOException e) {
            System.out.println(textColors.getAnsiCode("Red") + "File " + getFileName() + " unable read!" + textColors.getAnsiCode(""));
            textColors.keyEnter();
        }
    }

    public ArrayList<Runner> getRuunersList() {
        ArrayList<Runner> runnersList = new ArrayList<>();

        for (ArrayList<String> strings : fileBuffer) {
            ArrayList<String> currentLine = new ArrayList<>(strings);
            Runner currentRunner = new Runner();
            currentRunner.setFirstName(currentLine.get(0));
            currentRunner.setSecondName(currentLine.get(1));
            currentRunner.setFullName();
            currentRunner.setTimeSeconds(Long.valueOf(currentLine.get(2)));
            runnersList.add(currentRunner);
        }

        return runnersList;
    }
}

