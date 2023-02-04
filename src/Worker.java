public class Worker extends Person {

    double hourlyPayRate;
    double regularPay;
    double overtimePay; ;
    double totalPay;
    String Display;

    public double calculateWeeklyPay(double hoursWorked)
    {

        if( hoursWorked <= 40)
        {
            regularPay = 40 * hourlyPayRate;
        }
        else {
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);

        }
        totalPay = overtimePay + regularPay;
       return totalPay;
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        if( hoursWorked > 40)
        {
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
        }
        regularPay = 40 * hoursWorked;
        totalPay = overtimePay + regularPay;
        Display = String.format("Regular Hours : %.2f\nRegular Pay: $%.2f\nOvertime Hours: %.2f\nTotal Pay: %.2f", hoursWorked
                , regularPay,overtimePay,totalPay);
        return Display;
    }

    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }


}

