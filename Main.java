import java.util.Scanner;

public class Main {
    static void main() {
        Scanner input = new Scanner(System.in);
         int mat,kimya,muzik,tarih,turkce,fizik;
        System.out.print("matematik notuzun?: ");
        mat = input.nextInt();

        System.out.print("kimya notuzun?: ");
        kimya = input.nextInt();

        System.out.print("müzik notuzun?: ");
        muzik = input.nextInt();

        System.out.print("tarih notuzun?: ");
        tarih = input.nextInt();

        System.out.print("türkçe notuzun?: ");
        turkce = input.nextInt();

        System.out.print("fizik notuzun?: ");
        fizik = input.nextInt();

        int sonuc = mat + kimya + muzik + tarih + turkce + fizik;
        double ortalama = sonuc / 6;
        System.out.println("ortalamanız : "+ ortalama);


    }

}