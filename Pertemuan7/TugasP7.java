import java.util.Scanner;
public class TugasP7 {
    private int Gajipokok; //definisikan variabel
    private int Tunjangan; // kita di private ini membuat variabelnya
    private int Jam;
    public int getJam() {
        return Jam;
    }
    public void setJam(int jam) {
        this.Jam = jam;
    }

    public static void main(String[] args) {

        TugasP7 gaji = new TugasP7();
        Scanner input = new Scanner(System.in);
        //Buat tampilan awal program

        System.out.println("=============================================");
        System.out.println("Selamat Datang dalam Pencarian Gaji Pokok");
        System.out.println("=============================================");
        //Tampilan buat memasukan nilai
        System.out.print("Masukkan Lama jam kerja: ");
        gaji.setJam(input.nextInt());
        System.out.println("Berikut adalah Hasil");
        System.out.println("\nJam Kerja Karyawan = "+ gaji.getJam());

        // membuat object baru
        int lembur = gaji.getJam();
        Golongan1 gol1 = new Golongan1();
        Golongan2 gol2 = new Golongan2();
        Golongan3 gol3 = new Golongan3();
        Golongan4 gol4 = new Golongan4();

        if(lembur>173){ //Buat kondisi saat memilih golongan
            int Jamlembur = lembur - 173;
            System.out.println("Jamlembur = "+ Jamlembur);
            int harga = Jamlembur * 20000;
            int Totaljam = Jamlembur+lembur;

            System.out.println("Total jam kerja = "+ Totaljam);
            System.out.println("Total gaji golongan 1 = Rp. " + (gol1.golongan1(gaji.Gajipokok, gaji.Tunjangan)+harga));
            System.out.println("Total gaji golongan 2 = Rp. " + (gol2.golongan2(gaji.Gajipokok, gaji.Tunjangan)+harga));
            System.out.println("Total gaji golongan 3 = Rp. " + (gol3.golongan3(gaji.Gajipokok, gaji.Tunjangan)+harga));
            System.out.println("Total gaji golongan 4 = Rp. " + (gol4.golongan4(gaji.Gajipokok, gaji.Tunjangan)+harga));

        }else if(lembur == 173){
            int jamlembur =0;
            System.out.println("Jamlembur = "+jamlembur);
            System.out.println("Total jam kerja = "+ lembur);
            System.out.println("Total gaji golongan 1 = Rp. " + gol1.golongan1(gaji.Gajipokok, gaji.Tunjangan));
            System.out.println("Total gaji golongan 2 = Rp. " + gol2.golongan2(gaji.Gajipokok, gaji.Tunjangan));
            System.out.println("Total gaji golongan 3 = Rp. " + gol3.golongan3(gaji.Gajipokok, gaji.Tunjangan));
            System.out.println("Total gaji golongan 4 = Rp. " + gol4.golongan4(gaji.Gajipokok, gaji.Tunjangan));

        }else{ //membuat mines karyawan ketika jam kerja tidak sesuai
            int jamlembur = 173-lembur;
            System.out.println("Mines jam kerja = "+ jamlembur);
            System.out.println("Total jam Kerja = "+ lembur);
            
            int mines = jamlembur*10000;
            
            System.out.println("Total gaji golongan 1 = Rp. " + (gol1.golongan1(gaji.Gajipokok, gaji.Tunjangan)-mines));
            System.out.println("Total gaji golongan 2 = Rp. " + (gol2.golongan2(gaji.Gajipokok, gaji.Tunjangan)-mines));
            System.out.println("Total gaji golongan 3 = Rp. " + (gol3.golongan3(gaji.Gajipokok, gaji.Tunjangan)-mines));
            System.out.println("Total gaji golongan 4 = Rp. " + (gol4.golongan4(gaji.Gajipokok, gaji.Tunjangan)-mines));
        }
    }
}
class Golongan1 extends TugasP7{
    //Membuat Perhitungan untuk ,emghitung gaji lembur yang di dapat
    public double golongan1(int Gajipokok, int Tunjangan) {
        Gajipokok = 1486500;
        Tunjangan = 250000;
        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;
        return Gaji;
    }
}
class Golongan2 extends TugasP7{
    //Membuat Perhitungan untuk ,emghitung gaji lembur yang di dapat
    public double golongan2(int Gajipokok, int Tunjangan){
        Gajipokok = 1926000;
        Tunjangan = 300000;
        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;
        return Gaji;
    }

}
class Golongan3 extends TugasP7{
    //Membuat Perhitungan untuk ,emghitung gaji lembur yang di dapat
    public double golongan3(int Gajipokok, int Tunjangan){
        Gajipokok = 2456700;
        Tunjangan = 350000;
        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;
        return Gaji;
    }

}
class Golongan4 extends TugasP7{
    //Membuat Perhitungan untuk ,emghitung gaji lembur yang di dapat
    public double golongan4(int Gajipokok, int Tunjangan){
        Gajipokok = 2899500;
        Tunjangan = 400000;
        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;
        return Gaji;

    }

}
