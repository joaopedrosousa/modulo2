package multiplica�aorussa;
import java.util.Scanner;
public class multiplica�aorussa {
    public static void main(String[] args) {
  
        int M , m = 0, m1 , M1 , r;
        Scanner dados=new Scanner(System.in);
        System.out.print("Qual � o multiplicando?");
        m=dados.nextInt();
        System.out.print("Qual � o multiplicador?");
        M=dados.nextInt();
        while (m>1) {
        m=m/2;
        System.out.print(m + "\n");
        
        }
    }    
}