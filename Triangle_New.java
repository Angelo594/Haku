public class Triangle_New{

    private int length;
    private int lines;
    private int stars;
    private int dots;
    private int tree_trunk;


    public Triangle_New(int length){
        this.set_length(length);
        
    }
    public int get_length(){
        return length;
    }

    public int get_lines(){
        return lines;
    }

    public int get_stars(){
        return stars;
    }

    public int get_dots(){
        return dots;
    }

    public int get_tree_trunk(){
        return tree_trunk;
    }
    
    public int calculate_lines(){
        lines = (length/2)+1;
        return lines;
    }

    public int calculate_stars(){
        int x = length;
        int stars = 0;
        for (int k = 0; k < lines; k++){

            stars = stars + x;
            x = x -2;
        }
        return stars;
    }

    public int calculate_dots(){
        int z = length - 1;
        int dots = 0;

        for(int r = 0; r < lines; r++){
            dots = dots + z;
            z = z - 2;
        }
        return dots;
    }

    public void set_length(int l){
        
        if(l <= 0 || l % 2 == 0 ){

            System.out.println("Bitte ungerade Zahl groeßer 0.");
            this.length = 0;
            this.lines = 0;
            this.stars = 0;
            this.dots = 0;
            this.tree_trunk = 0;
        }

        else{

            this.length = l;
            this.lines = calculate_lines();
            this.stars = calculate_stars();
            this.dots = calculate_dots();
            this.tree_trunk = lines/2;
        }
    }


    public void display_triangle(){
        
        lines = (length/2) + 1;
        stars = 1;
        dots = (length-1) /2;
        
        if(length >= 0 && length % 2 != 0){
           
    
            for(int s = 0; s < lines; s++){
               
            
                for(int i = 0; i < dots; i++){
        
                System.out.print(".");
                }
        
            
                for(int j = 0; j < stars; j++){
                    
                System.out.print("*");
                }
        
            
                for(int z = 0; z < dots; z++){
        
                System.out.print(".");
                }
        
                System.out.println(" ");
                dots = dots - 1;
                stars = stars + 2;
                }
            }
        }


public void display_tree(){

 tree_trunk = 1;
int tree_absatz = lines / 2;
int punkt_t = (length-1)/2;

display_triangle();

    for(int z = 0; z < tree_absatz; z++){

        for(int y = 0; y < punkt_t; y++ ){
            System.out.print(".");
        }
        
        for(int g = 0; g < tree_trunk; g++){
            System.out.print("*");
        }

        for(int p = 0; p < punkt_t; p++){
            System.out.print(".");
        }

        System.out.println(" ");
    }

            
            


}
}
