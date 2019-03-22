package hospital;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		Pacientes p1 = new Pacientes();
		
		System.out.print("Nome: ");
		p1.nome = e.nextLine();
		System.out.print("Idade: ");
		p1.idade = e.nextInt();

		double[] f = p1.freqMinMax();
		
		System.out.println("Min: "+f[0]);
		System.out.println("Máx: "+f[1]);
		
		e.close();

	}

}
