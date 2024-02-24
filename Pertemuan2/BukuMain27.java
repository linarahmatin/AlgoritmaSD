public class BukuMain27 {
    public static void main(String[] args) {
        Buku27 bk1 = new Buku27();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        System.out.println("Informasi awal buku");
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println();
        bk1.hitungHargaTotal(5);
        bk1.hitungDiskon();
        bk1.hitungHargaBayar();
        bk1.tampilInformasi();

        Buku27 bk2 = new Buku27("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        System.out.println();
        bk2.hitungHargaTotal(5);
        bk2.hitungDiskon();
        bk2.hitungHargaBayar();
        bk2.tampilInformasi();

        System.out.println();
        Buku27 bukuMahasiswa = new Buku27("JudulBuku", "pengarang", 250, 20, 55000);
        bukuMahasiswa.tampilInformasi();
    }
}