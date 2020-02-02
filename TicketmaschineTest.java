public class TicketmaschineTest {
    public static void main(String[] args){
        int ticketPrice = 20;

        System.out.print("Bitte Muenze einwerfen: ");

        Ticketmaschine test = new Ticketmaschine(ticketPrice);
        test.processTicket();
        
        
    }
}