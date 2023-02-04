public class SalaryWorker extends Worker
{
    double annualSalary;

    public SalaryWorker(String IDNum, String firstName, String lastName, String title, int YOB, double annualSalary) {
        super(IDNum, firstName, lastName, title, YOB, annualSalary);
        this.annualSalary = annualSalary;
    }



    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return (this.annualSalary/52)*(hoursWorked/40);

    }

    String display;
    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        display = String.format("Weekly pay: $%.2f\nAnnual salary $%.2f", weeklyPay, annualSalary);
        return display;
    }

}
