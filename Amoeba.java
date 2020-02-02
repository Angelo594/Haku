public class Amoeba{

    private boolean female = true;
    private int size = 1;
    Amoeba amoeba;

    public Amoeba(boolean female){
        this.female = female;
        size = 1;
    }

    public boolean isFemale(){
        return female;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int input){
        size = input;
    }

    public Amoeba feed(){
        size++;
        return this.amoeba;
    }

    public Amoeba hunger(){
        if(size > 1){
            this.size = size - 1;
        }
        return this.amoeba;

    }

    public Amoeba split(){
        if(size < 5){

            return null;
            
        }
        else{
            Amoeba amoeba2 = new Amoeba(female);
            amoeba2.size = this.size/2;
            this.size = this.size - amoeba2.size;
            return amoeba2;
        }
        
    }

    public Amoeba join(Amoeba other){
        if(this.female == other.female || this.getSize() == other.getSize()){

            return null;
        }

         else{

            Amoeba kind = new Amoeba(female);
            if(this.size > other.size){
                kind.female = this.female;
            }
            if(this.size < other.size){
                kind.female = other.female;
            }
            kind.size = 1;       
            
            return kind; 
        }
    }

    public Amoeba attack(Amoeba other){
        if((this.female == false) && (other.female == false) && this.size != other.size){
            if(this.size > other.size){
                this.size = this.size +(other.size-1);
                other.size = 1;
            }
            if(this.size < other.size){
                other.size = other.size + (this.size-1);
                this.size = 1;
            }
            return other;   
        }
        else{
            return null;
        }
        
    }
}
