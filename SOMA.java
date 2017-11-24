package SOAM;

import java.util.Scanner;
public class SOMA {

	public static void main(String[] args) {
	Scanner L = new Scanner (System.in);
	int soma=0; 
	int num;
	
	System.out.print("Qual o número a introduzir?");
	num = L.nextInt();
	
	for(int I=1 ; I <= num ; I++)
	soma +=I;
	

	System.out.println(soma);
	}

}
