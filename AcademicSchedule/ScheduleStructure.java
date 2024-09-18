abstract class ScheduleStructure
{
    private int currentPeriodNumber;
    
    public ScheduleStructure(int currentPeriodNumber)
    {
        this.currentPeriodNumber = currentPeriodNumber;
    }
    
    int getCurrentPeriodNumber()
    {
        return currentPeriodNumber;
    }
    
    public abstract int getDaysRemaining();
    public abstract int getDaysUntilNextPeriod();
}
