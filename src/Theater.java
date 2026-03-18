class Theater{

    boolean[][] seats; 
    int rows;
    int cols;
    int total_seat;
    
    Theater(int rows,int cols){
        this.rows = rows;
        this.cols = cols;
        seats = new boolean[rows][cols];
        total_seat = rows * cols;
    }

    synchronized boolean bookSeat(int row, int col, String username){

        try {
            Thread.sleep(100); // simulate delay
        } catch (Exception e) {}

        if(seats[row][col] == false){
            System.out.println(username + " booked seat " + row + "," + col);
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {}
            
            seats[row][col] = true;
            return true;
        } 
        else{
            System.out.println(username + " failed, seat already booked " + row + "," + col);
            return false;
        }
    }
}