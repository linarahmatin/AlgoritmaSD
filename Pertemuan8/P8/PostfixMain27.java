package P8;
import java.util.Scanner;
public class PostfixMain27 {

    public static void main(String[] args) { 
        Scanner sc27 = new Scanner(System.in);  
        String P, Q;  
        System.out.println("Masukkan ekspresi matematika (infix) : ");  
        Q = sc27.nextLine();  
        Q = Q.trim(); 
        Q = Q + ")";  

       int total = Q.length();
       PostFix27 post = new PostFix27(total);  
       P = post.konversi(Q);  
       System.out.println("Postfix: " + P ) ;
    }
}
      

