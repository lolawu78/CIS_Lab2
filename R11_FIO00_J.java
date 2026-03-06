// Rule 11 FIO00-J
// Do not operate on files in shared directories without proper checks

import java.io.File;
import java.io.IOException;

public class R11_FIO00_J {

    public static void main(String[] args) throws IOException {

        // Noncompliant code
        File tempFileBad = new File("/tmp/mytempfile.txt");
        System.out.println("Noncompliant file path: " + tempFileBad.getPath());

        // Compliant code
        File tempFileGood = File.createTempFile("secureFile", ".txt");
        System.out.println("Compliant temp file path: " + tempFileGood.getPath());

        tempFileGood.deleteOnExit();
    }
}
