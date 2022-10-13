import java.util.Scanner;
class TugasPBO1 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        boolean ea;
        String hasil;

        do {
            System.out.print("Masukan angka dari 1 - 10: ");
            angka = input.nextInt();

            if (angka >= 0 && angka <= 10) {
                System.out.println("Angka yang Anda masukan sesuai!");
            } else {
                System.out.println("Angka bukan dari 1 - 10\n");
            }
            input.nextLine();
            while (true) {
                System.out.print("Apakah anda mau lanjut[y/t]?");
                hasil = input.nextLine().toUpperCase();

                if(hasil.equals("y")){
                    ea = true;
                    break;

                }else if(hasil.equals("t")){
                    ea = false;
                    break;

                }else{
                    System.out.println("Masukan tidak valid");
                }
            }
        }while(ea);
    }
}
