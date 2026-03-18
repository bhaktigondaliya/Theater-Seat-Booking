public class Main {

    public static void main(String[] args) throws InterruptedException {

        Theater theater = new Theater(3, 3);

        BookingTask t1 = new BookingTask(theater, "User1");
        BookingTask t2 = new BookingTask(theater, "User2");
        BookingTask t3 = new BookingTask(theater, "User3");

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        Thread th3 = new Thread(t3);

        th1.start();
        th2.start();
        th3.start();

        // wait for all threads to finish
        th1.join();
        th2.join();
        th3.join();

        // display final seats
        theater.displaySeats();
    }
}