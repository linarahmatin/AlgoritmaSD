package UTS;

public class UtsMain {
    
    public static void main(String[] args) {
        int angka[] = {22, 36, 5, 19, 9, 20, 9, 18, 0, 46, 11, 27, 9, 0, 45, 33,1};
        System.out.println("Sorting dengan merge sort");
        Uts mergeSorter = new Uts(); 
        System.out.println("Data awal:");
        mergeSorter.printArray(angka);
        mergeSorter.sort(angka, 0, angka.length - 1); 
        System.out.println("Setelah diurutkan:");
        mergeSorter.printArray(angka);
    }
}
