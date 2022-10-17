import java.util.Scanner;

public class timbangbadan {
    public static double bb, tb;
    public static double BMI;
    // disini kita membuat atribut terlebih dahulu

    public static double BMI() {
        return BMI = bb / (tb/100 * tb /100);
    }
// lalu kita mengscan untuk menginput nilai dari sini
    public static void main(String[] args) {
        Scanner leng = new Scanner((System.in));

        System.out.println("Masukkan Berat: ");
        bb = leng.nextDouble();

        System.out.println("Masukkan Tinggi: ");
        tb = leng.nextDouble(); BMI = BMI();
        System.out.println();

        if (BMI >= 18.5 && BMI <= 22.9) {
            System.out.println("Berat Badan kamu bagus ideal");
        } else if (BMI >= 22.9) {
            System.out.println("Berat kamu gemuk");
        } else if (BMI <= 18.5) {
            System.out.println("Berat Badan kurang");
        }

    }
}
