import java.util.Scanner;

public class ATM {
    private static double balance = 1000.0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ATM Sistemine Hoş Geldiniz!");

        while (true) {
            System.out.println("\nLütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Bakiye Görüntüleme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Çıkış");

            System.out.print("Seç: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    bakiyeGoruntule();
                    break;
                case 2:
                    paraYatir();
                    break;
                case 3:
                    paraCek();
                    break;
                case 4:
                    System.out.println("Çıkış yapıldı.");
                    return;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }

    private static void bakiyeGoruntule() {
        System.out.printf("Güncel bakiyeniz: %.2f TL%n", balance);
    }

    private static void paraYatir() {
        System.out.print("Yatırmak istediğiniz miktarı girin: ");
        double miktar = scanner.nextDouble();
        if (miktar > 0) {
            balance += miktar;
            System.out.printf("Yeni bakiyeniz: %.2f TL%n", balance);
        } else {
            System.out.println("Geçersiz miktar.");
        }
    }

    private static void paraCek() {
        System.out.print("Çekmek istediğiniz miktarı girin: ");
        double miktar = scanner.nextDouble();
        if (miktar > 0 && miktar <= balance) {
            balance -= miktar;
            System.out.printf("Yeni bakiyeniz: %.2f TL%n", balance);
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz miktar.");
        }
    }
}
