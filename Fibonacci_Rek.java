public class Fibonacci_Rek{
    public static void main(String[] args){

        int n = In.readInt();

        System.out.println(Fibonacci(n));

    
        }
    

    public static int Fibonacci( int s){
        if (s<0){
            return -1;
        }
        if(s == 0){
            return 0;
        }
        if(s == 1){
            return 1;
        }
        else{
            return Fibonacci(s-1) + Fibonacci(s-2);
        }
    }
}