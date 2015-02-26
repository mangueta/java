import java.util.Scanner;

public class Exec2
{
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Por favor informar um numero");
            int numero1 = s.nextInt();
            
            if (numero1 < 0)
            {
                System.out.println(numero1 + " e invalido");
            }
            else if (numero1 % 2 ==0)
            {
                System.out.println(numero1 + " e um numero par");
            }
            else
            {
                System.out.println(numero1 + " e um numero impar");
            }
            System.out.println("Por favor digita um numero diferente de zero");
            int numero2 = s.nextInt();
            
            if (numero2 % 2 == 0)
                {
                    System.out.println(numero2 + " e um numero par");
                }
            else
                {
                    System.out.println(numero2 + " e um numero impar");    
                }
        }
}        