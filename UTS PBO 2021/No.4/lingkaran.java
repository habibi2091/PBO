import java.lang.Math;
public class lingkaran {
    private double r;
    private double PHI = 3.1415;
    //seperti biasa kita tambahkan atribut nya
    // berbasis OOP ya

    public lingkaran(){
        this.r = 0;
    }
    public lingkaran(double jari){
        this.r = jari;
    }
    public void setR(double jari) {
        this.r = jari;
    }
    public double getR() {
        return this.r;
    }
    public double luas() {
        return this.PHI * Math.pow(this.r,2);
    }
    public double keliling(){
        return (2 * this.PHI * this.r);
    }
    // dibagian sini kita akan menginput dan menghasilkan nilai tersebut dari luas
    //lingkaran 1 maupun yang kedua
    public static void main(String[] args){
        lingkaran link1 = new lingkaran();
        link1.setR(10);
        System.out.println("Luas Lingkaran ke-1 = " + link1.luas());
        lingkaran link2 = new lingkaran(100);
        System.out.println("Luas Lingkaran ke-2 = " + link2.luas());
    }
}
