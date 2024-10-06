package PayrollPeriodSystem;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MonthlyPayroll extends PayrollPeriod
{
    private LocalDate currentDate;
    private LocalDate[] paydays;

    public MonthlyPayroll(LocalDate currentDate, int currentPeriodNumber)
    {
        super(currentPeriodNumber);
        this.currentDate = currentDate;
    }

    public int getDaysRemainingUntilPayday()
    {
        int payday = 25;
        LocalDate paydayDate;

        if (currentDate.getDayOfMonth() <= payday)
        {
            paydayDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth(), payday);
        }
        else
        {
            paydayDate = LocalDate.of(currentDate.getYear(), currentDate.getMonth().plus(1), payday);
        }

        return (int) ChronoUnit.DAYS.between(currentDate, paydayDate);
    }

    public int getTotalPaydaysInYear()
    {
        return 12;
    }
}
