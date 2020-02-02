

public class Ticketmaschine {
    public int ticketPrice = 20;
    public int alreadyPaid = 0;
    public int totalSum = 0;
  
    public int amount;
    

    public Ticketmaschine(int ticketPrice){
        ticketPrice = 20;
        alreadyPaid = get_alreadyPaid();
        totalSum = get_totalSum();

         
        
    }
    public void insertMoney(int amount){
      amount = In.readInt();
      this.amount = amount;
        
    }

    public int get_alreadyPaid(){
        return alreadyPaid;
    }

    public int get_totalSum(){
        return totalSum;
    }





public void printTicket(){
    
    if(alreadyPaid >= ticketPrice){
            System.out.println("###################");
            System.out.println("#Erstsemesterfeier#");
            System.out.println("##### " + ticketPrice + " Cent #####");
            System.out.println("###################");
            System.out.println(" ");
            alreadyPaid = alreadyPaid - ticketPrice ;
            totalSum = totalSum + ticketPrice;     
    }
    
}
public String resetalreadyPaid(){ 
    
    String s = "Restbetrag: " + alreadyPaid + " Cent";
    String r = "Gesamtsumme: " + totalSum + " Cent";
    System.out.println(s);
    System.out.println(r);
    alreadyPaid = 0;
    return s + r; 
    
}

    public void processTicket(){
      
        char decision;

    insertMoney(amount);
    alreadyPaid = amount;
   
    
        
        
            do{
                
                while (alreadyPaid < ticketPrice){
                System.out.print("Aktuelles Guthaben ist ungenuegend: " + alreadyPaid + " Cent. Bitte mindestens weitere " + (ticketPrice-alreadyPaid) + " Cent einwerfen:");
                int nachwurf = In.readInt();
                alreadyPaid = alreadyPaid + nachwurf;
                }   

                printTicket();

                System.out.println("Wollen Sie weitere Tickets? <j/n>");
                decision = In.readChar();

        
                }

                 while(decision == 'j' );

                 resetalreadyPaid();
         
            
             }

                
        

    

        
    
    }

