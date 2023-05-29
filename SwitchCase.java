import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione uma opção:");
        System.out.println("1 - Opção 1");
        System.out.println("2 - Opção 2");
        System.out.println("3 - Opção 3");
        System.out.print("Opção: ");
        opcao = scanner.nextInt();
        scanner.close();

        switch (opcao) {
            case 1:
                System.out.println("Opção 1 selecionada.");
                break;
            case 2:
                System.out.println("Opção 2 selecionada.");
                break;
            case 3:
                System.out.println("Opção 3 selecionada.");
                break;
            default:
                System.out.println("Opção inválida. Digite uma opção válida.");
                break;
        }
    }
}



