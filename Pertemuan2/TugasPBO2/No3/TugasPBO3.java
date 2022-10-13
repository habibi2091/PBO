import java.util.Random;
import java.util.Scanner;

    public class TugasPBO3 {
        public static void main(String[] args) {
            Random acak = new Random();
            Scanner input = new Scanner(System.in);
            String[] inputKomputer = {"J", "T", "K"};
            String Ulang = "";
            String Jwb = "";

            do {
                int Bot = acak.nextInt(inputKomputer.length);
                System.out.print("Masukkan jari [J/T/K] : ");
                Jwb = input.nextLine().toUpperCase();
                System.out.println("Komputer :" + inputKomputer[Bot]);

                if (inputKomputer[Bot].equals("J") && Jwb.equals("T")) {
                    System.out.println("Yahh kamu kalah");
                    
                    } else if (inputKomputer[Bot].equals("T") && Jwb.equals("K")) {
                         System.out.println("Yahh kamu kalah");
                    
                     } else if (inputKomputer[Bot].equals("K") && Jwb.equals("J")) {
                         System.out.println("Yahh kamu kalah");
                    
                        } else if (inputKomputer[Bot].equals(Jwb)) {
                             System.out.println("Yeay kamu menang");
                    
                        } else if (inputKomputer[Bot].equals("J") && Jwb.equals("K")) {
                             System.out.println("Yeay kamu menang");
                             
                         } else if (inputKomputer[Bot].equals("T") && Jwb.equals("J")) {
                                System.out.println("Yeay kamu menang");
                                
                            } else if (inputKomputer[Bot].equals("K") && Jwb.equals("T")) {
                                System.out.println("Yeay kamu menang");
                } else {
                    System.out.println("input apa toh kamu? masa ga ngerti");
                }
                    System.out.print("kamu masih mau lanjut? [Y]/[T] : ");
                    Ulang = input.nextLine().toUpperCase();
            }
            while (Ulang.equals("Y"));
                System.out.println("oke permainan telah selesai");
        }
    }
