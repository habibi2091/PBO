package LatihanClass3;

public class biodata {
    private String nim;
    private String nama;

    public void inputData(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    public void viewData(){
        System.out.println("NIM: " + this.nim);
        System.out.println("nama: " + this.nama);
    }
}
