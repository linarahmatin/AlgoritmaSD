package PERTEMUAN5;
public class Latprak {
    Latprak[] mobils;
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;
    
    public Latprak(Latprak[] mobils) {
        this.mobils = mobils;
    }
    
    public Latprak(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    } 

    public int cariMaxAcceleration() {
        return cariMaxAcceleration(0, mobils.length - 1);
    }

    private int cariMaxAcceleration(int left, int right) {
        if (left == right) {
            return mobils[left].top_acceleration;
        }
        
        int mid = (left + right) / 2;
        int maxLeft = cariMaxAcceleration(left, mid);
        int maxRight = cariMaxAcceleration(mid + 1, right);
        
        return Math.max(maxLeft, maxRight);
    }

    public int cariMinAcceleration() {
        return cariMinAcceleration(0, mobils.length - 1);
    }

    private int cariMinAcceleration(int left, int right) {
        if (left == right) {
            return mobils[left].top_acceleration;
        }
        
        int mid = (left + right) / 2;
        int minLeft = cariMinAcceleration(left, mid);
        int minRight = cariMinAcceleration(mid + 1, right);
        
        return Math.min(minLeft, minRight);
    }

    public double hitungRerataPower() {
        double totalPower = 0;
        for (Latprak mobil : mobils) {
            totalPower += mobil.top_power;
        }
        return totalPower / mobils.length;
    }

}