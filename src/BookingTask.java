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
        int count = 3;

        while(count > 0){

            int row = rand.nextInt(theater.rows);
            int col = rand.nextInt(theater.cols);

            System.out.println(username + " trying seat " + row + "," + col);

            boolean val = theater.bookSeat(row, col, username);

            if(val){
                return; // success → stop
            }

            count--; // decrease attempts
        }

        System.out.println(username + " could not book any seat");
    }
}