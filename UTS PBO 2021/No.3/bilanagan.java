import java.util.Scanner;

public class bilangan {
// seperti biasa kita tambahkan atribut terlebih dahulu
   public static void menghitung(int a,int b){
        Scanner leng = new Scanner(System.in);
        for (int i=1;i<=10;i++){ System.out.print(i+". ");
            a=leng.nextInt();
            b+=a;
        }
        System.out.println("Hasil penambahan adalah: "+b);

    }
    public static void main(String[] args) {
       // memanggil hasil
        // membuat object baru agar bisa dipanggil dalam fungsi main dari class bilangan
        int angka=0,sum=0;
        System.out.println("Masukan 10 angka bebas:");
        menghitung(angka,sum);

    }

