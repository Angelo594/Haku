public class Quersumme_Rek{

    public static void main(String[] args){
       
       
       int m = In.readInt();

        if(m <= 0 ){

            System.out.println("Bitte eine Zahl groesser 0 eingeben.");
            
        }

        else{
            System.out.println("Positive ganze Zahl:" +m);
            System.out.print("Die Quersumme ergibt sich aus:");
            System.out.print( " " + "=" + " " +berechne(m));

           
        }

    }
    public static int berechne (int n){


        if (n > 9){ 
            System.out.print(" " + n%10 + " " + "+" + " ");
             return n = (n % 10) + berechne(n/10);
             
        }

        else{
            System.out.print(+n);
            return n;
        }
        

       
           
       }
    }







       
        

           

                 














    
