import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("\n1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nOpção 1 selecionada.");
                    break;
                case 2:
                    System.out.println("\nOpção 2 selecionada.");
                    break;
                case 3:
                    System.out.println("\nOpção 3 selecionada.");
                    break;
                default:
                    System.out.println("\nOpção inválida. Digite uma opção válida.");
                    break;
            }
        } while (opcao < 1 || opcao > 3);
        
        scanner.close();
    }
}
