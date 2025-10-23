public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;
        toplamSaniye = toplamSaniye % 3600;

        int dakika = toplamSaniye / 60;
        int saniye = toplamSaniye % 60;

      
        String dakikaStr = ("" + (100 + dakika)).substring(1);
        String saniyeStr = ("" + (100 + saniye)).substring(1);

        System.out.println(saat + ":" + dakikaStr + ":" + saniyeStr);
    }
}


