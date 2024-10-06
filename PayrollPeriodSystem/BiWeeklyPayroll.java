package PayrollPeriodSystem;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BiWeeklyPayroll extends PayrollPeriod
{
    private LocalDate currentDate;
    private LocalDate firstPaydayOfYear;
    private final int DAYS_IN_BI_WEEK = 14;

    public BiWeeklyPayroll(LocalDate currentDate, LocalDate firstPaydayOfYear, int currentPeriodNumber)
    {
        super(currentPeriodNumber);
        this.currentDate = currentDate;
        this.firstPaydayOfYear = firstPaydayOfYear;
    }

    public int getDaysRemainingUntilPayday()
    {
        long daysPassed = ChronoUnit.DAYS.between(firstPaydayOfYear, currentDate);
        int daysSinceLastPayday = (int)(daysPassed % DAYS_IN_BI_WEEK);

        if (daysSinceLastPayday == 0) return 0;
        else return DAYS_IN_BI_WEEK - daysSinceLastPayday;
    }
    public int getTotalPaydaysInYear()
    {
        return 26;
    }
}
