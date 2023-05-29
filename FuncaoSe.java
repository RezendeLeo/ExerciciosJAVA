import java.util.Scanner;

public class FuncaoSe {

    public static void main(String[] args) {
    int num=0;
    Scanner alfredo = new Scanner(System.in);
    
    System.out.println("Digite a nota do Aluno: ");
    num = alfredo.nextInt();
    
    if (num < 7) {
    System.out.println("\nAluno Reprovado! ");
    } else {
    System.out.println("\nAluno Aprovado!");
    }
    alfredo.close();

 }    
}









