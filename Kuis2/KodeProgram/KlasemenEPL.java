package KodeProgram;
import java.util.Scanner;

public class KlasemenEPL {

    public static class Node {
        public String klub;
        public int Team;
        public int menang;
        public int seri;
        public int kalah;
        public int poin;
        public Node next;
        public Node prev;

        public Node(String klub, int Team, int menang, int seri, int kalah, int poin) {
            this.klub = klub;
            this.Team = Team;
            this.menang = menang;
            this.seri = seri;
            this.kalah = kalah;
            this.poin = poin;
            this.next = null;
            this.prev = null;
        }
    }

    public static class DoubleLinkedList {
        private Node head;
        private Node tail;

        public DoubleLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertAtHead(String klub, int Team, int menang, int seri, int kalah, int poin) {
            Node newNode = new Node(klub, Team, menang, seri, kalah, poin);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        public void printList() {
            if (head == null) {
                System.out.println("Klasemen EPL 2024 kosong!");
                return;
            }

            Node current = head;
            int rank = 1;
            System.out.println("======================================================");
            System.out.println("|   Posisi  | Klub  | T | M  | K  | S | Poin         |");
            System.out.println("======================================================");

            while (current != null) {
                String rankStr = String.format("%3d", rank);
                String TeamStr = String.format("%3d", current.Team);
                String menangStr = String.format("%3d", current.menang);
                String kalahStr = String.format("%3d", current.kalah);
                String seriStr = String.format("%3d", current.seri);
                String poinStr = String.format("%3d", current.poin);

                System.out.printf("| %7s | %-10s | %3s |%3s | %3s | %3s | %3s |\n",
                        rankStr, current.klub,TeamStr, menangStr, seriStr, kalahStr, poinStr);

                rank++;
                current = current.next;
            }
            System.out.println("======================================================");
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList klasemen = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nMenu Klasemen EPL:");
            System.out.println("1. Input Data Tim");
            System.out.println("2. Tampilkan Klasemen");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda (1-3): ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    String[] klubList = {
                            "Man City", "Arsenal", "Liverpool", "AstonVila", "Tottenham",
                            "Chealsea", "Newcastle", "Man Utd", "West Ham", "Crytal",
                            "Brighton", "Bournem", "Fulham", "Wolfes", "Everton",
                            "Brentford", "Nottingham", "Luton", "Burnley", "Sheff Utd"
                    };

                    for (String klub : klubList) {
                        System.out.println("\nInput Data untuk " + klub + ": ");
                        System.out.print("Menang: ");
                        int menang = sc.nextInt();
                        System.out.print("Seri: ");
                        int seri = sc.nextInt();
                        System.out.print("Kalah: ");
                        int kalah = sc.nextInt();

                        int poin = menang * 3 + seri; 
                        klasemen.insertAtHead(klub, 38, menang, seri, kalah, poin);
                    }
                    break;
                case 2:
                    klasemen.printList();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan Klasemen EPL!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 20);
    }
}