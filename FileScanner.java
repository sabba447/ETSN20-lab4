import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) {
        String command = args[0];
        String wordToFind = args[1];
        String filePath = args[2];

        switch (command) {
            case "search":
                try {
                    File file = new File(filePath);

                    Scanner scanner = new Scanner(file);

                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        if (line.contains(wordToFind)) {
                            System.out.println(line);
                        }
                    }

                    scanner.close();

                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                break;

            default:
                System.out.println("Command " + command + " not recognised.");
                break;
        }

    }
}