
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a nota prova 1 ");
        double nota1 = s.nextDouble();
        System.out.println("Digite a nota prova 2 ");
        double nota2 = s.nextDouble();
        System.out.println("Digite a nota prova 3 ");
        Double nota3 = s.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
    if(media >= 5)  
        System.out.println("Parabens voce foi aprovado !"); 
    }
    
}
    

