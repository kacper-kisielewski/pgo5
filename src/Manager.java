import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Goal> assignedGoals = new ArrayList<>();

    public Manager(String fname, String lname, String address, String email, String pesel, int yearEmployed) {
        super(fname, lname, address, email, pesel, yearEmployed);
    }

    void addGoals(Goal goal) {
        assignedGoals.add(goal);
    }

    int calculateGoalsPremium() {
        return assignedGoals.stream()
                .mapToInt(obj -> obj.isAchievedThisMonth() ? obj.premium : 0)
                .sum();
    }

    @Override
    int calculateSalary() {
        return super.calculateSalary() + calculateGoalsPremium();
    }
}