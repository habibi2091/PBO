package Quiz;

import java.util.Scanner;
public class warnet {
    // seperti biasa disini kita membuat atribut
    private int internet;
    private int ketik;
    private int game;
    private int scan;
    private int hitamputih;
    private int warna;
    private int tehbotol;

    public double biayapenggunaan(){
        double komputer = ((this.internet/60)*(double)4000)+
                ((this.ketik/60)*(double)2000) + ((this.game/60)*(double)5000);
        return komputer;
    }
    public double fasilitas(){
        double biayafasilitas =
                this.scan*1000+this.warna*500+this.warna*300+this.tehbotol*3000;
        return biayafasilitas;
    }
    public double totalbiaya(){
        return biayapenggunaan()+fasilitas();
    }
    public warnet(){
        System.out.println("Masukkan lamanya pemakaian ");
    }
    // constructor untuk menginisialisasi suatu nilai
    public warnet(int t,int k, int e, int n, int a, int h, int l){
        this.internet = t;
        this.scan = n;
        this.ketik = k;
        this.warna = a;
        this.hitamputih= h;
        this.game = e;
        this.tehbotol=l;
    }
    public static void main(String[] args) {
        // scanner untuk menginput nilai
        Scanner sc = new Scanner(System.in);
        warnet wt = new warnet();
        System.out.print("Penggunaan lama penggunaan internet : ");
        wt.internet= sc.nextInt();

        System.out.print("Penggunaan lama penggunaan pengetikan : ");
        wt.ketik = sc.nextInt();

        System.out.print("Penggunaan lama penggunaan game online : ");
        wt.game = sc.nextInt();

        System.out.print("Penggunaan berapa file yang akan discan : ");
        wt.scan = sc.nextInt();

        System.out.print("Penggunaan berapa file yang akan diprint warna : ");
        wt.warna = sc.nextInt();

        System.out.print("Penggunaan berapa file yang akan diprint hitamputih : ");
        wt.hitamputih = sc.nextInt();

        System.out.print("Penggunaan banyak teh botol yang diminum:");
        wt.tehbotol = sc.nextInt();

        System.out.println("Lama penggunaan komputer adalah :" );
        warnet lama = new warnet(wt.internet,wt.ketik,wt.game,wt.scan,wt.warna,wt.hitamputih,wt.tehbotol);

        //memanggil fungsi perhitungan yang telah dibuat

        System.out.printf("\nTotal seluruh biaya: Rp %.2f",
                lama.totalbiaya());
    }
}
