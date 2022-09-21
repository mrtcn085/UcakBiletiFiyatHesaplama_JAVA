import java.util.Scanner;

public class thy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi giriniz:");
        double mesafe = input.nextDouble();
        System.out.print("Yaşınızı giriniz:");
        byte yas = input.nextByte();
        System.out.println("Tek bilet almak için 1'e\n Gidiş-Dönüş almak için 2'ye basınız" );
        double ucret = mesafe * 0.1;
        byte secim = input.nextByte();
        switch(secim) {
            case 1:
                if (yas < 12) {
                    System.out.print("Toplam tutar:" + ucret / 2);
                } else if (12 < yas && yas < 24) {
                    System.out.print("Toplam tutar:" + (ucret - ucret * 0.1));
                } else if (yas > 65) {
                    System.out.println("Toplam tutar:" + (ucret - ucret * 0.3));
                } else {
                    System.out.print("Toplam tutar:" + ucret);
                }
                break;
            case 2:
                if (yas < 12) {
                    System.out.print("Toplam tutar:" + (ucret / 2 - ((ucret / 2) * 0.2)));
                } else if (12 < yas && yas < 24) {
                    System.out.print("Toplam tutar:" + ((ucret - ucret * 0.1) - ((ucret - ucret * 0.1) * 0.2)));
                } else if (yas > 65) {
                    System.out.print("Toplam tutar:" + ((ucret - ucret * 0.3) - ((ucret - ucret * 0.3)) * 0.2));
                } else {
                    System.out.println("Toplam tutar" + (ucret - (ucret * 0.2)));
                }
                break;
        }
    }
}