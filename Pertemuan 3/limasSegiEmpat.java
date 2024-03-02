public class limasSegiEmpat {
    
            public double panjangSisiAlas;
            public double tinggiLimas;
            public double sisiMiring;
            public double luasSegitiga;
        
            void hitungSisiMiring(){
                sisiMiring = Math.sqrt((panjangSisiAlas/2 * panjangSisiAlas/2) + (tinggiLimas * tinggiLimas));
            }
        
            void luasSegitiga(){
                hitungSisiMiring();
                luasSegitiga = sisiMiring * panjangSisiAlas / 2;
            }
        
            double hitungLuasPermukaanLimas(){
                luasSegitiga();
                return panjangSisiAlas * panjangSisiAlas + (4 * luasSegitiga);
            }
        
            double hitungVolumeLimas(){
                return (panjangSisiAlas * panjangSisiAlas) * tinggiLimas / 3;
            }
    }