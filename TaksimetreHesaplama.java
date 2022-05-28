import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        double perKm =2.20,total = 10;

        Scanner scanner = new Scanner(System.in);

        System.out.println("kilometreyi giriniz :");
        double km= scanner.nextDouble();

        total += (perKm*km);
        
        total= (total<20) ? 20 : total;

        System.out.println("Ödenecek olan tutar : "+ total);


        
    }
    
}
