import java.time.LocalDate;

public class Goal {
    LocalDate deadline;
    String name;
    int premium;

    public Goal(int year, int month, int dayOfMonth, String name, int premium) {
        this.deadline = LocalDate.of(year, month, dayOfMonth);
        this.name = name;
        this.premium = premium;
    }
}
