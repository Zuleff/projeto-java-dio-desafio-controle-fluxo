import java.util.Scanner;

/**
 * @author Luiz Vieira
 * @since 11/06/2024
 * @version 1.0
 */

public class Contador {

    public static void main(String[] args) {
        Scanner entradaInformacoes = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        Integer primeiroValor = entradaInformacoes.nextInt();

        System.out.println("Digite o segundo parâmetro");
        Integer segundoValor = entradaInformacoes.nextInt();

        try {

            contar(primeiroValor, segundoValor);

        } catch (ParametrosInvalidosException exception) {
            exception.printStackTrace();

        }
        entradaInformacoes.close();

    }

    /**
     * 
     * @param primeiroValor primeiro valor inserido pelo usuário
     * @param segundoValor  segundo valor inserido pelo usuário
     * @throws ParametrosInvalidosException exceção criada caso os paramêtros sejam
     *                                      inválidos
     */
    static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException {

        if (primeiroValor > segundoValor) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        } else {
            Integer contagem = segundoValor - primeiroValor;
            for (int numeroAtual = 1; numeroAtual <= contagem;) {
                System.out.println("Imprimindo o número: " + numeroAtual++);

            }

        }

    }
}
