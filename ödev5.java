import java.util.Scanner;
public class ödev5 {

    public static void main(String[] args) {

        final double PI = 3.14;
        double acı = 0,r = 0 ;
        double alan = 0,cevre =0 ;

        Scanner input  = new Scanner(System.in);

        System.out.print("Üçgenin yarıçapı (cm cinsinden): ");
        r = input.nextDouble();
        System.out.print("Üçgenin merkez açısının ölçüsü : ");
        acı = input.nextDouble();
        input.close();

        alan = PI * r * r * acı / 360;
        cevre =  PI * 2 * r;

        System.out.format("Çevresi: %.2f cm\n", cevre);
        System.out.format("Alanı: %.2f cm2\n", alan);
    }
}

