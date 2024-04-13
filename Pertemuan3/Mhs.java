public class Mhs {
    public String nama;
    public int nim;
    public char jK;
    public double ipk;

    double hitungRataRata(Mhs[] mahasiswa) {
        double total = 0;
        for (int i = 0; i < 3; i++) {
            total += mahasiswa[i].ipk;
        }
        return total / 3;
    }

    double cariIpkTerbesar(Mhs[] mahasiswa) {
        double besar = mahasiswa[0].ipk;
        for (int i = 0; i < 3; i++) {
            if (mahasiswa[i].ipk > besar) {
                besar = mahasiswa[i].ipk;
            }
        }
        return besar;
    }

    void tampilData(Mhs[] mahasiswa) {
        System.out.print("\n");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------------------");
            System.out.println("Data mahasiswa Ke-"+ (i+1));
            System.out.println("nama          : "+ mahasiswa[i].nama +"\nnim           : "+ mahasiswa[i].nim +"\nJenis kelamin : "+ mahasiswa[i].jK + "\nNilai IPK     : "+ mahasiswa[i].ipk);
        }
    }
}