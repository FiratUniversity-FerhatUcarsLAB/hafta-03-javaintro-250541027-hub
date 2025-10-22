import  java.lang.Math;
public class UcgenAlan{
    public static void main (String []args){
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double s =( a+b+c)/2.0;
        double alan = Math.sqrt( s * (s - a) * (s - b) * (s - c) );
        System.out.println("--- En Basit Alan Hesabı ---");
        System.out.println("Kenarlar: " + a + ", " + b + ", " + c);
        System.out.println("Yarı Cevre (s): " + s);
        System.out.println("Ucgenin Alanı (A): " + alan);
    }
}
