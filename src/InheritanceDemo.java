import java.util.ArrayList;
import java.text.DecimalFormat;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        //creating new workers and adding them
        Worker worker1 = new Worker("000001", "Sammy", "Johnson", "Mr", 2002, 20);
        workers.add(worker1);
        Worker worker2 = new Worker("000002", "Sarah", "Johnson", "Mr", 2000, 30);
        workers.add(worker2);
        Worker worker3 = new Worker("000003", "John", "Johnson", "Esq", 2001, 35);
        workers.add(worker3);
        //creating salary workers and adding them to workers arraylist
        SalaryWorker salaryWorker1 = new SalaryWorker("12345", "Mike", "Johnson", "Mr", 1990, 50000);
        workers.add(salaryWorker1);
        SalaryWorker salaryWorker2 = new SalaryWorker("12342", "Mack", "Johnson", "Mr", 1995, 60000);
        workers.add(salaryWorker2);
        SalaryWorker salaryWorker3 = new SalaryWorker("12443", "Alex", "Johnson", "Mr", 1999, 75000);
        workers.add(salaryWorker3);

        int[] workingHours = {40, 50, 40};
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.println("Week\tWorker\t    WeeklyPay");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (Worker worker : workers) {

                double weeklyPay = worker.calculateWeeklyPay(workingHours[i]);
                System.out.println((i + 1) + "\t"+"\t"
                        + worker.getFirstName() +"\t"+"\t$" +decimalFormat.format(weeklyPay));

            }


        }
    }
}