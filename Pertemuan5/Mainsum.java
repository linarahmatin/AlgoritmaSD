import java.util.Scanner;
public class Mainsum {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("=================================================");
            System.out.println("Program Menghitung Keuntungan Total(satuan juta, misal 5.9)");
            System.out.print("Masukkan Jumlah Bulan : ");
            int elm = sc.nextInt();

            Sum sum = new Sum(elm);
            for(int i = 0; i < sum.elemen; i++) {
                System.out.print("Masukkan untung Bulan ke-" + (i + 1) + " = ");
                sum.keuntungan[i] = sc.nextDouble();
            }

        System.out.println("=================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println( "Total Keuntungan Perusahaan Selama " + sum.elemen + " Bulan adalah = " + sum.totalBF(sum.keuntungan));
        System.out.println("=================================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total Keuntungan Perusahaan Selama " + sum.elemen + " Bulan adalah " + sum.totalDC(sum.keuntungan, 0, sum.elemen - 1));

    }
}

