// Rule 09 THI00-J
// Do not call overridable methods from constructors

public class R09_THI00_J {

    static class Parent {
        Parent() {
            // Noncompliant code
            display();
        }

        void display() {
            System.out.println("Parent display");
        }
    }

    static class Child extends Parent {
        private String message = "Child initialized";

        @Override
        void display() {
            System.out.println(message);
        }
    }

    static class SafeParent {
        SafeParent() {
            initialize();
        }

        private void initialize() {
            System.out.println("Safe constructor work");
        }
    }

    static class SafeChild extends SafeParent {
        private String message = "Safe child initialized";

        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        System.out.println("Noncompliant example:");
        new Child();

        System.out.println("Compliant example:");
        SafeChild safe = new SafeChild();
        safe.display();
    }
}
