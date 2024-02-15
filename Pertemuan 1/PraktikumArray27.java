import java.util.Scanner;

public class PraktikumArray27 {
    public static void main(String[] args) {
        int totalNilaiBobot = 0;
        int totalSKS;
        int nilaiPancasila = 75;
        int nilaiKonsepTI = 85;
        int nilaiCriticalThinking = 70;
        int nilaiMatematikaDasar = 85;
        int nilaiBahasaInggris = 85;
        int nilaiDasarPemrograman = 62;
        int nilaiPraktikumPemrograman = 62;
        int nilaiKeselamatanKerja = 85;

        // Menghitung total nilai bobot dan total SKS
        totalNilaiBobot += nilaiPancasila * 3;
        totalNilaiBobot += nilaiKonsepTI * 3;
        totalNilaiBobot += nilaiCriticalThinking * 3;
        totalNilaiBobot += nilaiMatematikaDasar * 3;
        totalNilaiBobot += nilaiBahasaInggris * 3;
        totalNilaiBobot += nilaiDasarPemrograman * 3;
        totalNilaiBobot += nilaiPraktikumPemrograman * 3;
        totalNilaiBobot += nilaiKeselamatanKerja * 3;

        totalSKS = 24; // Total SKS untuk semua mata kuliah

        // Menghitung IP Semester
        double ipSemester = (double) totalNilaiBobot / totalSKS;

        System.out.println("\nHasil konversi nilai");
        System.out.println("MK");
        System.out.println("Konsep Teknologi Informasi");
        System.out.println("Critical Thinking Dan Problem Solving");
        System.out.println("Matematika Dasar");
        System.out.println("Bahasa Inggris");
        System.out.println("Dasar Pemograman");
        System.out.println("Praktikum Dasar Pemograman");
        System.out.println("Keselamatan dan Kesehatan Kerja");
        System.out.println("IP: " + ipSemester);
    }
}