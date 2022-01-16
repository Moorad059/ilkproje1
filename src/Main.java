import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,riy;
        Scanner asd= new Scanner(System.in);

        System.out.println("Mat notu:");
        mat= asd.nextInt();
        System.out.println("Fizik notu:");
        fizik= asd.nextInt();
        System.out.println("Kimya notu:");
        kimya= asd.nextInt();
        System.out.println("Riy notu:");
        int toplam=(mat+fizik+kimya+riy);
        double ortalama= toplam / 4.0;
        System.out.print("sonuc:" + ortalama);



    }
}
