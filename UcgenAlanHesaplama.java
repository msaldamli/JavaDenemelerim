import java.util.Scanner;

/* Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

*/



public class UcgenAlanHesaplama {
    public static void main(String[] args) {

    int kenar1,kenar2,kenar3;

    Scanner scanner = new Scanner(System.in);


    System.out.println("1. kenari giriniz : ");
    kenar1 = scanner.nextInt();
    System.out.println("2. kenari girniz : ");
    kenar2 = scanner.nextInt();
    System.out.println("3. kenari giriniz :");
    kenar3 = scanner.nextInt();

    double u = (kenar1 + kenar2 + kenar3)/2;

    double alan = u*(u-kenar1)*(u-kenar2)*(u-kenar3);

    alan = Math.sqrt(alan);
    System.out.println("Ucgnin alani : "+ alan);

    





        
    }
    
}
