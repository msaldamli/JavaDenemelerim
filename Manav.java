import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        System.out.println("Armut : 2,14");
        double armut = 2.14 , a;
        System.out.println("Elma : 3,67");
        double elma =3.67,e;
        System.out.println("Domatez : 1,11");
        double Domatez  = 1.11,d;
        System.out.println("Muz : 0,95");
        double muz = 0.95 ,m;
        System.out.println("Patlican : 5,00");
        double Patlican  = 5.00,p;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kaç kilo");
        a= scanner.nextDouble();

        System.out.println("Elma kaç kilo");
        e = scanner.nextDouble();

        System.out.println("Domatez kaç kilo");
        d= scanner.nextDouble();

        System.out.println("Muz kaç kilo");
        m = scanner.nextDouble();

        System.out.println("Patlicankaç kilo");
        p = scanner.nextDouble();

        System.out.println("Toplam tutar :"+ ((armut*a) + ( elma *e) + (Domatez*d) + (muz*m) + (Patlican*p) ) );
        


    }
    
}
