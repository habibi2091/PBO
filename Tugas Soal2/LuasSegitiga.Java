import java.util.Scanner;
public class luassegitiga {

    private int alas;
    private int tinggi;

    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){

        this.tinggi = tinggi;
    }
    public double getLuas(){
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        luassegitiga luas = new luassegitiga();
      
        System.out.print("Alas segitiga = ");
        luas.setAlas(input.nextInt());

        System.out.print("Tinggi segitiga =");
        luas.setTinggi(input.nextInt());

        System.out.println("Luas Segitiga adalah = 0.5 * "+ luas.alas + " * " + luas.tinggi + " = " + luas.getLuas());


    }
}
