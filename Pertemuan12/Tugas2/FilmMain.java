package Tugas2;

import java.util.Scanner;

public class FilmMain {
    static Scanner sc = new Scanner(System.in);
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        filmDLL film = new filmDLL();
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            Film newFilm;
            int idx;

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data film posisi awal");
                    newFilm = add();
                    film.addFirst(newFilm);
                    break;

                case 2:
                    System.out.println("Masukkan Data Posisi Terakhir");
                    newFilm = add();
                    film.addLast(newFilm);
                    break;

                case 3: 
                    System.out.println("Masukkan Data Film Urutan Ke-");
                    newFilm = add();
                    System.out.println("Data Film ini akan masuk di urutan ke- ");
                    int index = sc.nextInt();
                    film.add(newFilm, index-1);
                    break;
                
                case 4:
                    film.removeFirst();
                    break;

                case 5: 
                    film.removeLast();
                    break;

                case 6:
                    System.out.println("Masukkan ID data yang akan dihapus: ");
                    int indeks = sc.nextInt();
                    film.remove(indeks);
                    break;

                case 7: 
                    film.print();
                    break;

                case 8:
                    System.out.println("Masukkan ID Film yang dicari: ");
                    int id = sc.nextInt();
                    film.cariId(id);
                    break;

                case 9:
                    System.out.println("Urutan Film berdasarkan Rating");
                    film.bubbleSortRating();
                    film.print();
                    break;

                case 10: 
                    break;

                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5|| pilih == 6 || pilih == 7|| pilih == 8 || pilih == 9);
    }

    public static void menu(){
        System.out.println("=================================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("=================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data AKhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("=================================");
    }
    
    public static Film add(){
        System.out.println("ID Film: ");
        int id = sc.nextInt();
        System.out.println("Judul Film: ");
        String judul = input.nextLine();
        System.out.println("Rating Film: ");
        double rating = sc.nextDouble();

        return new Film(id, judul, rating);
    }
}