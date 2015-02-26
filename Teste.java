import java.util.Scanner;

public class Teste
{
	public static void main(String[] args)
	{
		Scanner pegarDadosTeclado = new Scanner(System.in);
		System.out.print("Informe um numero inteiro maior que zero:");
		int numero1 = pegarDadosTeclado.nextInt();
		
		if (numero1 < 0)
		{
			System.out.println(numero1 + " eh um numero invalido!");
		}
		else if (numero1 % 2 == 0) // se o resto da divisão por 2 for igual a 0 então....
		{
			System.out.println(numero1 + " eh par!");
		}
		else //se não....
		{
			System.out.println(numero1 + " eh impar!");
		}
	}
}