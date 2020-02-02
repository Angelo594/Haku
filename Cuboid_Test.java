public class Cuboid_Test{
    public static void main(String[] args){

        Cuboid cuboid1, cuboid2, cuboid3, cuboid4;

        cuboid1 = new Cuboid(1.5, 2.5, 3.5);
        cuboid2 = new Cuboid(1.4, 2.4, 3.4);
        cuboid3 = new Cuboid(cuboid1);
        cuboid4 = new Cuboid(4.0);

        System.out.println(" ");

        System.out.println("Der Quader ist ein Wuerfel:" +cuboid1.isCube());
        System.out.println("Der Quader ist ein Wuerfel:" +cuboid4.isCube());

        System.out.println("Die beiden Quader haben gleiches Volumen:" +cuboid1.hasSameVolume(cuboid2));
        System.out.println("Die beiden Quader haben gleiches Volumen:" +cuboid1.hasSameVolume(cuboid3));

        System.out.println("Die beiden Quader sind gleich:" +cuboid1.isSame(cuboid2));
        System.out.println("Die beiden Quader sind gleich:" +cuboid1.isSame(cuboid3));

        System.out.println("Der erste Quader passt in den Zweiten:" + cuboid1.fitsInto(cuboid2));
        System.out.println("Der erste Quader passt in den Zweiten:" + cuboid1.fitsInto(cuboid3));

        System.out.println("Anzahl der erstellten Quader:" +Cuboid.get_Count());
    }
}