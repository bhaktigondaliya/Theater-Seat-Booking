import java.util.Random;

public class BookingTask implements Runnable {

    Theater theater;
    String username;

    BookingTask(Theater theater, String username){
        this.theater = theater;
        this.username = username;
    }

    public void run(){

        Random rand = new Random();
        int attempts = 3;

        while(attempts > 0){

            int row = rand.nextInt(theater.rows);
            int col = rand.nextInt(theater.cols);

            System.out.println("[" + username + "] trying seat (" + row + "," + col + ")");

            boolean success = theater.bookSeat(row, col, username);

            if(success){
                return; // stop if booked
            }

            attempts--;
        }

        System.out.println("[" + username + "] could not book any seat");
    }
}