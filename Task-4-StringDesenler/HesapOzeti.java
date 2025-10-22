public class HesapOzeti{
    public static void main(String []args ){
        String[] urunAdlari = { "Süt", "Ekmek", "Peynir" };
        int[] miktarlar     = { 2, 3, 1 };
        double[] birimFiyatlar = { 25.50, 7.00, 120.0 };
        double genelToplam= 0.0;
        System.out.println("**************** HESAP ÖZETİ ****************");
        System.out.printf("%-15s %-8s %10s %12s\n", "ÜRÜN ADI", "MİKTAR", "FİYAT (TL)", "TOPLAM (TL)");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < urunAdlari.length; i++) {
            double satirToplam = miktarlar[i] * birimFiyatlar[i];
            genelToplam = genelToplam + satirToplam;
            System.out.printf("%-15s %-8d %10.2f %12.2f\n", 
                                urunAdlari[i], 
                                miktarlar[i], 
                                birimFiyatlar[i], 
                                satirToplam);
        System.out.println("---------------------------------------------------");
        System.out.printf("%-35s %12.2f\n", "GENEL TOPLAM:", genelToplam);
        System.out.println("***************************************************");
    }
}
}
