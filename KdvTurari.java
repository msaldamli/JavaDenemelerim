import java.util.Scanner;

/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li 
fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
 tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

*/


public class KdvTurari {
    public static void main(String[] args) {
        double kdv1 = 0.18 , kdv2 = 0.08 , girdi ,kdv;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tutari giriniz : ");
        girdi = scanner.nextDouble();

        System.out.println("Kdv'siz fiyat : "+ girdi);

        if(girdi < 1000){
            kdv = girdi * kdv1;
            System.out.println("Kdv'li fiyat : "+ (girdi+kdv));
            System.out.println("Kdv Tutari : "+ kdv);


        }
        else{
            kdv = girdi * kdv2;
            System.out.println("Kdv'li fiyat : "+ (girdi+kdv));
            System.out.println("Kdv Tutari : "+ kdv);

        }


        

        
    }
    
}
