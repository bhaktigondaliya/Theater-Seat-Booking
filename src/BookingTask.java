public class BookingTask implements Runnable {
   Theater theater;
   int row;
   int col;
   String username;

    BookingTask(Theater theater, int row, int col, String username){
        this.theater = theater;
        this.row= row;
        this.col = col;
        this.username = username;

    }

    public void run(){
        System.out.println(username + " trying...");
        theater.bookSeat(row,col,username);
    }
    
}
