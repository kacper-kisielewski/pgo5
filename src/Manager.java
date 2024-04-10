import java.time.LocalDate;
import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Goal> assignedGoals = new ArrayList<>();

    public Manager(String fname, String lname, String address, String email, String pesel, int yearEmployed) {
        super(fname, lname, address, email, pesel, yearEmployed);
    }

    void addGoals(Goal goal) {
        assignedGoals.add(goal);
    }

    static int getCurrentMonth() {
        return LocalDate.now().getMonthValue();
    }

    @Override
    int calculateSalary() {
        return super.calculateSalary() +
                assignedGoals.stream()
                        .mapToInt(obj -> obj.date.getMonthValue() == getCurrentMonth() ? obj.premium : 0)
                        .sum();
    }
}
