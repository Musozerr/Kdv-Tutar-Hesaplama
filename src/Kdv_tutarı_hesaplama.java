import java.util.Scanner;

public class Kdv_tutarı_hesaplama {
    public static void main(String[] args) {
        double tutar,kdv_li_tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar Giriniz :");
        tutar = input.nextDouble();

        if (tutar <= 1000 && tutar >= 0){
            kdv_li_tutar =((tutar * 18) / 100) + tutar;
            System.out.println("KDV'siz Fiyat : " + tutar);
            System.out.println("KDV'li Tutar : "+ kdv_li_tutar);
            System.out.println("KDV Tutarı : " + (tutar * 18) / 100);
        }
        else{
            kdv_li_tutar = ((tutar * 8) / 100) + tutar;
            System.out.println("KDV'siz Fiyat : " + tutar);
            System.out.println("KDV'li Tutar : "+ kdv_li_tutar);
            System.out.println("KDV Tutarı : " + (tutar * 8) / 100);
        }
    }


}
