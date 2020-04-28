public class Arena {

    private int ticketPrice;
    private int numberSeats;
    private int numberSeatsCL;
    private Ticketmaschine ticketmaschine;


    public int get_ticketPrice(){
        return ticketPrice;
    }

    public int get_numberSeats(){
        return numberSeats;
    }

    public int get_numberSeatsCL(){
        return numberSeatsCL;
    }

    public Arena(int ticketPrice){
        this.ticketPrice = ticketPrice;
    }

    public Arena( int ticketPrice, int numberSeats){
        this.ticketPrice = ticketPrice;
        this.numberSeats = numberSeats;
    }

       public Arena(int ticketPrice, int numberSeats, int numberSeatsCL){
        this.ticketPrice = ticketPrice;
        this.numberSeats = numberSeats;
        this.numberSeatsCL = numberSeatsCL;
    }

    public Arena(Arena r, int alreadyPaid, int totalSum){
        this.ticketPrice = r.ticketPrice;
        this.numberSeats = r.numberSeats;
        this.numberSeatsCL = r.numberSeatsCL;
        t1 = new Ticketmaschine(ticketPrice, alreadyPaid, totalSum);
    }

public void assignTicketmachine(Ticketmaschine ticketmaschine){

    if(ticketmaschine == null ){

    this.ticketmaschine = ticketmaschine;
    }

    else{
        
    }


}

}