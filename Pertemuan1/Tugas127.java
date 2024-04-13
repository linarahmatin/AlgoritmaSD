import java.util.Scanner;
    public class Tugas127 {
        public static void main(String[] args) {
            char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
            String[] KOTA = {"BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", "PEKALONGAN", "SEMARANG", "SURABAYA"};
    
            // Input kode plat nomor
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan kode plat nomor: ");
            char kodeInput = input.next().charAt(0);
    
            // Cari nama kota berdasarkan kode plat nomor
            boolean found = false;
            for (int i = 0; i < KODE.length; i++) {
                if (KODE[i] == kodeInput) {
                    System.out.println("Nama kota: " + KOTA[i]);
                    found = true;
                    break;
                }
            }
    
            if (!found) {
                System.out.println("Kode plat nomor tidak ditemukan.");
            }
        }
    }