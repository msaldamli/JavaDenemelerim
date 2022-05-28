import java.util.Scanner;

/*
Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)


*/

public class UcgendeHipotenusBulma {
    public static void main(String[] args) {

        int kenarA,kenarB;
        double hipotenus;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenari giriniz : ");
        kenarA = scanner.nextInt();

        System.out.println("ikinci  kenari giriniz : ");

        kenarB = scanner.nextInt();
        hipotenus =  (kenarA*kenarA)+(kenarB*kenarB);
        hipotenus = Math.sqrt(hipotenus);

        System.out.println("Hipotenusun uzunlugu : "+ hipotenus);



        
        
    }
    
}
