package UTS;
import java.util.Scanner;
public class PencarianUts {
    public int findSeqSearch(int[] angka, int angkaDicari) {
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == angkaDicari) {
                return i; 
            }
        }
        return -1; 
    }

    public void printSearchResult(int index, int angkaDicari) {
        if (index != -1) {
            System.out.println("Elemen " + angkaDicari + " ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Elemen " + angkaDicari + " tidak ditemukan dalam array.");
        }
    }

    public static void main(String[] args) {
        int angka[] = {22, 36, 5, 19, 9, 20, 9, 18, 0, 46, 11, 27, 9, 0, 45, 33, 1};

        PencarianUts searchUtil = new PencarianUts();
        System.out.println("Pencarian dengan Sequential Search");
        System.out.println("Data:");
        searchUtil.printArray(angka);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        int angkaDicari = sc.nextInt();

        int index = searchUtil.findSeqSearch(angka, angkaDicari);
        searchUtil.printSearchResult(index, angkaDicari);
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
