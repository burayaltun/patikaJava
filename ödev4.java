import java.util.Scanner;
public class ödev4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Taksimetre Tutarını Hesaplama");
        System.out.println("--------------");
        double toplamTutar = 0, mesafe = 0, km = 2.2, ilkTutar = 10;
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextDouble();
        input.close();
        toplamTutar = ilkTutar + mesafe * km;
        toplamTutar= (toplamTutar < 20) ? 20 : toplamTutar;
        System.out.println("--------------");
        System.out.format("Toplam Tutar: %.2f TL\n", toplamTutar);
    }
}

