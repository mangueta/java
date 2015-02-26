import java.util.Scanner;  
public class Ex14 {  
  public static void main (String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Digite nota1 para calcular media: ");
     float nota1 = s.nextFloat();
    System.out.println("Digite nota2 para calcular media: ");
     float nota2 = s.nextFloat();
    System.out.println("Digite nota3 para calcular media: ");
     float nota3 = s.nextFloat();
     float media = (nota1 + nota2 + nota3) /3;   
    System.out.println(media);
  }
}	
