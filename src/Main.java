import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tutar giriniz: ");
        double price = scan.nextDouble();

        System.out.println("Kart numarasını giriniz: ");
        String cardNumber = scan.next();

        System.out.println("Son Kullanım Tarihini giriniz: ");
        String date = scan.next();

        System.out.println("Güvenlik kodunu giriniz: ");
        String cvc = scan.next();

        System.out.println("1 - Akbank ");
        System.out.println("2 - Halkbank ");
        System.out.println("3 - Ziraat Bankası ");

        System.out.println("Banka seçimi: ");
        int secim = scan.nextInt();

        switch (secim){
            case 1 : Akbank aPos = new Akbank("Akbank", "21321321313", "2512132312");
            aPos.connect("127.1.1.1");
            aPos.payment(price, cardNumber, date, cvc);
            break;

            case 2 : Halkbank bPos = new Halkbank("Halkbank", "21321321313", "2512132312");
            bPos.connect("127.1.1.2");
            bPos.payment(price, cardNumber, date, cvc);
            default: System.out.println("Geçerli bir banka numarası giriniz !!");
        }

    }
}
