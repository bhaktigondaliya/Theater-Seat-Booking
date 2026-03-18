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
            System.out.println("[" + username + "] booked seat (" + row + "," + col + ")");
            seats[row][col] = true;
            return true;
        } 
        else{
            System.out.println("[" + username + "] failed git  seat already booked (" + row + "," + col + ")");
            return false;
        }
    }

    void displaySeats(){
        System.out.println("\nFinal Seat Status:");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(seats[i][j]){
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}