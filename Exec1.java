import java.util.Scanner;

public class Exec1
{
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Por favor informe um numero inteiro");
            int numero1 = s.nextInt();
            
                 if (numero1 % 2 == 0)
                 {
                     System.out.println(numero1 + " e par");
                     
                 }
                 else
                 {
                     System.out.println(numero1 + " e impar");
                 }    
        }                                   
}        