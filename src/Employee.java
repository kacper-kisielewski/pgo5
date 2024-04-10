import java.time.LocalDate;

public class Employee {
    static int baseSalary = 3000;
    static int everyYearEmployedPremium = 1000;
    String fname;
    String lname;
    String address;
    String email;
    String pesel;
    int yearEmployed;

    public Employee(String fname, String lname, String address, String email, String pesel, int yearEmployed) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearEmployed = yearEmployed;
    }

    static int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    int calculateSalary() {
        return baseSalary + (getCurrentYear() - yearEmployed) * everyYearEmployedPremium;
    }
}