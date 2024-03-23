public class Exercicio14 {
    public static void executar(){
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerDecimal("Preencha o vetor: ");
        }
        double maior = vetor[0];
        int indiceMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                indiceMaior = i;
            }
        }
        double temp = vetor[indiceMaior];
        vetor[indiceMaior] = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = temp;

        for (int k = 0; k < vetor.length; k++) {
            Prompt.imprimir("Atualizado: "+vetor[k]);
        }
    }
}