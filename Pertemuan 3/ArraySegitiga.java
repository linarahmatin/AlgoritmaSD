public class ArraySegitiga {
        public static void main(String[] args) {
            Segitiga[] sgArray = new Segitiga[4];
            sgArray[0] = new Segitiga(10, 4);
            sgArray[1] = new Segitiga(20, 10);
            sgArray[2] = new Segitiga(15, 6);
            sgArray[3] = new Segitiga(25, 10);
    
            for(int i = 0; i < 4; i++){
                System.out.println("Segitiga ke-"+ i + ", Luas permukaan: " + sgArray[i].hitungLuas() + ", Keliling: " + sgArray[i].hitungKeliling());
            }
            
        }
    }

