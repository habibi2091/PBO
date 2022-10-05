package LatihanClass3a;

import java.sql.SQLOutput;

public class Biodata {
    private String nim;
    private String nama;
    private String kelamin;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    private int umur;
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelamin() {
        String kelamin = "Perempuan";
        if (this.kelamin == "L") {
            kelamin = "Laki-laki";
        }
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        biodata.setNim("2021071031");
        biodata.setNama("Habibiardaffenzy");
        biodata.setKelamin("L");
        biodata.setUmur(20);


        System.out.println("NIM : " + biodata.getNim());
        System.out.println("Nama : " + biodata.getNama());
        System.out.println("Jenis Kelamin : " + biodata.getKelamin());
        System.out.println("Umur : " + biodata.getUmur() + " tahun");
    }
}
