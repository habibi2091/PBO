import java.util.Scanner;
public class TugasPBO2 {
    public static void main(String args[]) {

        while(true){
            String kalimat;
            String kata = "kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau digosok terus menerus akan menjadi jarum";
            System.out.println("");
            String huruf;
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan kata yang sesuai:");
            huruf = input.nextLine();

            if (kata.contains(huruf)) {
                System.out.println("Input ternyata benar");
                break;
            } else {
                System.out.println("Inputin ulang ");
            }
        }
    }
}
