//UTS PBO
    // Habibi ardaffenzy
    // Nim 2021071031

// SOAL NO.1

import java.util.Scanner;
public class Smartphone {
    // disini kita mmembuat atribut nya dahulu yagesya untuk berbasis OOP
    // Karena sesuai Soal disuruh menggunakan oop
    private int menit;
    private int perjam;
    private int detik;
    private int perjamakhir;
    private int detikakhir;
    private int menitakhir;
    //membuat set
    public void setJamtelepon(int jam) {
        this.perjam = jam;
    }
    public int getJamtelepon() {
        return perjam;
    }
    public void setMenit(int menit) {
        this.menit = menit;
    }
    public int getMenit() {
        return menit;
    }
    public void setDetik(int detik) {
        this.detik = detik;
    }
    public int getDetik() {
        return detik;
    }

    public void setPerjamakhir(int perjamakhir) {
        this.perjamakhir = perjamakhir;
    }
    //Tambahan atribut untuk panggilan akhir
    public int getPerjamakhir() {
        return perjamakhir;
    }
    public void setMenitanakhir(int menitakhir) {
        this.menitakhir = menitakhir;
    }
    public int getMenitanakhir() {
        return menitakhir;
    }
    public void setDetikakhir(int detikakhir) {
        this.detikakhir = detikakhir;
    }
    public int getDetikakhir() {
        return detikakhir;
    }
    public double pulsa(){
        return (3600*perjam + 60*menit + detik)*30;
    }
    public Smartphone (int jam, int menit, int detik, int perjamakhir, int menitakhir, int detikakhir ) {
        this.perjam = jam; this.menit = menit; this.detik = detik; this.perjamakhir = perjamakhir;
        this.menitakhir = menitakhir; this.detikakhir = detikakhir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan lama jam:");
        int perjam = sc.nextInt();
        System.out.print("Masukkan Lama Per menit:");
        int menit = sc.nextInt();
        System.out.print("Masukkan Lama Per detik:");
        int detik = sc.nextInt();

        System.out.println("");

        System.out.println("Masukkan Lama jam Akhir");
        System.out.print("Jam akhir : ");
        int perjamakhir = sc.nextInt();
        System.out.print("Menit akhir : ");
        int menitakhir = sc.nextInt();
        System.out.print("Detik akhir : ");
        int detikakhir = sc.nextInt();

        Smartphone oclock = new Smartphone(perjam,menit,detik,perjamakhir,menitakhir,detikakhir);
        System.out.println("waktu Telpon awal : "+oclock.getJamtelepon() +":"+oclock.getMenit()+":"+oclock.getDetik());
        System.out.println("waktu Telpon akhir : "+oclock.getPerjamakhir()+":"+oclock.getMenitanakhir()
                +":" +oclock.getDetikakhir());
        System.out.println("biaya percakapan: Rp. " +oclock.pulsa());
    }
}
