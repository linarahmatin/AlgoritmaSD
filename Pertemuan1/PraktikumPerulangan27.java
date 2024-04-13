import java.util.Scanner;

public class PraktikumPerulangan27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nim : ");
        String nim = scanner.nextLine();
        System.out.println("---------------------------------");
        
        int n = nim.length();
        System.out.println("n : " + n);
        
        for (int i = 2; i <= n; i += 2) {
            System.out.print("* " + i + " ");
        }
    }
}
