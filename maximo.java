package maximo;

import java.util.Scanner;

public class maximo {

	private static Scanner ler;

	public static void main(String[] args) {
	ler = new Scanner (System.in);
    double n1,n2,n3;
    double max= 0;
    
    System.out.println("Qual o primeiro n�mero?");
	n1= ler.nextDouble();
	
	System.out.println("Qual o segundo n�mero?");
	n2= ler.nextDouble();
	
	System.out.println("Qual o terceiro n�mero?");
	n3= ler.nextDouble();

	if(n1>n2 && n1>n3);
	max = n1;
    
    if(n2>n1 && n2>n3);
    max= n2;
    
    if(n3>n1 && n3>n2);
    max= n3;
    System.out.println("O maior n�mero �"+ max);
	}

}
