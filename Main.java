import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = scanner.nextInt();

        System.out.println("Selecione uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Resultado: " + (num1 + num2));
        } 
        else if (opcao == 2) {
            System.out.println("Resultado: " + (num1 - num2));
        } 
        else if (opcao == 3) {
            System.out.println("Resultado: " + (num1 * num2));
        } 
        else if (opcao == 4) {
            System.out.println("Resultado: " + (num1 / num2));
        } 
        else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }
}