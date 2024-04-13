
import java.util.Scanner;

public class Buku27 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku27(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("=========================");
        System.out.println("Kode buku: " + kodeBuku);
        System.out.println("Judul buku: " + judulBuku);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock: " + stock);
    }

    public static class PencarianBuku {
        Buku27 listBk[] = new Buku27[5];
        int idx;

        public void tambah(Buku27 m) {
            if (idx < listBk.length) {
                listBk[idx] = m;
                idx++;
            } else {
                System.out.println("Data sudah penuh!");
            }
        }

        public void tampil() {
            for (Buku27 m : listBk) {
                m.tampilDataBuku();
            }
        }
        
        public int findSeqSearch(String cari) {
            int posisi = -1;
            for (int j = 0; j < listBk.length; j++) {
                if (listBk[j].kodeBuku.equals(cari)) {
                    posisi = j;
                    break;
                }
            }
            return posisi;
        }

        public void tampilPosisi(String x, int pos) {
            if (pos != -1) {
                System.out.println("Data: " + x + " ditemukan pada indeks " + pos);
            } else {
                System.out.println("Data " + x + " tidak ditemukan");
            }
        }
        

        public int findBinarySearch(String cari, int left, int right) {
            if (right >= left) {
                int mid = left + (right - left) / 2;
                int compareResult = cari.compareTo(listBk[mid].kodeBuku);
                if (compareResult == 0) {
                    return mid;
                } else if (compareResult < 0) {
                    return findBinarySearch(cari, left, mid - 1);
                } else {
                    return findBinarySearch(cari, mid + 1, right);
                }
            }
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku data = new PencarianBuku();
        int jumBuku = 5;

        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan nama buku yang dicari: ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock     \t: ");
            int stock = s.nextInt();

            Buku27 m = new Buku27(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("------------------------------------------------------------------------- ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();

        System.out.println("Menggunakan sequential Search");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        if (posisi != -1) {
            data.listBk[posisi].tampilDataBuku();
        }

        System.out.println("===========================");
        System.out.println("Menggunakan binary Search");
        posisi = data.findBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(cari, posisi);
        if (posisi != -1) {
            data.listBk[posisi].tampilDataBuku();
        }
    }
}