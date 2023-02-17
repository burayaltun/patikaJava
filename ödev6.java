import java.util.Scanner;
public class ödev6 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
         double boy = 0, kilo =0, index = 0;

        System.out.print("Lütfen boyunuzu (m) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg) giriniz : ");
        kilo = input.nextDouble();
        input.close();
    
        index = kilo / (boy * boy);

        System.out.format("Vücut Kitle İndeksi: %.2f\n",index);

    }
}

