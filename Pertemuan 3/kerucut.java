public class kerucut { 

      
                public double jariJari;
                public double sisiMiring;
                public double tinggi;
        
                double hitungLuasPermukaanKerucut(){
                    return 3.14 * jariJari * sisiMiring * (jariJari * sisiMiring);
                }
        
                void hitungTinggi(){
                    tinggi = Math.sqrt((sisiMiring * sisiMiring)-(jariJari * jariJari));
                }
        
                double hitungVolumeKerucut(){
                    hitungTinggi();
                    return 3.14 * jariJari * jariJari * tinggi/3;
                }
        
}

       