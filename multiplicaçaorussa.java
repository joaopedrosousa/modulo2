package multiplicaçaorussa;
import java.util.Scanner;
public class multiplicaçaorussa {
    public static void main(String[] args) {
  
    	  int M , m , m1 , M1 , r=0 ;
          Scanner dados=new Scanner(System.in);
          System.out.print("Qual é o multiplicando ? ");
          m=dados.nextInt();
          System.out.print("Qual é o multiplicador ? ");
          M=dados.nextInt();
      m1=m;
      M1=M;
           System.out.print(m + "\t"); 
           System.out.print(M + "\n");         
          while (m1>1){
           m1=m1/2;
           System.out.print(m1 + "\t"); 
              M1=M1*2;
      System.out.print(M1 + "\n"); 
          if (m1%2!=0)
              r=r+M1;
          }
          if(M%2!=0){
           r=r+M; 
           }
       System.out.print("O resultado é " + r);  
      }

  }