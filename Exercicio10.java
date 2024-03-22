public class Exercicio10 {
    public static void executar(){
        double[] vetorA = new double[5];
        double[] vetorB = new double[5];

        for (int i = 0; i < vetorB.length; i++) {
            vetorA[i] = Prompt.lerDecimal("Digite um número: ");
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = vetorA[vetorA.length -1 - i];
        }
        for (int i = 0; i < vetorB.length; i++) {
            Prompt.imprimir("Vetor invertido: " + vetorB[i]);
        }
    }
}
