import java.util.Scanner;

public class ativi{ 
  public static void main(String[] args) {
    System.out.println("Olá, digite um número inteiro de um a cinco:");
    
    Scanner leia = new Scanner(System.in);
    
    int numero = leia.nextInt();
    
    /* case é tipo se esse número for selecionado mande tal coisa
       e default é se nenhum dos casos for selecionados
    
    */
    switch (numero){
      case 1:
      System.out.print("Número um foi digitado...");
      break;

      case 2:
      System.out.print("Número dois foi digitado...");
      break;

      case 3:
      System.out.print("Número três foi digitado...");
      break;

      case 4:
      System.out.print("Número quatro foi digitado...");
      break;

      case 5:
      System.out.print("Número cinco foi digitado...");
      break;

      default:
      System.out.print("Número inválido");
      break;
    }
  }
}