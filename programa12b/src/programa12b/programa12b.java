package programa12b;

import java.util.Scanner;

public class programa12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prom, clientes, minutos, totMin=0;
		int i=1, p1=0,p2=0;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el numero de clientes: ");
		clientes = leer.nextDouble();
		do {
			System.out.print("Ingrese los minutos: " );
			minutos=leer.nextDouble();
			totMin+=minutos;
			i++;
	}while (i<=clientes);
		if (minutos>=100)
			p1++;
		if (minutos<=100)
			p2++;
		prom=(totMin/clientes);
		System.out.println("El total de minutos es: "+totMin);
		System.out.println("El consumo promedio es: "+prom);
		System.out.println("Los clientes que consumen mas de 100 minutos son: "+p1);
		System.out.println("Los clientes que consumen menos de 100 minutos son: "+p2);
	}

}
