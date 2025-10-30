package OrientadaaObjeto;

import java.util.HashSet;

/**
 * Um exemplo simples que demonstra o uso da classe HashSet.
 */
public class HashSetExemplo {
    /**
     * Demonstra o uso básico de um HashSet.
     * <p>
     * O programa cria um HashSet de Strings, adiciona alguns elementos,
     * e imprime o tamanho do conjunto e se ele contém elementos específicos.
     * </p>
     *
     * @param args Argumentos da linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Criando um HashSet de Strings
        HashSet<String> conjunto = new HashSet<>();

        // Adicionando elementos
        conjunto.add("3.8");
        conjunto.add("C");
        conjunto.add("Melancia");
         conjunto.add("Allan viado");
        // Mostrando o tamanho
        System.out.println("Tamanho do conjunto: " + conjunto.size());

        // Verificando se contém "C"
        System.out.println("conjunto.contains(\"C\"): " + conjunto.contains("C"));
          System.out.println("conjunto.contains(\"C\"): " + conjunto.contains("Allan viado"));
            System.out.println("Allan Viado");
    }
}
