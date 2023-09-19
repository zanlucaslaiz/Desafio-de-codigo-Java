import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        for(int i = 1; i < periodo + 1; i++){
            valorFinal = valorFinal + (valorFinal * taxaJuros);
        }


        System.out.printf("Valor final do investimento: R$ %.2f", (valorFinal));
        
        scanner.close();
    }
}