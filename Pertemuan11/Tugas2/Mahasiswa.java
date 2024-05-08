package Tugas2;

public class Mahasiswa {
    int nim;
    String nama;

    public Mahasiswa(int nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String toString() {
        return "Mhs{" +
                "nim=" + nim +
                ", nama='" + nama + '\'' +
                '}';
    }
}

