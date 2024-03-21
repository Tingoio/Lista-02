public class Exercicio03 {
    public static void executar(){
        double[] vetor = new double[5];
        double[] vetorCopia = new double[5];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Prompt.lerDecimal("Digite um número: ");
            vetorCopia[i] = vetor[i] * 2;
        }
        for(int i = 0; i < vetor.length; i++){
            Prompt.imprimir("Vetor dobrado: "+vetorCopia[i]);
        }
    }
}
