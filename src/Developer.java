import java.util.ArrayList;

public class Developer extends Employee {
    ArrayList<Technology> assignedTechnologies = new ArrayList<>();

    public Developer(String fname, String lname, String address, String email, String pesel, int yearEmployed) {
        super(fname, lname, address, email, pesel, yearEmployed);
    }

    void addTechnology(Technology technology) {
        assignedTechnologies.add(technology);
    }
}
