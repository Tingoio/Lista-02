public class Exercicio12 {
    public static void executar(){
        double[] vetor = new double[12];
        double produto = 1;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerDecimal("Preencha o vetor: ");
            if(vetor[i]>0&&vetor[i] % 2 == 0){
                produto = produto * vetor[i];
            }
        }
        Prompt.imprimir("Produto do elementos positivos: "+produto);
    }
}
