// Rule 08 OBJ01-J
// Limit accessibility of fields

public class R08_OBJ01_J {

    // Noncompliant code
    public int accountBalance = 1000;

    // Compliant code
    private int safeBalance = 1000;

    public int getSafeBalance() {
        return safeBalance;
    }

    public void setSafeBalance(int safeBalance) {
        if (safeBalance >= 0) {
            this.safeBalance = safeBalance;
        }
    }

    public static void main(String[] args) {
        R08_OBJ01_J obj = new R08_OBJ01_J();

        obj.accountBalance = -500; // bad: directly changes public field
        System.out.println("Noncompliant balance: " + obj.accountBalance);

        obj.setSafeBalance(500);
        System.out.println("Compliant balance: " + obj.getSafeBalance());
    }
}
