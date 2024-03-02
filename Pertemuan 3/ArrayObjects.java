import java.util.Scanner;
public class ArrayObjects {
    public static class PersegiPanjang {
        public int panjang;
        public int lebar;
        }
        public static void main(String[] args) {

            PersegiPanjang[] ppArray = new PersegiPanjang[3];

            try (Scanner in = new Scanner(System.in)) {
                for (int i = 0; i < 3; i++)
                {
                    
                    ppArray[i] = new PersegiPanjang(); 
                    System.out.println("Persegi panjang ke-" + i);
                    System.out.print("Masukkan panjang: "); 
                    ppArray[i].panjang = in.nextInt();
                    System.out.print("Masukkan lebar: ");
                    ppArray[i].lebar = in.nextInt();
}
            }

            for (int i = 0; i < 13; i++)
{
                    System.out.println("Persegi Panjang ke-" + i );
                    System.out.println("Panjang: " + ppArray[i].panjang + ", lebar:" + ppArray[i].lebar);
    }
}
}

    



