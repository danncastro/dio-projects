package controle_fluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {        
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            }catch (ParametrosInvalidosException e) {
            }
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            System.out.println(" O segundo parametro deve ser maior que o primeiro");
        }
        for (int contagem = 1; contagem < ((parametroDois + 1) - parametroUm); contagem++){
        System.out.println("Imprimindo o número " + contagem);
        }
    }
}