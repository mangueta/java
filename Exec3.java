import java.util.Scanner;

public class Exec3
{
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            
            int numero1, numero2, numero3;
                          
            System.out.println("Informe o primeiro numero:");
            numero1 = s.nextInt();
            
            System.out.println("\nInforme o segundo numero");
            numero2 = s.nextInt();
            
            System.out.println("\nInforme o terceiro numero");
            numero3 = s.nextInt();
            
        if (numero1 > numero2 && numero1 > numero3)
        {    
            System.out.println(numero1 + " e o maior"); 
            if (numero2 < numero3)
            {
                System.out.println(numero2 + " e o menor");
            }    
            else
            {
                System.out.println(numero3 + " e o menor");
            }    
        }
        else if (numero2 > numero1 && numero2 > numero3)
        {    
                System.out.println(numero2 + " eh o maior");
		if (numero1 < numero3)
		{
                System.out.println(numero1 + " e o menor");
		}
		else
		{
		System.out.println(numero3 + " e o menor");
		}    
        }
        else
        {
            System.out.println(numero3 + " e o maior");
            if (numero1 < numero2)
            {
                System.out.println(numero1 + " e o menor");
            }    
            else
            {    
                System.out.println(numero2 + " e o menor");
            }
        }    

    }   
}       