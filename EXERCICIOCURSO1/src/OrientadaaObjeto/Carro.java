package OrientadaaObjeto;

/**
 * Representa um carro com um motor, permitindo ações como acelerar, frear, ligar e desligar.
 */
public class Carro {
    public Motor motor = new Motor();
    
    // Método auxiliar para arredondar
    private double arredondar(double valor) {
        return Math.round(valor * 10.0) / 10.0;
    }
    
    /**
     * Aumenta o fator de injeção do motor em 0.4 para simular a aceleração.
     * O valor é arredondado para uma casa decimal.
     */
    void acelerar() {
        motor.fatorInjecao += 0.4;
        motor.fatorInjecao = arredondar(motor.fatorInjecao);  // ✅ Arredonda o valor real
        System.out.printf("Acelerando! Fator injeção: %.1f\n", motor.fatorInjecao);
    }

    /**
     * Diminui o fator de injeção do motor em 0.4 para simular a frenagem.
     * O valor mínimo é 0 e é arredondado para uma casa decimal.
     */
    void frear() {
        motor.fatorInjecao -= 0.4;
        motor.fatorInjecao = Math.max(motor.fatorInjecao, 0);
        motor.fatorInjecao = arredondar(motor.fatorInjecao);  // ✅ Arredonda o valor real
        System.out.printf("Freando! Fator injeção: %.1f\n", motor.fatorInjecao);
    }

    /**
     * Liga o motor do carro, definindo o estado como ligado e o fator de injeção como 1.0.
     */
    void ligar() {
        motor.ligado = true;
        motor.fatorInjecao = 1.0;  // ✅ Já arredondado
        System.out.println("Carro ligado!");
    }

    /**
     * Desliga o motor do carro, definindo o estado como desligado.
     * O fator de injeção é redefinido para 1.0.
     */
    void desligar() {
        motor.ligado = false;
        motor.fatorInjecao = 1.0;  // ✅ Já arredondado
        System.out.println("Carro desligado!");
    }

    /**
     * Verifica se o carro está ligado.
     *
     * @return {@code true} se o motor estiver ligado, {@code false} caso contrário.
     */
    boolean estaLigado() {
        return motor.ligado;
    }
}