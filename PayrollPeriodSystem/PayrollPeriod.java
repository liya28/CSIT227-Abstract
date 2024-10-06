package PayrollPeriodSystem;

public abstract class PayrollPeriod
{
    private int currentPeriodNumber;

    public PayrollPeriod(int currentPeriodNumber)
    {
        this.currentPeriodNumber = currentPeriodNumber;
    }

    public int getCurrentPeriodNumber()
    {
        return currentPeriodNumber;
    }

    public abstract int getDaysRemainingUntilPayday();
    public abstract int getTotalPaydaysInYear();
}
