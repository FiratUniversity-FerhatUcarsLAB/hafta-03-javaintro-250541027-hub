public class HesapOzeti {
    public static void main(String[] args) {
        
        String urun1 = "Ekmek";
        String urun2 = "Sut";
        String urun3 = "Yumurta";

        int adet1 = 3;
        int adet2 = 2;
        int adet3 = 15;

        double fiyat1 = 12.0;
        double fiyat2 = 25.5;
        double fiyat3 = 3.5;

        
        double tutar1 = adet1 * fiyat1;
        double tutar2 = adet2 * fiyat2;
        double tutar3 = adet3 * fiyat3;
        double toplam = tutar1 + tutar2 + tutar3;

        
        System.out.println("========== Hesap Ozeti ==========");
        System.out.println("Urun       Adet    Fiyat    Tutar");
        System.out.println("---------------------------------");
        System.out.println("Ekmek        " + adet1 + "       " + fiyat1 + "        " + tutar1);
        System.out.println("Sut          " + adet2 + "       " + fiyat2 + "        " + tutar2);
        System.out.println("Yumurta     " + adet3 + "       " + fiyat3 + "        " + tutar3);
        System.out.println("---------------------------------");
        System.out.println("Toplam Tutar:                " + toplam);
        System.out.println("=================================");
    }
}
