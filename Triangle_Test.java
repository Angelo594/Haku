public class Triangle_Test{

    public static void main(String[] args){


        int n = In.readInt();

        Triangle_New t1 = new Triangle_New(n);
        while(n <= 0 || n % 2 == 0){
            n = In.readInt();
            t1 = new Triangle_New(n);
        }
        
        t1.display_triangle();
        System.out.println(" ");
        System.out.println("Anzahl der Sterne: "+t1.calculate_stars());
        System.out.println("Anzahl der Punkte: "+t1.calculate_dots());
        t1.display_tree();
        System.out.println(" ");

        System.out.println("Aendern der Laenge von Triangle: ");
        int m = In.readInt();

        t1.set_length(m);
        t1.display_triangle();
        System.out.println(" ");
        System.out.println("Anzahl der Sterne: "+t1.calculate_stars());
        System.out.println("Anzahl der Punkte: "+t1.calculate_dots());
        t1.display_tree();

    }
}