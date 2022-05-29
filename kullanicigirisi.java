import java.util.Scanner;

/*

Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu
 şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre 
 oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
  yazan programı yazınız.
*/

public class kullanicigirisi {
    public static void main(String[] args) {
        String userName ="admin",usern;
        String userPasword = "1234",userp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanici ismini giriniz : ");
        usern= scanner.nextLine();
        System.out.println("Paswordu giriniz : ");
        userp = scanner.nextLine();
        
        if(userName.equals(usern) && userPasword.equals(userp)){
            System.out.println("Giris yaptiniz");
        
        }else{
            System.out.println("sifreyi degistirmek istermisiniz \n Evet : 1 \n Hayir :2 ");
            int tut = scanner.nextInt();
            switch(tut){
                case 1:System.out.println("yeni sifreyi giriniz : ");
                userp = scanner.nextLine();
                System.out.println("sifre degisti : ");
                break;

                case 2:System.out.println("Oturum kapatiliyor ");
                break;

            }
        }


        
    }
    
}
