import java.util.Scanner;

public class Tugas227 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Hitung jarak");
        System.out.println("2. Hitung Kecepatan");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih menu (1/2/3): ");
        int menu =input.nextInt();

        switch (menu) {
            case 1:
                hitungKecepatan();
                break;
            case 2:
                hitungJarak();
                break;
            case 3:
                hitungWaktu();
                break;
            default:
                System.out.println("Menu tidak valid.");
        }
    }

    static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jarak (s): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v): " + kecepatan);
    }

    static void hitungJarak() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s): " + jarak);
    }

    static void hitungWaktu() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t): " + waktu);
    }
}

