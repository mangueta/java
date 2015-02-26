import java.util.Scanner;

public class Exec4
{
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            String nome;
            System.out.println("Qual seu nome?");            
            nome = s.nextLine();
            
            String sexo;
            System.out.println("Qual seu sexo?");
            sexo = s.nextLine();
            
            String masculino;
            String feminino;
                      
            if (sexo.equals("masculino")){   
            masculino = "Ilmo. Sr.";    
            System.out.println(masculino+" "+nome);
            }else{ 
            feminino = "Ilma. Sra.";
            System.out.println(feminino+" "+nome);
            }
        }
}        