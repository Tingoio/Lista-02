public class Exercicio08 {
    public static void executar(){
        double[] vetorA = new double[5];
        double[] vetorB = new double[5];
        double[] vetorC = new double[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerDecimal("Digite o valor da posição "+(i+1)+" do vetor A: ");
            vetorB[i] = Prompt.lerDecimal("Digite o valor da posição "+(i+1)+" do vetor B: ");
        }
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
            vetorC[i+vetorA.length] = vetorB[i];
        }
        for (int i = 0; i < vetorC.length; i++) {
            Prompt.imprimir(vetorC[i]);
            
        }
    }
}
