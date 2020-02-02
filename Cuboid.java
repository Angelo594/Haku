public class Cuboid{
   
    private double a;
    private double b;
    private double c;
    private static int count;

    public Cuboid(){
       a = b = c = 1.0;
       count = count + 1;
    }

    public Cuboid(double l){
        this.a = l;
        this.b = l;
        this.c = l;
        count = count + 1;
    }

    public Cuboid(double a, double b, double c){

        if(a > b && a > c){
            this.a = a;

            if(b > c ){
                this.b = b;
                this.c = c;

            }
            else{
                this.b = c;
                this.c = b;
            }
        }
        else if(b > c){

                this.a = b;

                if(a < c){
                    
                    this.b = c;
                    this.c = a;
                }

                else{
                    this.a = b;
                    this.c = c;
                }
        }

        else{

            this.a = c;

            if(b < a){

                this.b = a;
                this.c = b;  
            }

            else{

                this.b = b;
                this.c = a;
            }
        }
        count = count + 1;
        }

    public Cuboid(Cuboid copy){
        
        this.a = copy.a;
        this.b = copy.b;
        this.c = copy.c;
        count = count + 1;
    }

    public double get_A(){
        return a;
    }

    public double get_B(){
        return b;
    }

    public double get_C(){
        return c;
    }

    public boolean isCube(){
        return this.get_A() == this.get_B() && this.get_B() == this.get_C();
    }

    public double getVolume(){
        return this.get_A() * this.get_B() * this.get_C();
    }

    public boolean hasSameVolume(Cuboid cub){
        return this.getVolume() == cub.getVolume();
    }

    public boolean isSame(Cuboid cub){
        return this.get_A() == cub.get_A() && this.get_B() == cub.get_B() && this.get_C() == cub.get_C();
    }

    public boolean fitsInto(Cuboid cub){
        return this.a < cub.a && this.b < cub.b && this.c < cub.c;
    }

    static int get_Count(){
        return count;
    }

    }
