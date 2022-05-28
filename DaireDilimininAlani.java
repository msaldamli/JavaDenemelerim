import java.util.Scanner;

/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
*/


public class DaireDilimininAlani {
    public static void main(String[] args) {
        double pi = 3.14;
        double yariCap , alan;
        int aci;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz : ");

        yariCap = scanner.nextDouble();

        System.out.println("Dairenin acisini giriniz : ");

        aci = scanner.nextInt();

        alan = (pi*yariCap*yariCap*aci)/360;

        System.out.println("Daire diliminin alani : "+ alan);







        
    }
    
}
