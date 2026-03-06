// Rule 02 XP00-J
// Do not ignore values returned by methods

import java.io.File;

public class R02_XP00_J {

    public static void deleteFile() {

        File someFile = new File("someFileName.txt");

        // Noncompliant code
        someFile.delete();

        // Compliant code
        if (!someFile.delete()) {
            System.out.println("Failed to delete file.");
        }
    }

    public static void main(String[] args) {
        deleteFile();
    }
}
