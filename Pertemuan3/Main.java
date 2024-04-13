import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("====================  Bangun Ruang Kerucut ====================");
        System.out.print("Masukkan jumlah kerucut: ");
        int i = sc.nextInt();
        kerucut[] kerucut = new kerucut[i];

       for(int j = 0; j < i; j++) {
            kerucut[j] = new kerucut();
            System.out.println("kerucut ke-" + j);
            System.out.print("Masukkan jari-jari:"); 
            kerucut[j].jariJari = input.nextDouble();
            System.out.print("Masukkan Sisi Miring: ");
            kerucut[j].sisiMiring = input.nextDouble();
        }

        for(int k = 0; k < i; k++){
            System.out.println("Kerucut ke-" + i + ", Luas Permukaan: " + kerucut[k].hitungLuasPermukaanKerucut() + ", Volume: " + kerucut[k].hitungVolumeKerucut());
        }

        System.out.println("====================  Bangun Ruang Limas Segi Empat ====================");
        System.out.print("Masukkan jumlah limas segi empat: ");
        int l = sc.nextInt();
        limasSegiEmpat [] limas = new limasSegiEmpat[i];

        for(int m = 0; m < l; m++){
            limas[m] = new limasSegiEmpat();
            System.out.println("Limas segi empat ke-" + m);
            System.out.print("Masukkan Panjang sisi alas: ");
            limas[m].panjangSisiAlas = input.nextDouble();
            System.out.print("Masukkan Tinggi Limas: ");
            limas[m].tinggiLimas = input.nextDouble();
        }

        for(int n = 0; n < l; n++){
            System.out.println("Limas Segi Empat ke-" + i + ", Luas Permukaan: " + limas[n]. hitungLuasPermukaanLimas() + ", Volume: " + limas[n].hitungVolumeLimas());
        }

        System.out.println("====================  Bangun Ruang Bola ====================");
        System.out.print("Masukkan jumlah bola: ");
        int x = sc.nextInt();
        Bola[] ball = new Bola[x];

        for(int y = 0; y < x; y++){
            ball[y] = new Bola();
            System.out.println("Bola ke-" + y);
            System.out.print("Masukkan Jari-jari: ");
            ball[y].jarijari = input.nextDouble();
        }

        for(int z = 0; z < x; z++){
            System.out.println("Bola ke-" + i + ", Luas Permukaan: " + ball[z].hitungLuasPermukaanBola() + ", Volume: " + ball[z].hitungVolumeBola());
        }
    }
}