package PayrollPeriodSystem;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WeeklyPayroll extends PayrollPeriod
{
    private LocalDate currentDate;
    private LocalDate firstPaydayOfYear;
    private final int DAYS_IN_WEEK = 7;

    public WeeklyPayroll(LocalDate currentDate, LocalDate firstPaydayOfYear, int currentPeriodNumber)
    {
        super(currentPeriodNumber);
        this.currentDate = currentDate;
        this.firstPaydayOfYear = firstPaydayOfYear;
    }

    public int getDaysRemainingUntilPayday()
    {
        long daysPassed = ChronoUnit.DAYS.between(firstPaydayOfYear, currentDate);
        int daysSinceLastPayday = (int)(daysPassed % DAYS_IN_WEEK);
        if (daysSinceLastPayday == 0) return 0;
        else return DAYS_IN_WEEK - daysSinceLastPayday;
    }

    public int getTotalPaydaysInYear()
    {
        return 52;
    }
}
