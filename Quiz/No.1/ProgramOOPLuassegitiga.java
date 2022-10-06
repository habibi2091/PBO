package Quiz;

import java.util.Scanner;
import java.util.Locale;

class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Program OOP Menghitung Luas Segitiga");
        System.out.println("------------------------------------");
        Double alas,tinggi, luas;

            System.out.print("Inputkan alas Segitiga: ");
        alas = input.nextDouble();

            System.out.print("Inputkan tinggi Segitiga: ");
        tinggi = input.nextDouble();

        luas = 0.5 * alas * tinggi;

            System.out.println("Maka Hasil Luas segitiga: "+luas);

    }
}
