public class Exercicio04 {
    public static void executar(){
        double[] vetor = new double[5];
        double n = Prompt.lerDecimal("Digite um valor para N: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerDecimal("Digite um número: ");
        }
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i]<n){
                Prompt.imprimir(i+" < " +n);
            }
        }

    }

}
