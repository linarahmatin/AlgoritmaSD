package P8;
import java.util.Scanner;
public class Utama27 {
    public static void main(String[] args) { 
        Scanner sc27 = new Scanner (System.in);    
        System.out.print("Masukkan kapasitas gudang : ");
        int kapasitas = sc27.nextInt();
        sc27.nextLine();
        Gudang27 gudang = new Gudang27(kapasitas);
        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampilkan barang teratas");
            System.out.println("5. Tampilkan barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = sc27.nextInt();
            sc27.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = sc27.nextInt();
                    sc27.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = sc27.nextLine();
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = sc27.nextLine();
                    Barang27 barangBaru = new Barang27(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Pilih tipe pencarian : ");
                    System.out.println("1. Cari dengan kode");
                    System.out.println("2. Cari dengan nama");
                    System.out.print("Pilihan : ");
                    int pilih2 = sc27.nextInt();
                    sc27.nextLine();
                    switch (pilih2) {
                        case 1:
                            System.out.print("Masukkan kode barang : ");
                            int cariKode = sc27.nextInt();
                            sc27.nextLine();
                            gudang.cariKode(cariKode);
                            break;
                        case 2:
                            System.out.print("Masukkan nama barang : ");
                            String cariNama = sc27.nextLine();
                            gudang.cariNama(cariNama);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}