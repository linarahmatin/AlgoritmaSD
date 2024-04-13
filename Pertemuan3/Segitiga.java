public class Segitiga {
    public int alas;
    public int tinggi;
    public double sisiMiring;

    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
    double hitungLuas(){
        return alas * tinggi / 2;
    }

    double cariSisiMiring(){
        sisiMiring = Math.sqrt((alas * alas)+ (tinggi * tinggi));
        return sisiMiring;
    }

    double hitungKeliling(){
        return alas + tinggi + sisiMiring;
    }
}
    

