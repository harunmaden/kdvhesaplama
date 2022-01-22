import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner inp = new Scanner(System.in);

        System.out.println("Turarı giriniz");

        double kdv;
        int tutar = inp.nextInt();
        if (tutar<1000) {
            kdv = 0.18;
        }
        else {
            kdv = 0.08;
        }

            double tutarkdv = tutar * kdv;
            double kdvlitutar = tutar + tutarkdv;
            System.out.println("Kdv'siz fiyat : " + tutar);
            System.out.println("Ürün kdvsi : " + tutarkdv);
            System.out.println("Kdvli fiyat : " + kdvlitutar);

        }
    }

