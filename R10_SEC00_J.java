// Rule 10 SEC00-J
// Do not hardcode sensitive information

public class R10_SEC00_J {

    public static void main(String[] args) {

        // Noncompliant code
        String hardcodedPassword = "MySecret123";
        System.out.println("Noncompliant password: " + hardcodedPassword);

        // Compliant code
        String envPassword = System.getenv("APP_PASSWORD");

        if (envPassword != null) {
            System.out.println("Compliant password loaded from environment variable.");
        } else {
            System.out.println("APP_PASSWORD not set.");
        }
    }
}
