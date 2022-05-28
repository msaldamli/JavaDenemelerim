import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy , kilo ,index;
        Scanner scanner = new Scanner(System.in);

        System.out.println("kilonuzu giriniz : ");
        kilo = scanner.nextDouble();
        System.out.println("boyunuzu giriniz : ");
        boy = scanner.nextDouble();

        index = kilo/(boy*boy);

        System.out.println("vücut kitle indexiniz : "+ index);



    }
    
}
