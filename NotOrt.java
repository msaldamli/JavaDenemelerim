import java.util.Scanner;

/*Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak... */



public class NotOrt {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        double ortalama;
        
        Scanner input = new Scanner(System.in);

        System.out.println("matematik notunu giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.println("Kimya notunu giriniz");
        kimya= input.nextInt();

        System.out.println("Turkce notunu giriniz : ");
        turkce= input.nextInt();

        System.out.println("Tarih notunu giriniz : ");
        tarih= input.nextInt();

        System.out.println("Muzik notunu giriniz : ");
        muzik= input.nextInt();

        ortalama =(mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Ortalamanız : "+ ortalama);

        boolean kosul =ortalama >= 60;
        String sonuc= kosul ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.print(sonuc);

        

    }
    
}
