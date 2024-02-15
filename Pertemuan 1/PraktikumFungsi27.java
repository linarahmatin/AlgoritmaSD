    import java.util.Scanner;
    public class PraktikumFungsi27 {
            static final int AGLONEMA_PRICE = 75000;
            static final int KELADI_PRICE = 50000;
            static final int ALOCASIA_PRICE = 60000;
            static final int MAWAR_PRICE = 10000;
        
            public static void main(String[] args) {
                int[][] stocks = {
                    {10, 5, 15, 7},
                    {6, 11, 9, 12},
                    {2, 10, 10, 5},
                    {5, 7, 12, 9}
                };
        
                // Deducting dead flowers from stock
                stocks[0][0] -= 1; // Aglonema
                stocks[0][1] -= 2; // Keladi
                stocks[0][3] -= 5; // Mawar
        
                displayIncome(stocks);
                displayStock(stocks);
            }
        
            static void displayIncome(int[][] stocks) {
                for (int i = 0; i < stocks.length; i++) {
                    int income = (stocks[i][0] * AGLONEMA_PRICE) + (stocks[i][1] * KELADI_PRICE)
                                 + (stocks[i][2] * ALOCASIA_PRICE) + (stocks[i][3] * MAWAR_PRICE);
                    System.out.println("Pendapatan untuk RoyalGarden " + (i + 1) + ": " + income);
                }
            }
        
            static void displayStock(int[][] stocks) {
                int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;
        
                for (int i = 0; i < stocks.length; i++) {
                    totalAglonema += stocks[i][0];
                    totalKeladi += stocks[i][1];
                    totalAlocasia += stocks[i][2];
                    totalMawar += stocks[i][3];
                }
        
                System.out.println("Total stok Aglonema: " + totalAglonema);
                System.out.println("Total stok Keladi: " + totalKeladi);
                System.out.println("Total stok Alocasia: " + totalAlocasia);
                System.out.println("Total stok Mawar: " + totalMawar);
            }
        }
        