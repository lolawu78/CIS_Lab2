// Rule 07 ERR00-J
// Do not suppress or ignore checked exceptions

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class R07_ERR00_J {

    public static void main(String[] args) {

        // Noncompliant code
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            // ignored
        }

        // Compliant code
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
