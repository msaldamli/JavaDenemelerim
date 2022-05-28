import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        int sayi1 , sayi2 , islem ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("yapmak istediginiz islemi giriniz \n Toplama için : 1 \n Cikarma icin : 2 \n Carpma için : 3 \n Bölme icin : 4 ");

        islem = scanner.nextInt();

        System.out.println("birinci sayiyi giriniz :");
        sayi1 = scanner.nextInt();
        System.out.println("ikinci sayiyi giriniz :");
        sayi2 = scanner.nextInt();

        switch(islem){
            case 1:
            System.out.println("Sonuc : "+ (sayi1+sayi2));
            break;
            case 2:
            System.out.println("Sonuc : "+ (sayi1-sayi2));
            break;
            case 3:
            System.out.println("Sonuc : "+ (sayi1*sayi2));
            break;
            case 4:
            System.out.println("Sonuc : "+ (sayi1/sayi2));
            break;
            default:
            System.out.println("yanlis girdiniz !!!");
            break;
        }





    }
    
}
