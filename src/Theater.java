class Theater{

    //Creating Theater
    boolean[][] seats; 
    int rows;
    int cols;
    int total_seat;
    
    //constructor
    Theater(int rows,int cols){
        this.rows = rows;
        this.cols = cols;
        seats = new boolean[rows][cols];
        total_seat = rows*cols;
    }

    synchronized void bookSeat(int row, int col, String username){

        if(seats[row][col] == false){
            System.out.println(username + " booked seat " + row + "," + col);
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {}
            
            seats[row][col] = true;

        }else{
            System.out.println(username + " failed, seat already booked " + row + "," + col);
        }
        try {
            Thread.sleep(100);
        }
        catch (Exception e) {}

    }


    


}