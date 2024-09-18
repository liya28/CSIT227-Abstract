import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class SemestralSchedule extends ScheduleStructure
{
    private LocalDate[][] pairs;
    private LocalDate currentDate;
    private int currentPeriodNumber;

    public SemestralSchedule(LocalDate currentDate, LocalDate sem1Start, LocalDate sem1End, LocalDate sem2Start, LocalDate sem2End, int currentPeriod)
    {
        super(currentPeriod);
        pairs = new LocalDate[2][2];
        this.pairs[0][0] = sem1Start;
        this.pairs[0][1] = sem1End;
        this.pairs[1][0]  = sem2Start;
        this.pairs[1][1]  = sem2End;
 
        this.currentDate = currentDate;
    }
    
    public int getDaysRemaining()
    {
        int daysRemaining;
        
        int currentPeriodNumber = super.getCurrentPeriodNumber();
        
        if (currentPeriodNumber == 1)
        {
            daysRemaining = (int)ChronoUnit.DAYS.between(this.currentDate, this.pairs[0][1]);
        }
        else 
        {
            daysRemaining = (int)ChronoUnit.DAYS.between(this.currentDate, this.pairs[1][1]);
        }
        
        return daysRemaining;
    }
    
    public int getDaysUntilNextPeriod()
    {
        int daysRemaining;
        
        int currentPeriodNumber = super.getCurrentPeriodNumber();
        
        if (currentPeriodNumber == 1)
        {
            daysRemaining = (int)ChronoUnit.DAYS.between(this.currentDate, this.pairs[1][0]);
        }
        else 
        {
            daysRemaining = (int)ChronoUnit.DAYS.between(this.currentDate, this.pairs[0][0]) + 365;
        } 
        
        return daysRemaining;
    }
}
