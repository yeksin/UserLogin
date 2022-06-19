import java.util.Scanner;
public class UserLogin {
    public static void main(String[] args) {

        String x,y;
        Scanner input= new Scanner(System.in);

        System.out.print("Kullancý adýný giriniz: ");
        x=input.nextLine();

        System.out.print("Þifreyi giriniz: ");
        y= input.nextLine();

        if (x.equals("yeksin") && y.equals("parola123")){
            System.out.println("Giriþ yaptýnýz! ");
        }
        else  {
            System.out.println("Kullanýcý veya þifre hatalý! Lütfen yeni þifre belirleyin: ");
        }
        y= input.nextLine();

        if (y.equals("parola123")){
            System.out.println("Yeni þiferniz eski þifrenizle ayný olamaz, lütfen baþka bir þifre belirleyin..");
        }
        else {
            System.out.println("Þifre oluþturuldu. Giriþ yapýlýyor..");
        }

    }
}
