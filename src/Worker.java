public class Worker extends Person {

    double hourlyPayRate =0;
    public double calculateWeeklyPay(double hoursWorked)
    {

        double regularPay =0;
        double overtimePay=0;
        double totalPay =0 ;
        String Display ="";

        if( hoursWorked <= 40)
        {
            regularPay = hoursWorked * hourlyPayRate;
        }
        else {
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            regularPay =  hourlyPayRate * 40;
        }
        totalPay = overtimePay + regularPay;
        return totalPay;
    }
    public String displayWeeklyPay(double hoursWorked)

    {

        double regularPay =0;
        double overtimePay=0; ;
        double totalPay=0;
        String Display ="";

        if( hoursWorked > 40)
        {
            overtimePay = (hoursWorked - 40) * (hourlyPayRate * 1.5);
        }
        regularPay = 40 * hourlyPayRate;
        totalPay = overtimePay + regularPay;
        Display = String.format("Regular Hours : %.2f\nRegular Pay: $%.2f\nOvertime Hours: %.2f\nTotal Pay: %.2f", hoursWorked
                , regularPay,overtimePay,totalPay);
        return Display;
    }

    public Worker(String IDNum, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(IDNum, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

}