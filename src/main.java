import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        // degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;
      Scanner inp = new Scanner (System.in);

       System.out.print("Matematik notunuz : ");
       mat = inp.nextInt();
        System.out.print("fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("turkce notunuz : ");
        turkce = inp.nextInt();
        System.out.print("tarih notunuz : ");
        tarih = inp.nextInt();
        System.out.print("muzik notunuz : ");
        muzik = inp.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamaniz : " + sonuc);
        String str= sonuc >= 60 ? "Sinifi Gectiniz" : "Sinifta Kaldiniz";
        System.out.print(str);
    }

}
