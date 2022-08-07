import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.println("Ucret tutarini giriniz: ");
        double tutar,kdvOran=1,kdvTutar,kdvliTutar;

        tutar= inp.nextDouble();

        if(tutar<=1000){
            kdvTutar=tutar*(kdvOran*0.18);
            kdvliTutar=tutar+kdvOran;
            System.out.println("KDV'sis Tutar:"+tutar);
            System.out.println("KDV Orani:"+kdvOran);
            System.out.println("KDV Tutari:"+kdvTutar);
            System.out.println("KDV'li Tutar:"+kdvliTutar);
        }else{
            kdvTutar=tutar*(kdvOran*0.08);
            kdvliTutar=tutar+kdvOran;
            System.out.println("KDV'sis Tutar:"+tutar);
            System.out.println("KDV Orani:"+kdvOran);
            System.out.println("KDV Tutari:"+kdvTutar);
            System.out.println("KDV'li Tutar:"+kdvliTutar);
        }


    }
}
