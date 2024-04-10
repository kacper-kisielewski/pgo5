import java.util.ArrayList;

public class Tester extends Employee {
    ArrayList<String> assignedTests = new ArrayList<>();

    public Tester(String fname, String lname, String address, String email, String pesel, int yearEmployed) {
        super(fname, lname, address, email, pesel, yearEmployed);
    }

    void addTestType(String testType) {
        assignedTests.add(testType);
    }
}
