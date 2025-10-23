public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;
        toplamSaniye = toplamSaniye % 3600;

        int dakika = toplamSaniye / 60;
        int saniye = toplamSaniye % 60;

        // Dakika ve saniyeyi her zaman 2 basamaklı göstermek için küçük bir numara:
        // 100 ekleyip substring(1) alırsak baştaki '1' düşer, örnek: 05 olur
        String dakikaStr = ("" + (100 + dakika)).substring(1);
        String saniyeStr = ("" + (100 + saniye)).substring(1);

        System.out.println(saat + ":" + dakikaStr + ":" + saniyeStr);
    }
}

