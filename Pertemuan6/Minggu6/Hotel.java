package Minggu6;
import java.util.Scanner;
public class Hotel {
    String nama;
    String kota;
    int harga;
    byte bintang;

    public Hotel(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    
    }
    class HotelService {
        Hotel [] rooms = new Hotel [5];
        int hitung = 0;
     
        void tambah(Hotel H) {
            if (hitung < rooms.length){
                rooms [hitung] = H;
                hitung++;
            } else {
                System.out.println( "Maaf,kamar sudah penuh");
            }
        }
        
        
        void tampilAll() {
             for (Hotel room : rooms) {
                System.out.println( "Nama: " + room.nama + ", Kota: " + room.kota + ", Harga: " + room.harga + ", Bintang: " + room.bintang);
             }
        }
    
        void bubbleSortByPrice() { 
            for (int i = 0; i < hitung - 1; i++) {             
                   int idxMax = i;
                    for (int j = i; j < hitung - i - 1; j++) {
                         if (rooms[j].harga > rooms [j + 1].harga) {
                          Hotel temp = rooms[j];
                          rooms[j] = rooms [j + 1];
                          rooms [j + 1] = temp;
                }
            }
        }
    }
        void selectionSort() {
            for (int i = 0; i < hitung - 1; i++) {
                 int idxMax = i;
                 for (int j = i+1; j < hitung; j++) {
                if (rooms[j].bintang > rooms [idxMax].bintang) {
                    idxMax = j;
                }
            }
            Hotel temp = rooms [idxMax]; 
            rooms [idxMax] = rooms[i];
            rooms [i] = temp;
        }
    }
}
class MainHotel { 
    public static void main(String[] args) { 
        HotelService hotelService = new HotelService(); 
        Hotel hotel1 = new Hotel("Hotel Harris", "Malang", 500000, (byte) 4); 
        Hotel hotel2 = new Hotel("Hotel Atria", "Bandung", 300000, (byte) 3); 
        Hotel hotel3 = new Hotel("Hotel Majapahit", "Surabaya", 700000, (byte) 5); 
        Hotel hotel4 = new Hotel("Hotel Adiwana Bisma", "Yogyakarta", 400000, (byte) 2); 
        Hotel hotel5 = new Hotel("Hotel Beach", "Bali", 800000, (byte) 1); 

        hotelService.tambah(hotel1); 
        hotelService.tambah(hotel2);         
        hotelService.tambah(hotel3);       
        hotelService.tambah(hotel4);        
        hotelService.tambah(hotel5); 
 
        System.out.println("Sebelum sorting:");      
        hotelService.tampilAll(); 
 
        System.out.println("\nSetelah sorting harga:");  
        hotelService.bubbleSortByPrice();     
        hotelService.tampilAll(); 
 
        System.out.println("\nSetelah sorting bintang:");     
        hotelService.selectionSort();        
        hotelService.tampilAll(); 
    } 
} 
