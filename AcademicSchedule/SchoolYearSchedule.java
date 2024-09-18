import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class SchoolYearSchedule extends ScheduleStructure
{
    private LocalDate start;
    private LocalDate end;
    private LocalDate currentDate;
    
    public SchoolYearSchedule(LocalDate currentDate, LocalDate start, LocalDate end)
    {
        super(1);
        
        this.start = start;
        this.end= end;
        this.currentDate = currentDate;
    }
    
    public int getDaysRemaining()
    {
        int daysRemaining;
        
        daysRemaining = (int)ChronoUnit.DAYS.between(this.currentDate, this.end);
        
        return daysRemaining;
    }
    
    public int getDaysUntilNextPeriod()
    {
        int daysRemaining;
        
        daysRemaining = (int)ChronoUnit.DAYS.between(this.currentDate, this.start) + 365;
        
        return daysRemaining;
    }
}
