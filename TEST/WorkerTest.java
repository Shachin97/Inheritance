public class WorkerTest

{
    public static void main(String[] args) {
        Worker worker = new Worker("000001", "JOHN","Cena", "MR",
                2002, 20);
        System.out.println(worker.displayWeeklyPay(50));
    }
}
