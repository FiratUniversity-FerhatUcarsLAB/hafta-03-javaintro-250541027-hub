public class MilKilometreTablosu {
    public static void main(String[]args){
        final double MIL_DEN_KM_YE =1.609;

        int[] milDegerleri= { 1 , 5 , 10 , 20 , 50};

        System.out.println("--- Mil -->Kilometre Dönüşüm Tablosu ---- ");
        System.out.println("------------------------------------------");
        System.out.println("Mil                     Kilometre(KM)     ");
        System.out.println("------------------------------------------");

        double km1 = 1 * MIL_DEN_KM_YE;
        System.out.println("1       " + km1);

        // 5 Mil için
        double km5 = 5 * MIL_DEN_KM_YE;
        System.out.println("5       " + km5);

        // 10 Mil için
        double km10 = 10 * MIL_DEN_KM_YE;
        System.out.println("10      " + km10);

        // 20 Mil için
        double km20 = 20 * MIL_DEN_KM_YE;
        System.out.println("20      " + km20);

        // 50 Mil için
        double km50 = 50 * MIL_DEN_KM_YE;
        System.out.println("50      " + km50);
        
        System.out.println("---------------------------");
  

    }
}
