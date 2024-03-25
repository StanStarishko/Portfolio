import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final IOTools fileForRead = new FileRead();
    private static final IOTools fileForWrite = new FileWrite();
    private static final Tools textColors = new TextTools();

    public static void main(String[] args) throws IOException {
        
        // Before you start, you must log in to the program.
        Tools passwordTools = new Password();
        Boolean inputPasswordBoolean = passwordTools.checkPassword();
        Scanner inputScanner = new Scanner(System.in);

        // If authorization is not successful, the program is blocked
        if (! inputPasswordBoolean) {
            System.exit(0);
        }

        // Display the main menu and selecting some item 
        int selectItem = -1;
        MenusTools mainMenu = new Menus();
        Tools listColors = new TextTools();
        mainMenu.setContainerMenu(mainMenu.getContainerMenu("Header"), listColors.getAnsiCode("Pencil"), "Header");
        mainMenu.setContainerMenu(mainMenu.getContainerMenu("Body"), listColors.getAnsiCode("PURPLE"), "Body");
        mainMenu.setContainerMenu(mainMenu.getContainerMenu("Footer"), listColors.getAnsiCode("BLUE"), "Footer");

        // Processing the menu
        while (selectItem != 7) {
            mainMenu.showMenu();
            selectItem = mainMenu.getMenuItemSelection(7);
            processingMenu(selectItem);
        }

        // Exit from application
        System.out.println(listColors.getAnsiCode("Yellow") + "\nGoodbye! See you next time\n" + listColors.getAnsiCode("Reset"));
        inputScanner.close();
    }

    public static void processingMenu(int selectItem) throws IOException {
        if (selectItem == 1) {
            readAndDisplayFile();
        } else if (selectItem > 1 && selectItem < 7) {
            processingReports(selectItem);
        }
    }

    private static void processingReports(int selectItem) throws IOException {

        //Get runners list for reports processing if be
        fileForRead.fileIO(false, null);

        //Have any problem with the file data
        if (fileForRead.getRuunersList().isEmpty()) {
            return;
        }

//        To fulfil all reporting needs, we first need to sort the array
//        of runners by their time result
        ArrayList<Runner> listRunners = new ArrayList<>(fileForRead.getRuunersList());

        //listRunners.sort(Comparator.comparingLong(Runner::getTimeSeconds).reversed());
        listRunners.sort((o1, o2) -> -Long.compare(o1.getTimeSeconds(), o2.getTimeSeconds()));

        switch (selectItem) {
            case 2 -> sortAndPrintRecordedTimes(listRunners);
            case 3, 4 -> findAndPrintFastestSlowestTime(listRunners,selectItem);
            case 5, 6 -> searchOccurrenceTime(listRunners,selectItem);
            default -> throw new IllegalStateException("Unexpected value: " + selectItem);
        }

        // Positioning the file reading for the main data file
        fileForRead.setFileName("\\src\\Data\\race-results-1.txt", false);
    }

    private static void searchOccurrenceTime(ArrayList<Runner> listRunners, int selectItem) throws IOException {
        boolean inputSucc = false;
        long seachingValue = 0L;
        Scanner in = new Scanner(System.in);

        if (selectItem == 5) {
            System.out.println(textColors.getAnsiCode("Aqua") + "Printing and displaying the searched time" + textColors.getAnsiCode(""));
        } else {
            System.out.println(textColors.getAnsiCode("Aqua") + "Printing and displaying the occurrence times" + textColors.getAnsiCode(""));
        }

        do {
            try {
                System.out.println(textColors.getAnsiCode("Pencil") + "Please, input the time value for the search" + textColors.getAnsiCode(""));
                seachingValue = in.nextLong();
                inputSucc = true;
            } catch (Exception e) {
                System.err.println("You inputted the wrong value. Try again");
                in.next();
            }
        } while (!inputSucc);

        long finalCompareValue = seachingValue;
        List<Runner> filteredRunners = listRunners
                .stream()
                .filter(c -> c.getTimeSeconds() == finalCompareValue)
                .toList();

        if (filteredRunners.isEmpty()) {
            System.err.println("\n None of the Runners have a time of " + finalCompareValue + " seconds");
            // Positioning the file reading for the main data file
            fileForRead.setFileName("\\src\\Data\\race-results-1.txt", false);
            textColors.keyEnter();
            return;
        }

        if (selectItem == 5) { //Write the search time
            filteredRunners = Collections.singletonList(filteredRunners
                    .stream()
                    .filter(c -> c.getTimeSeconds() == finalCompareValue)
                    .findFirst()
                    .orElse(null));

            System.out.println(textColors.getAnsiCode("Aqua") + "Printing and displaying the search time of " + finalCompareValue + " sec" + textColors.getAnsiCode(""));
            fileForWrite.setFileName("\\src\\Reports\\search-time.txt",true);
        } else { //Write the occurrence time
            System.out.println(textColors.getAnsiCode("Aqua") + "Printing and displaying the occurrence time of " + finalCompareValue + " sec" + textColors.getAnsiCode(""));
            fileForWrite.setFileName("\\src\\Reports\\occurrence-time.txt",true);
        }

        System.out.println(textColors.getAnsiCode("Yellow") + "Your data have been written to the file " + textColors.getAnsiCode("Green") + fileForWrite.getFileName() + textColors.getAnsiCode(""));
        fileForWrite.fileIO(false, new ArrayList<>(filteredRunners));

        if (selectItem == 5) {// Displaying the search time
            fileForRead.setFileName("\\src\\Reports\\search-time.txt",false);
        } else {// Displaying the occurrence time
            fileForRead.setFileName("\\src\\Reports\\occurrence-time.txt",false);
        }

        fileForRead.fileIO(true, null);
    }
    private static void findAndPrintFastestSlowestTime(ArrayList<Runner> listRunners, int selectItem) throws IOException {
/*
        Usually, I use two algorithms to find Min or Max values - the iterative method
        or the sorting method. Honestly, I prefer the sorting method and almost
        always design applications to be able to use this particular algorithm
*/
        ArrayList<Runner> needsRunner = new ArrayList<>();

        if (selectItem == 3) { //Find the fastest time
            needsRunner.add(listRunners.get(listRunners.size() - 1));
            System.out.println(textColors.getAnsiCode("Aqua") + "Printing and displaying the fastest time" + textColors.getAnsiCode(""));
            fileForWrite.setFileName("\\src\\Reports\\fastest-time.txt",true);
        } else { //Find the slowest time
            needsRunner.add(listRunners.get(0));
            System.out.println(textColors.getAnsiCode("Aqua") + "Printing and displaying the slowest time" + textColors.getAnsiCode(""));
            fileForWrite.setFileName("\\src\\Reports\\slowest-time.txt",true);
        }

        System.out.println(textColors.getAnsiCode("Yellow") + "Your data have been written to the file " + textColors.getAnsiCode("Green") + fileForWrite.getFileName() + textColors.getAnsiCode(""));
        fileForWrite.fileIO(false, needsRunner);

        if (selectItem == 3) { //Displaying the fastest time
            fileForRead.setFileName("\\src\\Reports\\fastest-time.txt",false);
        } else { //Displaying the slowest time
            fileForRead.setFileName("\\src\\Reports\\slowest-time.txt",false);
        }

        fileForRead.fileIO(true, null);
    }

    private static void sortAndPrintRecordedTimes(ArrayList<Runner> listRunners) throws IOException {
        //We already have a right sorted list
        System.out.println(textColors.getAnsiCode("Aqua") + "Printing and displaying the sorted Runners list" + textColors.getAnsiCode(""));
        fileForWrite.setFileName("\\src\\Reports\\sorted-list.txt",true);
        fileForWrite.fileIO(false, listRunners);
        System.out.println(textColors.getAnsiCode("Yellow") + "Your data have been written to the file " + textColors.getAnsiCode("Green") + fileForWrite.getFileName() + textColors.getAnsiCode(""));
        fileForRead.setFileName("\\src\\Reports\\sorted-list.txt", false);
        fileForRead.fileIO(true, null);
    }

    public static void readAndDisplayFile() throws IOException {
        System.out.println(textColors.getAnsiCode("Aqua") + "Displaying the original Runners list" + textColors.getAnsiCode(""));
        fileForRead.setFileName("\\src\\Data\\race-results-1.txt", true);
        fileForRead.fileIO(true, null);
    }
}
