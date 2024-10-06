package PayrollPeriodSystem;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Enter payroll type (Weekly, BiWeekly, Monthly): ");
        String type = sc.nextLine();

        System.out.print("Enter current date (yyyy-MM-dd): ");
        String date = sc.nextLine();
        LocalDate currentDate = LocalDate.parse(date, formatter);

        PayrollPeriod payrollPeriod = null;

        switch(type)
        {
            case "Weekly":
                System.out.print("Enter first payday of the year: ");
                String firstPaydayWeekly = sc.nextLine();
                LocalDate firstPaydayWeeklyDate = LocalDate.parse(firstPaydayWeekly, formatter);

                System.out.print("Enter current period number: ");
                int currentPeriodNumber = sc.nextInt();

                payrollPeriod = new WeeklyPayroll(currentDate, firstPaydayWeeklyDate, currentPeriodNumber);
                break;

            case "BiWeekly":
                System.out.print("Enter first payday of the year: ");
                String firstPaydayBiWeekly = sc.nextLine();
                LocalDate firstPaydayBiWeeklyDate = LocalDate.parse(firstPaydayBiWeekly, formatter);

                System.out.print("Enter current period number: ");
                currentPeriodNumber = sc.nextInt();

                payrollPeriod = new BiWeeklyPayroll(currentDate, firstPaydayBiWeeklyDate, currentPeriodNumber);
                break;

            case "Monthly":
                System.out.print("Enter current month number: ");
                int currentMonthNumber = sc.nextInt();

                payrollPeriod = new MonthlyPayroll(currentDate, currentMonthNumber);
                break;

            default:
                System.out.println("Invalid payroll type");
                System.exit(0);
        }

        if (payrollPeriod != null)
        {
            System.out.println("Payroll type: " + type);
            System.out.println("Next payday is in " + payrollPeriod.getDaysRemainingUntilPayday() + " days.");
            System.out.println("There are " + payrollPeriod.getTotalPaydaysInYear() + " total paydays in the year.");
        }

        sc.close();
    }
}
