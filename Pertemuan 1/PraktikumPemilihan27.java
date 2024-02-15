import java.util.Scanner;

public class PraktikumPemilihan27{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("---------------------------------");

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        System.out.println("---------------------------------");
        if ((nilaiTugas < 0 || nilaiTugas > 100) ||
            (nilaiKuis < 0 || nilaiKuis > 100) ||
            (nilaiUTS < 0 || nilaiUTS > 100) ||
            (nilaiUAS < 0 || nilaiUAS > 100)) {
            System.out.println("Nilai tidak valid");
            return;
    
         }
        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis +
                            0.3 * nilaiUTS + 0.4 * nilaiUAS;

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "LULUS";

        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
       
    }
}