import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {

        String x,y;
        Scanner input= new Scanner(System.in);

        System.out.print("Kullanc� ad�n� giriniz: ");
        x=input.nextLine();

        System.out.print("�ifreyi giriniz: ");
        y= input.nextLine();

        if (x.equals("yeksin") && y.equals("parola123")){
            System.out.println("Giri� yapt�n�z! ");
        }
        else  {
            System.out.println("Kullan�c� veya �ifre hatal�! L�tfen yeni �ifre belirleyin: ");
        }
        y= input.nextLine();

        if (y.equals("parola123")){
            System.out.println("Yeni �iferniz eski �ifrenizle ayn� olamaz, l�tfen ba�ka bir �ifre belirleyin..");
        }
        else {
            System.out.println("�ifre olu�turuldu. Giri� yap�l�yor..");
        }

    }
}
