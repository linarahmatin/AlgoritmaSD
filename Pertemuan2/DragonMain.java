 import java.util.Scanner;
public class DragonMain {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Masukkan nilai awal X: ");
int x = input.nextInt();
System.out.print("Masukkan nilai awal Y: ");
int y = input.nextInt();
System.out.print("Masukkan tinggi      : ");
int height = input.nextInt();
System.out.print("Masukkan lebar       : ");
int width = input.nextInt();

Dragon koor = new Dragon ();
koor.x = x;
koor.y = y;
koor.width = width;
koor.height = height;

while (x > 0 || y > 0 || x < width | y < height) {
    System.out.print("Masukkan Perintah (A/B/C/D):");
    char perintah = input.next().charAt(0);

        switch (perintah) {
            case 'A':
                koor.moveLeft();
                break;
            case 'B':
                koor.moveRight();
                break;
            case 'C':
                koor.moveUp();
                break;
            case 'D':
                koor.moveDown();
                break;
            default:
                break;
        }
        koor.printPosition();
    }
}
}
