package Calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma,
 * subtração, multiplicação e divisão, além de um método principal
 * que seleciona a operação desejada com base em um operador informado
 * pelo usuário.</p>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando a
 * criação de testes unitários.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class Calculadora {

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma entre {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da subtração entre {@code a} e {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da multiplicação entre {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * <p>Divide dois números inteiros.</p>
     *
     * <p><strong>Atenção:</strong> divisão por zero não é permitida e resultará
     * em uma exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da divisão entre {@code a} e {@code b}
     * @throws IllegalArgumentException se {@code b} for igual a zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática desejada com base no operador informado.</p>
     *
     * <p><strong>Operadores aceitos:</strong></p>
     * <ul>
     *     <li>"+" → Soma</li>
     *     <li>"-" → Subtração</li>
     *     <li>"*" → Multiplicação</li>
     *     <li>"/" → Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resultará em exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador invalido: " + operador);
        };
    }
}
