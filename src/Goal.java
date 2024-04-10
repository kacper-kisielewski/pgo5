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

    static int getCurrentMonth() {
        return LocalDate.now().getMonthValue();
    }

    static int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    boolean isAchievedThisMonth() {
        return (date.getYear() == getCurrentYear()) && (date.getMonthValue() == getCurrentMonth());
    }
}