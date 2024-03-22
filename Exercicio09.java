public class Exercicio09 {
    public static void executar(){
        double[] vetorA = new double[5];
        double[] vetorB = new double[5];
        double[] vetorC = new double[5];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Prompt.lerDecimal("Digite o valor da posição "+i+" do vetor A: ");
        }
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = Prompt.lerDecimal("Digite o valor da posição "+i+" do vetor B: ");
        }
        for (int i = 0; i < vetorB.length; i++) {
            if(i % 2 == 0){
                vetorC[i] = vetorA[i];
            }
            else{
                vetorC[i] = vetorB[i];
            }
        }
        for(int i = 0; i < vetorC.length; i++){
            Prompt.imprimir(vetorC[i]);
        }
    }
}
