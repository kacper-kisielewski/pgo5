import java.time.LocalDate;

public class Goal {
    LocalDate date;
    String name;
    int premium;

    public Goal(int year, int month, int dayOfMonth, String name, int premium) {
        this.date = LocalDate.of(year, month, dayOfMonth);
        this.name = name;
        this.premium = premium;
    }
}
