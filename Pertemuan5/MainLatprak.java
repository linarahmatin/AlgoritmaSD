import PERTEMUAN5.Latprak;
public class MainLatprak {
        public static void main(String[] args) {
           Latprak[] mobils = {
                    new Latprak("BMW", "M2 Coupe", 2016, 6816, 728),
                    new Latprak("Ford", "Fiesta ST", 2014, 3921, 575),
                    new Latprak("Nissan", "370Z", 2009, 4360, 657),
                    new Latprak("Subaru", "BRZ", 2014, 4058, 609),
                    new Latprak("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                    new Latprak("Toyota", "AE86 Trueno", 1986, 3700, 553),
                    new Latprak("Toyota", "86/GT86", 2014, 4180, 609),
                    new Latprak("Volkswagen", "Golf GTI", 2014, 4180, 631)
            };
    
            Latprak showroom = new Latprak(mobils);
    
            // A. Mencari top acceleration tertinggi
            int maxAcceleration = showroom.cariMaxAcceleration();
            System.out.println("Top Acceleration Tertinggi adalah: " + maxAcceleration);
    
            // B. Mencari top acceleration teredndah
            int minAcceleration = showroom.cariMinAcceleration();
            System.out.println("Top Acceleration Terendah adalah: " + minAcceleration);
    
            // C. Menghitung rata-rata top power
            double averagePower = showroom.hitungRerataPower();
            System.out.println("Rata-rata Top Power adalah: " + averagePower);
        }
    }

