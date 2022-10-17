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
    }// ini bakal menghasilkan fungsi pulsa untuk dikembalikan
    public double pulsa(){
        return (3600*perjam + 60*menit + detik)*30;
    }
    public Smartphone (int jam, int menit, int detik) {
        this.perjam = jam; this.menit = menit; this.detik = detik;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan lama jam:");
        int perjam = sc.nextInt(); 
        System.out.print("Masukkan Lama Per menit:");
        int menit = sc.nextInt(); 
        System.out.print("Masukkan Lama Per detik:");
        int detik = sc.nextInt();

        Smartphone oclock = new Smartphone(perjam,menit,detik);
        System.out.println("waktu yang dipakai : "+oclock.getJamtelepon() +":"+oclock.getMenit()+":"+oclock.getDetik());
        System.out.println("biaya percakapan: Rp. " +oclock.pulsa());
    }
}
