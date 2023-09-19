import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite o saldo atual.");
        double saldoAtual = scanner.nextDouble();
        System.out.println("Por favor digite o valor de deposito.");
        double valorDeposito = scanner.nextDouble();
        System.out.println("Por favor digite o valor de saque.");
        double valorRetirada = scanner.nextDouble();

        double valorAtual = saldoAtual + valorDeposito - valorRetirada;

        System.out.printf("Saldo atualizado na conta: %.1f ",(valorAtual) );
       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.

     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
     scanner.close();
    }
    
}