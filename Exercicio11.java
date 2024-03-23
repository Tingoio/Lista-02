public class Exercicio11 {
    public static void executar(){
        double[] vetorA = new double[5];
        double[] vetorB = new double[5];
        double produto = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerDecimal("Preencha o primeiro vetor: ");
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerDecimal("Preencha o segundo vetor: ");
        }
        for (int i = 0; i < vetorB.length; i++) {
            produto += (vetorA[i] * vetorB[i]);
        }
        Prompt.imprimir("Produto escalar: "+produto);
    }
}
