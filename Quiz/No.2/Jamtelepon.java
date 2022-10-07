package Quiz;

import java.util.Scanner;

public class Jamtelepon {
    // disini kita mmembuat atribut nya dahulu
    private int perjam;
    private int menit;
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
    public Jamtelepon(int jam, int menit, int detik) {
        this.perjam = jam;
        this.menit = menit;
        this.detik = detik;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.print("Input jam:");
        int perjam = sc.nextInt(); System.out.print("Input menit:");
        int menit = sc.nextInt(); System.out.print("Input detik:");
        int detik = sc.nextInt();

        Jamtelepon oclock = new Jamtelepon(perjam,menit,detik);
        System.out.println("waktu yang dipakai : "+oclock.getJamtelepon()
                +":"+oclock.getMenit()+":"+oclock.getDetik());
        System.out.println("biaya percakapan: Rp. " +oclock.pulsa());
    }
}
