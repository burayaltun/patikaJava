import java.util.Scanner;
public class Main{


public static void main(String [] args) {
    
Scanner input = new Scanner(System.in);

System.out.println("Matematik notunuz: ");
int mat = input.nextInt();

System.out.println("Fizik notunuz: ");
int fiz = input.nextInt();

System.out.println("Kimya notunuz: ");
int kim = input.nextInt();

System.out.println("Türkçe notunuz: ");
int türk = input.nextInt();

System.out.println("Tarih notunuz: ");
int tar = input.nextInt();

System.out.println("Müzik notunuz: ");
int müz = input.nextInt();

int toplam = (mat + fiz + kim + türk + tar + müz);
double ortalama = toplam / 6;
System.out.println("Ortalamanız: ",ortalama);


}


}