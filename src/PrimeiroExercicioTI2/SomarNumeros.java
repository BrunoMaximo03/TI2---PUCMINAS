package PrimeiroExercicioTI2;
import java.util.Scanner;
public class SomarNumeros {
	public static void main(String[] args) {
		int numero1, numero2, soma = 0;
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("Informe o primeiro valor");
		numero1 = entrada.nextInt();
		
		System.out.println("Informe o segundo valor");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("O valor da soma do numero " + numero1 + " + o numero " + numero2 + " eh = " + soma);
	}

}
